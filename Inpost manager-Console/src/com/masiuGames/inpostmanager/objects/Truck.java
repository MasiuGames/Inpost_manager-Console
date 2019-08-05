package com.masiuGames.inpostmanager.objects;

public class Truck {
	static float acceleration = 0f;
	static float maxspeed = 80f;
	static float speed = 0;
	
	public static void accelerate()
	{
		acceleration = 2f;
		while(maxspeed>speed)
		{
			speed = speed + acceleration/2;
		}
		
	}
}
