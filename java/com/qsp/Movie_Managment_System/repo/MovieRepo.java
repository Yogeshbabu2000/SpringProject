package com.qsp.Movie_Managment_System.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.Movie_Managment_System.dto.Movie;

public interface MovieRepo extends JpaRepository<Movie, Integer>{

}
