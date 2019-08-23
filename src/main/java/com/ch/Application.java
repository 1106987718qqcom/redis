package com.ch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

//@ComponentScan("distributed_lock_redis")
public class Application {

	public static void main(String[] args) {
       SpringApplication.run(Application.class, args);

	}

}
