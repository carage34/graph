 public class Graph {
 	private Sommet prem;
 	private int nbSommet;
 	
 	public Graph() {
 		nbSommet=0;
 	}
 	public void addSommet(Sommet som) {
 		if(prem==null) {
 			prem=som;
 			nbSommet++;
 		} else {
 			Sommet tmp=prem;
 			while(tmp.getSuivant()!=null) {
 				tmp=tmp.getSuivant();
 			}
 			tmp.setSuivant(som);
 			nbSommet++;
 		}
 	}

 	public void afficherGraphe() {
 		Sommet tmp = prem;
 		while(tmp.getSuivant()!=null) {
 			tmp= tmp.getSuivant();
 			System.out.print("Sommet " + tmp.getId() + " : ");
 			Arete ar = tmp.getPrem();
 			while(ar!=null) {
 				System.out.print(ar.getArrive()+ " ("+ar.getFlot()+"/"+ar.getCapacite()+")");
 				System.out.print(" Marquage : "+ tmp.getMarquage());
				ar=ar.getSuivant();
 			}
 			System.out.println();
 		}
 		System.out.println();
 	}

 	public void marquage() {
 		Sommet tmp=prem;
 		while(tmp.getSuivant()!=null) {
 			Arete ar = tmp.getPrem();
 			while(ar!=null) {
 				if(ar.getFlot()<ar.getCapacite()) {
 					if (tmp.getMarquage()==null) {
 						tmp.setMarquage("+");
 					}
 				}
 				if(ar.getFlot()>0) {
 					if((tmp.getMarquage())!=null&&(tmp.getNom()!="s")) {
 						tmp.setMarquage("-");
 					}
 				}
 				ar=ar.getSuivant();
 			}
 			tmp=tmp.getSuivant();
 		}
 	}
 }