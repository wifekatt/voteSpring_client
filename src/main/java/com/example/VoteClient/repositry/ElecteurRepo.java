package com.example.VoteClient.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.VoteClient.entities.Electeur;

@Repository
public interface ElecteurRepo extends JpaRepository<Electeur, Long> {

	Electeur findUserById(long electeurID);

}
