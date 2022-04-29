package com.sip.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoGkApplication {

	public static void main(String[] args) {
	
		SpringApplication.run(JenkinsDemoGkApplication.class, args);
		System.out.println("La somme de 2 + 3 = " + Calcul.somme(2,3));
		System.out.println("Le produit de 2 * 3 = " + Calcul.produit(2,3));
	}

}
