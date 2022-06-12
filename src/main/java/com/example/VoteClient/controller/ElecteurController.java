package com.example.VoteClient.controller;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.VoteClient.entities.Electeur;
import com.example.VoteClient.repositry.ElecteurRepo;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class ElecteurController {
	
	@Autowired(required=true)
	private ElecteurRepo repo;
	
	@Autowired
    private EntityManagerFactory entityManagerFactory;
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Electeur electeurData)throws Exception {
		Electeur electeur=repo.findUserById(electeurData.getElecteurID());
		try {
		if(electeur.getCIN().equals(electeurData.getCIN()))
			return ResponseEntity.ok(electeur);
		} catch (Exception ex) {
            throw new Exception("inavalid CIN or Email");
        }
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
	}

}
