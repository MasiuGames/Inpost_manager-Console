package com.masiuGames.inpostmanager;

import com.masiuGames.inpostmanager.util.Worker;

public class InpostManager {

	public static void main(String[] args) {
		generateWorker();
	}
	
	public static void generateWorker() {
		Worker a = new Worker();
		System.out.println("Payament: " + a.getPayament());
		System.out.println("Efficiency: " + a.getEfficiency());
	}
	
}
