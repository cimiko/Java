package go.g2academy.MateriJdbc;

import go.g2academy.MateriJdbc.dao.PersonDaoJdbc;
import go.g2academy.MateriJdbc.entity.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.UUID;

public class PersonDaoJdbcExample {

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
            PersonDaoJdbc personDao = new PersonDaoJdbc();
            personDao.setConnection(connection);
            //insert person data
            Person p = new Person();
            p.setName("Hartono-" + UUID.randomUUID());
            p.setPassword("pwd123");
            personDao.save(p);
            //get by id
            Person personId1 = personDao.getById(1);
            System.out.println("id:" + personId1.getId() + ",name:"
                    + personId1.getName() + ",password:" + personId1.getPassword());
            //update person with id 1
            personId1.setName("updated name here");
            personId1.setPassword("pwd updated");
            personDao.save(personId1);
            //getAll
            List<Person> persons = personDao.getAll();
            for(Person person : persons) {
                System.out.println("id:" + person.getId() + ",name:"
                        + person.getName() + ",password:" + person.getPassword());
            }


        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

