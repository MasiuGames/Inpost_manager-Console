package com.masiuGames.inpostmanager.util;

import java.util.Random;

public class Randomizer {
	static Random rand = new Random();
	
	public static int getRandom(int max) {
		int number = rand.nextInt(max);
		return number += 1;
	}
}
