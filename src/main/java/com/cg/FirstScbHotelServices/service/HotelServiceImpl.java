package com.cg.FirstScbHotelServices.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.FirstScbHotelServices.entity.Hotel;
import com.cg.FirstScbHotelServices.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {
	@Autowired
	private HotelRepository hotelRepository; // Assuming HotelRepository for data access

	@Override
	public Hotel create(Hotel hotel) {
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotels() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getHotelById(Long hotelId) {
		Optional<Hotel> hotelExists = hotelRepository.findById(hotelId);
		return hotelExists.orElse(null);
	}
}

