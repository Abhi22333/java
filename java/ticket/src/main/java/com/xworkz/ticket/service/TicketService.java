package com.xworkz.ticket.service;

import com.xworkz.ticket.dto.TicketDto;

public interface TicketService {
	boolean isValidAndSave(TicketDto ticketDto);

}