package go.g2academy.JdbcDay14;

import java.sql.*;

public class MySqlConnectionExample {
    public static void main(String[] args) {

        try {
            //1. Load MySQL JDBC Driver
//            Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");


            //2. Create DataBase Connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabootcamp", "root", "test1234");

            //3. Create Statement
            Statement statement = connection.createStatement();

            //4. Execute Query to get daya from DataBase - READ
            ResultSet rs = statement.executeQuery("select * from student");

            //5. Iterate through all rows in student table
            while (rs.next()) {
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                Integer age = rs.getInt("age");
                String phoneNumber = rs.getString("phone_number");

                System.out.println(id + " " + name + " " + age + " " + phoneNumber);
            }

            //6. Update Data - UPDATE
            statement.executeUpdate("update student set age = 20, name = 'Very' where id = 2");

            //7. Delete Data - DELETE
            statement.executeUpdate("delete from student where id=2");

            //8. Insert Data (row) - CREATE
//            statement.executeUpdate("insert into student value(7,'Rian',24,'0825698741')");

            // ===== prepare statement ===== (Cara Aman CRUD)
            String insertQuery = "insert into student(id, name, age, phone_number) values(?, ? , ?, ?)";
            PreparedStatement psInsert = connection.prepareStatement(insertQuery);
            String updateQuery = "update student set name = ?, age = ?, phone_number = ? where id = ?";
            PreparedStatement psUpdate = connection.prepareStatement(updateQuery);
            // Insert
//            psInsert.setInt(1, 9);
//            psInsert.setString(2, "Dodi");
//            psInsert.setInt(3, 26);
//            psInsert.setString(4,"0882369874");
//            psInsert.execute();

            // Update
            psUpdate.setString(1, "Update Name");
            psUpdate.setInt(2, 17);
            psUpdate.setString(3, "0874123698");
            psUpdate.setInt(4, 1); //Update student where id = 1
            psUpdate.execute();

            //==== batch execution and transaction ====
            connection.setAutoCommit(false);
            for (int i = 9; i < 100; i++) {
                psInsert.setInt(1, i);
                psInsert.setString(2, "Student" + i);
                psInsert.setInt(3, 27);
                psInsert.setString(4,"0882369865" + i);
                psInsert.addBatch();
            }
            psInsert.executeBatch();
            connection.commit();
            connection.setAutoCommit(true);

            //7. close all resource once it is being used
            //Bad Example, need to be in finally statement
            rs.close();
            statement.close();
            connection.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
