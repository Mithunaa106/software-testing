package com.example.day5ph;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.joran.action.Action;

@SpringBootApplication
public class Day5phApplication {

	public static void main(String[] args) {
		WebDriver driverchrome = new ChromeDriver();
		  Action act=new Action(driverchrome) {
			
		  };


		SpringApplication.run(Day5phApplication.class, args);
	}

}
