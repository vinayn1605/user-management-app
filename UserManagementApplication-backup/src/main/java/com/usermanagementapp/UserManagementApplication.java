package com.usermanagementapp;

import com.usermanagementapp.dto.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;


//@EntityScan("com.usermanagementapp.dto") // path of the entity model
//@EnableJpaRepositories(basePackages = "com.usermanagementapp.repository")//path of repository


@SpringBootApplication
public class UserManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserManagementApplication.class, args);
        Logger logger
                = LoggerFactory.getLogger(UserManagementApplication.class);
        logger.trace("hello vinay");
        logger.error("hello vinay");
        logger.info("hello vinay");
    }
    @Autowired
    DataSource dataSource;
    @Bean
    @Profile("server")
    public DataSource getConn( ) {
        DataSource dataSource = new DataSource();
        dataSource.getDbUrl();
        dataSource.getDbUsername();
        dataSource.getDbPassword();
        return new DataSource();
    }


   }




