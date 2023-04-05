package tn.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.projet.entites.CommandLine;

public interface CLI extends JpaRepository<CommandLine,Integer>{

}
