package go.g2academy.JdbcDay14;

import go.g2academy.JdbcDay14.dao.StudentDaoJdbc;
import go.g2academy.JdbcDay14.entity.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class StudentDaoJdbcExample {
    public static void main(String[] args) {
        try {
            //1. load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2. Create database connection
            Connection connection =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/javabootcamp",
                            "root", "test1234");

            //how to use DAO
            StudentDaoJdbc studentDao = new StudentDaoJdbc();
            studentDao.setConnection(connection);
            //insert person data
            Student s = new Student();
            s.setName("Tiara");
            s.setAge(35);
            s.setPhone_number("0852369874");
            studentDao.save(s);
            //get by id
            Student studentId1 = studentDao.getById(1);
            if (studentId1 != null) {
                System.out.println("id:" + studentId1.getId() + ",name:"
                        + studentId1.getName() + ",age:" + studentId1.getAge() + ",Phone:" + studentId1.getPhone_number());
                //update person with id 1
                studentId1.setName("updated name here");
                studentId1.setAge(30);
                studentId1.setPhone_number("Phone Update");
                studentDao.save(studentId1);
            }
            //getAll
            List<Student> students = studentDao.getAll();

            for(Student student : students) {
                System.out.println("id:" + student.getId() + ",name:"
                        + student.getName() + ",age:" + student.getAge() + ",Phone:" + student.getPhone_number());
            }


        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
