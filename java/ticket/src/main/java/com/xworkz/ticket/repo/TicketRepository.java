package com.xworkz.ticket.repo;

import com.xworkz.ticket.dto.TicketDto;

public interface TicketRepository {
	int save(TicketDto ticketDto);

}
