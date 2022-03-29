package com.kj.backend;

import com.kj.backend.Connection.Connection;
import com.kj.backend.Connection.ConnectionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BackendApplication{


	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}



}
