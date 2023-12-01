package com.mayssa.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mayssa.demo.entities.Artiste;


@RepositoryRestResource(path = "art")
@CrossOrigin("http://localhost:4200/")
public interface ArtisteRepository extends JpaRepository<Artiste,Long> {
    
}
