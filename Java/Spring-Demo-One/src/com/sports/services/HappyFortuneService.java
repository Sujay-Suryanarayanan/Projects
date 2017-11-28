package com.sports.services;

public class HappyFortuneService implements FortuneService {
@Override
	public String getFortuneService() {
	String stringVal = fortuneServiceGenerator();
	return stringVal;
}public String fortuneServiceGenerator() {
	return "Today is a lucky day for you!";
}
}
