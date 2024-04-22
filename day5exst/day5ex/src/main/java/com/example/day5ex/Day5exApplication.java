package com.example.day5ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day5exApplication {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driverchrome=new ChromeDriver();
		driverchrome.get("https://www.demoblaze.com/");

		driverchrome.findElement(By.linkText("Laptops")).click();
		Thread.sleep(1000);

		driverchrome.findElement(By.linkText("MacBook air")).click();
		Thread.sleep(1000);

		driverchrome.findElement(By.linkText("Add to cart")).click();
		Thread.sleep(1000);
		
		driverchrome.switchTo().alert().accept();
		Thread.sleep(1000);
		
		driverchrome.findElement(By.linkText("cart")).click();
		
		SpringApplication.run(Day5exApplication.class, args);
	}

}
