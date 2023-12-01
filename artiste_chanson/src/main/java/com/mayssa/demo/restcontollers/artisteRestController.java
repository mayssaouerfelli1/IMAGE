package com.mayssa.demo.restcontollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mayssa.demo.entities.Artiste;
import com.mayssa.demo.repos.ArtisteRepository;


@RestController
@RequestMapping("/api/art")
@CrossOrigin("*")
public class artisteRestController {
	@Autowired
	ArtisteRepository artisteRepository;
	@RequestMapping(method=RequestMethod.GET)
	public List<Artiste> getAllArtistes()
	{
	return artisteRepository.findAll();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Artiste getArtisteById(@PathVariable("id") Long id) {
		return artisteRepository.findById(id).get();
	}
	
	

}

