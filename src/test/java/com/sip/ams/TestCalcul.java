package com.sip.ams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalcul {

	@Test
	void testSomme() {
		assertTrue(Calcul.somme(2, 3)==5);
	}
	
	@Test
	void testProduit() {
		assertTrue(Calcul.produit(2, 3)==6);
	}

}
