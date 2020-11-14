package go.g2academy.MateriJdbc.dao;

import go.g2academy.MateriJdbc.entity.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDaoJdbc {

    private Connection connection;
    private PreparedStatement insertStatement;
    private PreparedStatement updateStatement;
    private PreparedStatement deleteStatement;
    private PreparedStatement getByIdStatement;
    private PreparedStatement getAllStatement;

    private String insertQuery = "insert into T_PERSON(name, password) values (?, ?)";
    private String updateQuery = "update T_PERSON set name = ?, password = ? where id = ?";
    private String deleteQuery = "delete from T_PERSON where id = ?";
    private String getByIdQuery = "select name, password from T_PERSON where id = ?";
    private String getAllQuery = "select id, name, password from T_PERSON";

    public void setConnection(Connection connection) throws SQLException {
        this.connection = connection;
        insertStatement = this.connection.prepareStatement(insertQuery,
                Statement.RETURN_GENERATED_KEYS);
        updateStatement = this.connection.prepareStatement(updateQuery);
        deleteStatement = this.connection.prepareStatement(deleteQuery);
        getByIdStatement = this.connection.prepareStatement(getByIdQuery);
        getAllStatement = this.connection.prepareStatement(getAllQuery);
    }

    public Person save(Person p) throws SQLException {
        if(p.getId() == null){
            insertStatement.setString(1, p.getName());
            insertStatement.setString(2, p.getPassword());
            int id = insertStatement.executeUpdate();
            p.setId(id);
        } else {
            updateStatement.setString(1, p.getName());
            updateStatement.setString(2, p.getPassword());
            updateStatement.setInt(3, p.getId());
            updateStatement.executeUpdate();
        }
        return p;
    }
    public Person delete(Person p) throws SQLException {
        deleteStatement.setInt(1, p.getId());
        deleteStatement.executeUpdate();
        return p;
    }
    public Person getById(Integer id)throws SQLException {
        getByIdStatement.setInt(1, id);
        ResultSet rs = getAllStatement.executeQuery();
        if(rs.next()) {
            return getPersonFromResultSet(rs);
        }
        return null;
    }
    public List<Person> getAll() throws SQLException {
        ResultSet rs = getAllStatement.executeQuery();
        List<Person> persons = new ArrayList<>();
        while(rs.next()){
            persons.add(getPersonFromResultSet(rs));
        }
        return persons;
    }
    private Person getPersonFromResultSet(ResultSet rs) throws SQLException{
        Person p = new Person();
        p.setId(rs.getInt("id"));
        p.setName(rs.getString("name"));
        p.setPassword(rs.getString("password"));
        return p;
    }

}
