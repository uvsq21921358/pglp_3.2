package uvsq21921358.OCP;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class EmployeTest {
	
	double salaireTotal=0;
	int ann =5;
	
	Vendeur v1 ;
	Vendeur v2 ;
	Manager m1 ;
	Manager m2;
	Employe e1 ;
	ArrayList <Employe> listEmploye;
	ArrayList <Manager> listManager;
	ArrayList <Vendeur> listVendeur;
	
	@Before
	public void test() {
		 v1 = new Vendeur("Sophie","3 rue du pigeon bleu",3,100);
		 v2 = new Vendeur("Louis","12 rue chateaufort",5,200);
		 m1 = new Manager ("Marie","3 rue du maron",2);
		 m2 = new Manager ("Steph","3 rue du bleu",4);
		 e1 = new Employe ("Laurant","3 rue du maron",2);
	
		
		listEmploye=new ArrayList<Employe>();
		listManager=new ArrayList<Manager>();
		listVendeur=new ArrayList<Vendeur>();
		listEmploye.add(e1);
		listManager.add(m1);
		listManager.add(m2);
		listVendeur.add(v1);
		listVendeur.add(v2);
		
	}	
		
	@Test
	public void calculSalaireE() {
		double s1 = 1500 + 20*3;
		
		assertTrue(e1.calculSalaire() == s1);
	}
	
	@Test
	public void calculSalaireV() {
		double s2 = 1500 + 200*3 +100;
		
		assertTrue(v1.calculSalaireV() == s2);
	}
	
	@Test
	public void calculSalaireM() {
		double s3 = 1500 + 20*8 +100;
		
		assertTrue(m1.calculSalaireM() == s3);
	}
	
	
	@Test
	public void calculSalireTotal() {
		double total = 5520;
		double salaireTotale=0;
		
		for(int i=0;i < listVendeur.size();i++) {
			
			salaireTotal+=listVendeur.get(i).calculSalaireV();
		
		}
	
		for(int i=0;i < listEmploye.size();i++) {
		
			salaireTotal+=listEmploye.get(i).calculSalaire();
	
		}

		for(int i=0;i < listEmploye.size();i++) {
	
			salaireTotale+=listManager.get(i).calculSalaireM();

			assertTrue(salaireTotale == total);
		}
		

	}
}
		


