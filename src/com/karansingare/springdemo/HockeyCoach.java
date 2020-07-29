package com.karansingare.springdemo;

public class HockeyCoach implements Coach {
	private RandomFortuneService randomFortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Run for at-least 2 kilometer in a day.";
	}

	@Override
	public String getDailyFortune() {
		return randomFortuneService.getFortune();
	}

	public void setRandomFortuneService(RandomFortuneService randomFortuneService) {
		this.randomFortuneService = randomFortuneService;
	}

	public RandomFortuneService getRandomFortuneService() {
		return randomFortuneService;
	}
	
	

	
}
