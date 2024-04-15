package com.example.day4ex2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day4ex2Application {

	public static void main(String[] args) {

		WebDriver driverchrome =new ChromeDriver();
		WebDriver driveredge=new EdgeDriver();
		WebDriver driverff=new FirefoxDriver();

		driverchrome.get("https://www.google.com");
		driveredge.get("https://www.google.com");
		driveredge.close();
		driverff.get("https://www.google.com");
		driverff.close();


		SpringApplication.run(Day4ex2Application.class, args);
	}

}
