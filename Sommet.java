public class Sommet {
	private int id;
	private Sommet suivant;
	private Arete prem;
	private String marquage;
	private String nom;
	public Sommet(int id, Sommet suivant, String nom) {
		this.id = id;
		this.suivant = suivant;
		this.nom = nom;
	}
	public Sommet(int id) {
		this.id=id;
		suivant=null;
	}

	public Arete getPrem() {
		return prem;
	}

	public void setSuivant(Sommet s) {
		suivant=s;
	}

	public Sommet getSuivant() {
		return suivant;
	}

	public void setArete(Arete ar) {
		prem = ar;
	}

	public void addArete(Arete ar) {
		if(prem==null) {
			prem = ar;
		} else {
			Arete temp = prem;
			while(temp.getSuivant()!=null) {
				temp = temp.getSuivant();
			}
			temp.setSuivant(ar);
		}
	}

	public String getMarquage() {
		return this.marquage;
	}

	public void setMarquage(String m) {
		this.marquage = m;
	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return this.nom;
	}
}