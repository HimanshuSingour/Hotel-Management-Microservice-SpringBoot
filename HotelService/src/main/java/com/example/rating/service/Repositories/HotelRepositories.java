package com.example.rating.service.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rating.service.Entities.HotelEntities;

public interface HotelRepositories extends JpaRepository<HotelEntities, String>{

}
