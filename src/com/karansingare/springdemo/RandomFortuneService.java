package com.karansingare.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	private String[] fortuneService = new String[3];
	
	@Override
	public String getFortune() {
		int rand_int = this.RandomInt();
		return getFortuneService()[rand_int];
	}

	public RandomFortuneService() {
		setFortuneService();
	}
	
	public String[] getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService() {
		this.fortuneService[0] = "This is the first random string";
		this.fortuneService[1] = "This is the second random string";
		this.fortuneService[2] = "This is the third random string";
	}
	private int RandomInt( ) {
		Random rand = new Random();
		int rand_int = rand.nextInt(3);
		return rand_int;
	}
	

}
