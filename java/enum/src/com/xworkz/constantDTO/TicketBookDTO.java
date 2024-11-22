package com.xworkz.constantDTO;

import com.xworkz.constant.SeatType;
import com.xworkz.constant.TicketType;

public class TicketBookDTO {
	private String movieName;
	private String theaterName;
	private TicketType ticketType;
	private SeatType seatType;

	public TicketBookDTO(String movieName, String theaterName, TicketType ticketType, SeatType seatType) {
		this.movieName = movieName;
		this.theaterName = theaterName;
		this.ticketType = ticketType;
		this.seatType = seatType;
	}

	public String getMovieName() {
		return movieName;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public TicketType getTicketType() {
		return ticketType;
	}

	public SeatType getSeatType() {
		return seatType;
	}

	public void ticketInfo() {
		System.out.println("Movie Name: " + getMovieName());
		System.out.println("Theater Name: " + getTheaterName());
		System.out.println("Ticket Type: " + getTicketType() + " (Cost: " + getTicketType().getCost() + ")");
		System.out.println("Seat Type: " + getSeatType() + " (Seat No: " + getSeatType().getSeatNo() + ")");
	}

}
