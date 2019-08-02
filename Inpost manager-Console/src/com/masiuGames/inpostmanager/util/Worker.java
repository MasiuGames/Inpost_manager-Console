package com.masiuGames.inpostmanager.util;

public class Worker {
	int payament = Randomizer.getRandom(9)*1000 + Randomizer.getRandom(9)*100;
	int efficiency;
	
	public int getPayament() {
		return payament;
	}
	public int getEfficiency() {
		return efficiency;
	}
	
}
