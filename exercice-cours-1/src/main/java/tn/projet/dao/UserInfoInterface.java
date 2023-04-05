package tn.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.projet.entites.UserInformations;

public interface UserInfoInterface extends JpaRepository<UserInformations,Integer> {

}
