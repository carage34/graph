 public class Main {
 	public static void main(String[] args) {
 		Graph g = new Graph();
 		Sommet s1 = new Sommet(1, null, "s");
 		Sommet s2 = new Sommet(2, null, "1");
 		Sommet s3 = new Sommet(3, null, "2");
 		Sommet s4 = new Sommet(4, null, "3");
 		Sommet s5 = new Sommet(5, null, "t");
 		g.addSommet(s1);
 		g.addSommet(s2);
 		g.addSommet(s3);
 		g.addSommet(s4);
 		g.addSommet(s5);
 		Arete ar = new Arete(1, 2, 20, 10);
 		Arete ar1 = new Arete(2, 3, 40, 5);
 		Arete ar2 = new Arete(3, 4, 25, 7);
 		Arete ar3 = new Arete(4, 5, 20, 10);
 		s1.addArete(ar);
 		s2.addArete(ar1);
 		s3.addArete(ar2);
 		s4.addArete(ar3);
 		g.marquage();
 		g.afficherGraphe();

 	}
 }