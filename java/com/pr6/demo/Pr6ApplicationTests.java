package com.pr6.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableScheduling
public class Pr6ApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(Pr6ApplicationTests.class, args);
	}
}

@Component
class ScheduledTasks {

	@Scheduled(cron = "0 0 10 * * ?")
	public void dailyTask() {
		System.out.println("Task executed at 10:00 AM: Daily notification");
	}

	@Scheduled(initialDelay = 2000, fixedRate = 3000)
	public void periodicTask() {
		System.out.println("Task executed every 3 seconds with an initial delay of 2 seconds");
	}
}
