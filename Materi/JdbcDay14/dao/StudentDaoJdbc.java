package go.g2academy.JdbcDay14.dao;

import go.g2academy.JdbcDay14.entity.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoJdbc {
    private Connection connection;
    private PreparedStatement insertStatement;
    private PreparedStatement updateStatement;
    private PreparedStatement deleteStatement;
    private PreparedStatement getByIdStatement;
    private PreparedStatement getAllStatement;

    private final String insertQuery = "insert into student(name, age, phone_number)" + " values(?,?,?)";
    private final String updateQuery = "update student set name = ?, age = ?, phone_number = ? where id = ?";
    private final String deleteQuery = "delete from student where id = ?";
    private final String getByIdQuery = "select * from student where id = ?";
    private final String getAllQuery = "select * from student";

    public void setConnection(Connection connection) throws SQLException{
        this.connection = connection;
        insertStatement = this.connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
        updateStatement = this.connection.prepareStatement(updateQuery);
        deleteStatement = this.connection.prepareStatement(deleteQuery);
        getByIdStatement = this.connection.prepareStatement(getByIdQuery);
        getAllStatement = this.connection.prepareStatement(getAllQuery);
    }

    public Student save(Student student) throws SQLException{
        if(student.getId() == null){
            insertStatement.setString(1, student.getName());
            insertStatement.setInt(2, student.getAge());
            insertStatement.setString(3, student.getPhone_number());
            int id = insertStatement.executeUpdate();
            student.setId(id);
        }else {
            return student;
        }
        return student;
    }

    public Student delete(Student student) throws SQLException{
        deleteStatement.setInt(1, student.getId());
        deleteStatement.executeUpdate();
        return student;
    }

    public Student getById(int id) throws SQLException{
        getByIdStatement.setInt(1, id);
        ResultSet rs = getByIdStatement.executeQuery();

        if(rs.next()){
            getStudentFromResultSet(rs);
        }
        return null;
    }

    public List<Student> getAll() throws SQLException{
        List<Student> students = new ArrayList<Student>();
        ResultSet rs = getAllStatement.executeQuery();

        while (rs.next()){
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setAge(rs.getInt("age"));
            student.setPhone_number(rs.getString("phone_number"));
            students.add(student);
        }
        return students;
    }

    private Student getStudentFromResultSet(ResultSet rs) throws SQLException{
        Student student = new Student();
        student.setId(rs.getInt("id"));
        student.setName(rs.getString("name"));
        student.setAge(rs.getInt("age"));
        student.setPhone_number(rs.getString("phone_number"));
        return student;
    }
}
