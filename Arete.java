public class Arete {
 	private int origine;
 	private int arrive;
 	private int capacite;
 	private int flot;
 	private Arete suivant;
 	public Arete(int or, int ar, int ca, int fl) {
 		origine = or;
 		arrive = ar;
 		capacite = ca;
 		flot = fl;
 	}

 	public int getOrigine() {
 		return origine;
 	}

 	public int getArrive() {
 		return arrive;
 	}

 	public int getCapacite()  {
 		return capacite;
 	}

 	public int getFlot() {
 		return flot;
 	}

 	public int getDisponible() {
 		return (capacite-flot);
 	}

 	public void ajouterFlot(int f) {
 		flot+=f;
 	}

 	public void reduireFlot(int f) {
 		flot-=f;
 	}

 	public Arete getSuivant() {
 		return suivant;
 	}

 	public void setSuivant(Arete ar) {
 		suivant=ar;
 	}
 }