package tn.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.projet.entites.Userrs;


public interface UserInterface extends JpaRepository<Userrs,Integer> {

}
