package com.easyfly.booking.service;

import com.easyfly.booking.dto.TicketRequestDto;
import com.easyfly.booking.dto.TicketResponsedto;
import com.easyfly.booking.exception.FlightNotFoundException;

public interface TicketService {
	public TicketResponsedto reserveTicket(TicketRequestDto ticketRequestDto) throws FlightNotFoundException;
}
