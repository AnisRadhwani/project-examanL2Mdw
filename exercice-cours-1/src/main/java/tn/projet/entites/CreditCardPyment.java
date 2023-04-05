package tn.projet.entites;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor

@DiscriminatorValue("CreditCard")
public class CreditCardPyment extends payment {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String cardNumber;
private String expirationDate;
}
