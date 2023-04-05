package tn.projet.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import tn.projet.entites.Role;

public interface RoleInterface extends JpaRepository<Role,Integer>{

}
