package com.booking.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class UserApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(UserApplication.class, args);
  }

  @Override
  public void run(String... args) {}
}
