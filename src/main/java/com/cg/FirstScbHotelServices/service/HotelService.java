package com.cg.FirstScbHotelServices.service;

import java.util.List;

import com.cg.FirstScbHotelServices.entity.Hotel;

interface HotelService {
	public Hotel create(Hotel hotel);

	// getAll
	public List<Hotel> getAllHotels();

	// getOne
	public Hotel getHotelById(Long hotelId);
}
