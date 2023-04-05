package tn.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.projet.entites.Command;



public interface CommandInterface  extends JpaRepository<Command,Integer>{
	
}
