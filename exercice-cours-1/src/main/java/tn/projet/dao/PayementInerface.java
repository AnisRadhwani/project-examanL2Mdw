package tn.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.projet.entites.payment;

public interface PayementInerface extends JpaRepository<payment,Integer> {

}
