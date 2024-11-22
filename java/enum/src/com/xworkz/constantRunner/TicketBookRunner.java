package com.xworkz.constantRunner;

import com.xworkz.constantDTO.TicketBookDTO;
import com.xworkz.constant.TicketType;
import com.xworkz.constant.SeatType;

public class TicketBookRunner {
	public static void main(String[] args) {

		TicketBookDTO ticketbookDTO = new TicketBookDTO("Kalki", "PVR Theater", TicketType.ONLINE,
				SeatType.PREMIUM);
		ticketbookDTO.ticketInfo();

	}

}
