package com.money;

public interface Expression {

	Money reduce(String to);

	Money reduce(Bank bank, String to);

}
