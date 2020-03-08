package uvsq21921358.OCP;

public class Vendeur extends Employe{
	protected double commission;
	
	public Vendeur(String nom, String adresse, int an, double commission) {
		super(nom,adresse,an);
		this.commission=commission;
	}
	
	public double calculSalaireV() {
		return super.calculSalaire() + commission;
	}
	
	public void afficheCoordonneees () {
		super.afficheCoordonneees();
	}

}