package com.masiuGames.inpostmanager.util;

public class Inventory {
	private int[] inv = new int[20];
	private int items = 0;
	
	public void add(int id) {
		if(inv.length > items)
			inv[items] = id;
	}
	
	public int[] getInventory() {
		return inv;
	}
	
	public int getItems() {
		return items;
	}
	
	public void remove(int place) {
		inv[place] = 0;
	}
}
