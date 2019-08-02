package com.masiuGames.inpostmanager.util;

public class Worker {
	int payament = Randomizer.getRandom(9)*1000 + Randomizer.getRandom(9)*100;
	int efficiency;
	
	public int getPayament() {
		return payament;
	}
	public int getEfficiency() {
		if(payament<2000)
		{
			efficiency = 1;
		}
		if(payament>=2000 && payament<4000)
		{
			efficiency = 2;
		}
		if(payament>=4000 && payament<6000)
		{
			efficiency = 3;
		}
		if(payament>=6000 && payament<8000)
		{
			efficiency = 4;
		}
		if(payament>=8000)
		{
			efficiency = 5;
		}
		return efficiency;
	}
	
}
