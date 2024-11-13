package com.cg.FirstScbHotelServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.FirstScbHotelServices.entity.Hotel;
import com.cg.FirstScbHotelServices.service.HotelServiceImpl;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	@Autowired
	private HotelServiceImpl hotelServiceImpl;

	@PostMapping("/create")
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
		Hotel createdHotel = hotelServiceImpl.create(hotel);
		return new ResponseEntity<>(createdHotel, HttpStatus.CREATED);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Hotel>> getAllHotels() {
		List<Hotel> hotels = hotelServiceImpl.getAllHotels();
		return new ResponseEntity<>(hotels, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Hotel> getHotelById(@PathVariable("id") Long hotelId) {
		Hotel hotel = hotelServiceImpl.getHotelById(hotelId);
		if (hotel == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} else {
			return ResponseEntity.ok(hotel);
		}
	}
}
