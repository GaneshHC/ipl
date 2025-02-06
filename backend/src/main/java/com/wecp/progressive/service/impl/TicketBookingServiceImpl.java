package com.wecp.progressive.service.impl;

<<<<<<< HEAD
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.TicketBooking;
import com.wecp.progressive.repository.TicketBookingRepository;
import com.wecp.progressive.service.TicketBookingService;

@Service
public class TicketBookingServiceImpl implements TicketBookingService{

    @Autowired
    private TicketBookingRepository ticketBookingRepository;

    @Override
    public List<TicketBooking> getAllTicketBookings() {
        return ticketBookingRepository.findAll();
    }

    @Override
    public int createBooking(TicketBooking ticketBooking) {
        return ticketBookingRepository.save(ticketBooking).getBookingId();
    }

    @Override
    public void cancelBooking(int bookingId) {
        ticketBookingRepository.deleteById(bookingId);
    }

    @Override
    public List<TicketBooking> getBookingsByUserEmail(String email) {
        return ticketBookingRepository.findByEmail(email);
    }
=======
public class TicketBookingServiceImpl  {
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1

}