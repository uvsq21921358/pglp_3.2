package uvsq21921358.OCP;

public class Employe {
	protected final String nom;
	protected final String adresse;
	protected final double salaire=1500;
	protected int an;

	public Employe(String nom, String adresse, int an) {
		this.nom=nom;
		this.adresse= adresse;
		this.an=an;
	}


	public double calculSalaire () 
		{ 
		   if(an!=0) {
			  double salary=salaire+an*20;
			  return salary;
		   }
		   
			return salaire ; 
			
		} 
		public void afficheCoordonneees () {
			System.out. println (nom + " , " + adresse);
		}
		
}
