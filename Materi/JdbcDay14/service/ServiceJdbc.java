package go.g2academy.JdbcDay14.service;

import go.g2academy.JdbcDay14.dao.StudentDaoJdbc;
import go.g2academy.JdbcDay14.entity.Student;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceJdbc {
    private StudentDaoJdbc studentDao;
    private Connection connection;

    public void setDataSource(DataSource dataSource){
        try {
            connection = dataSource.getConnection();
            studentDao = new StudentDaoJdbc();
            studentDao.setConnection(connection);
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public Student save(Student student){
        try {
            connection.setAutoCommit(false);
            studentDao.save(student);
            connection.commit();
            connection.setAutoCommit(true);
        }catch (SQLException ex){
            try {
                connection.rollback();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return student;
    }

    public Student delete(Student student){
        try {
            connection.setAutoCommit(false);
            studentDao.save(student);
            connection.commit();
            connection.setAutoCommit(true);
        }catch (SQLException ex){
            try {
                connection.rollback();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return student;
    }

    public Student getStudent(int id){
        try {
            return studentDao.getById(id);
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }

    public List<Student> getStudents(){
        try {
            return studentDao.getAll();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return new ArrayList<Student>();
    }
}
