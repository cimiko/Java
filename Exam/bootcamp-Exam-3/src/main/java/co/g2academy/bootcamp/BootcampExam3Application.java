/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 *
 * @author cimiko
 */
@SpringBootApplication(scanBasePackages = {"co.g2academy.bootcamp"},
         exclude = {DataSourceAutoConfiguration.class})
public class BootcampExam3Application {

    public static void main(String[] args) {
        SpringApplication.run(BootcampExam3Application.class, args);
    }

}
