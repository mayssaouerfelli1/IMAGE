package com.mayssa.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;


@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Image {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long idImage ;
	 private String name ;
	 private String type ;
	 @Column( name = "IMAGE" , length = 4048576 ) 
	 @Lob
	 private byte[] image; 
	 
	 
	 @OneToOne
	 private Chanson chanson;
	 
	 
	 
	}


