package tn.projet.entites;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Command implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idCommand;
private Date commandDate;
@ManyToOne
private Userrs user;
@OneToOne
private payment Paye;
@OneToMany
private Collection<CommandLine> commandlines;
}
