package uvsq21921358.OCP;
public class Manager extends Employe {

	
	public Manager(String nom, String adresse, int an) {
		super(nom,adresse,an);
	}
	
	public double calculSalaireM() {
		return super.calculSalaire() + 100;
	}
	
	public void afficheCoordonneees () {
		super.afficheCoordonneees();
	}


}