package com.mayssa.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mayssa.demo.entities.Image;

public interface ImageRepository extends JpaRepository<Image , Long> {
	}


