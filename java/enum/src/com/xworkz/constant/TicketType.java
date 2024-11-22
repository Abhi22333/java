package com.xworkz.constant;

public enum TicketType {
	ONLINE(110),OFFLINE(200);
	  private int cost;

	   private TicketType(int cost) {
	        this.cost = cost;
	    }

	    public int getCost() {
	        return cost;
	    }
}
