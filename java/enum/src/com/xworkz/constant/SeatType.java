package com.xworkz.constant;

public enum SeatType {
	RECLINER("R11"), PREMIUM("P22"), EXECUTIVE("P33");

	private String seatNo;

	private SeatType(String seatNo) {
		this.seatNo = seatNo;
	}

	public String getSeatNo() {
        return seatNo;
	}
}
