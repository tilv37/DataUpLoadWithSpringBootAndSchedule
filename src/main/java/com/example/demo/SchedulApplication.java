package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulApplication implements CommandLineRunner {

	@Autowired
	DataTask task;

	public static void main(String[] args) {
		SpringApplication.run(SchedulApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		task.readAndUpload();
//		task.setDatas();
	}
}
