package com.bank.service;

import java.util.Random;

public class GeneratorOTP {

	public int generateOTP() {
		Random r=new Random();
		return r.nextInt(1000);
		
		
	}
}
