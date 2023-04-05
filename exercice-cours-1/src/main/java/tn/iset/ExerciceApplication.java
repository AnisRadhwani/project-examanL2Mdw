package tn.iset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import tn.projet.dao.ArticleInterface;
import tn.projet.dao.CLI;
import tn.projet.dao.CommandInterface;
import tn.projet.dao.PayementInerface;
import tn.projet.dao.RoleInterface;
import tn.projet.dao.UserInfoInterface;
import tn.projet.dao.UserInterface;
import tn.projet.entites.Article;
import tn.projet.entites.Command;
import tn.projet.entites.CommandLine;
import tn.projet.entites.CreditCardPyment;
import tn.projet.entites.PaypalPayment;
import tn.projet.entites.Role;

import tn.projet.entites.UserInformations;
import tn.projet.entites.Userrs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExerciceApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ExerciceApplication.class, args);
		
		ArticleInterface Articleinterface = ctx.getBean(ArticleInterface.class);
		CLI commandLineInterface = ctx.getBean(CLI.class);
		CommandInterface Commandinterface =ctx.getBean(CommandInterface.class);
		PayementInerface Payementinerface = ctx.getBean(PayementInerface.class);
		UserInterface Userinterface = ctx.getBean(UserInterface.class);
		UserInfoInterface UserinfoInterface= ctx.getBean(UserInfoInterface.class);
		RoleInterface Roleinterface= ctx.getBean(RoleInterface.class);
		
		Role role1 = new Role();
		Command command = new Command();
		Article article = new Article();
		Userrs user = new Userrs();
		CreditCardPyment creditCardPayment = new CreditCardPyment();
		UserInformations userInformations = new UserInformations();
		PaypalPayment paypalPayment = new PaypalPayment();
		CommandLine commandLine = new CommandLine();
		
		user.setLogin("Anis");
		user.setPassword("Radhwani");
		user.setConnectionNumber(500);
		Userinterface.save(user);
		
		role1.setRolename("Moderator");
		Roleinterface.save(role1);
		
		
		userInformations.setAddress("Arinna");
		userInformations.setCity("Tunis");
		userInformations.setEmail("anisradhwani558@gmail.com");
		userInformations.setPhoneNumber("27654332");
		UserinfoInterface.save(userInformations);
		
		String dateString = "2023-03-29";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = dateFormat.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		command.setCommandDate(null);
		Commandinterface.save(command);
		
		paypalPayment.setAccountNumber("0036589");
		paypalPayment.setAmount(324);
		paypalPayment.setPaymentDate(date);
		Payementinerface.save(paypalPayment);
		
		creditCardPayment.setCardNumber("5387 1441 2587 2075");
		creditCardPayment.setExpirationDate("2023-01-01");
		creditCardPayment.setAmount(256);
		creditCardPayment.setPaymentDate(date);
		Payementinerface.save(creditCardPayment);
		
		
		commandLine.setQuantity(20);
		commandLineInterface.save(commandLine);
		
		article.setDescription("Souris");
		article.setPrice(256);
		article.setBrand("SteelSeries");
		Articleinterface.save(article);

	}
}
