package com.cg.FirstScbHotelServices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.FirstScbHotelServices.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
