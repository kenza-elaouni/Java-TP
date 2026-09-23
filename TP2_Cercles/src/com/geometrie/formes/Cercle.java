package com.geometrie.formes;
import com.geometrie.base.Point;

public class Cercle {
	public Point centre;
	public double rayon;
	public String couleur;
	public static int nbCercles = 0;
	public Cercle() {
		centre = new Point();
		rayon = 1;
		couleur = "noir";
		nbCercles++;
	}
	public Cercle(Point centre, double rayon , String couleur) {
		this.centre=centre;
		this.rayon=rayon;
		this.couleur=couleur;
		nbCercles++;
	}
	public Cercle(double x, double y, double rayon, String couleur) {
		this.centre=new Point(x,y);
		this.rayon=rayon;
		this.couleur=couleur;
		nbCercles++;
	}
	public void mon_etat(){
		System.out.println("Cercle[centre=("+centre.abs+","+centre.ord+"),rayon="+rayon+",couleur="+couleur+"]");
	}
	public double getPerimetre() {
		return 2*Math.PI*rayon;
	}
	public double getSurface() {
		return Math.PI*rayon*rayon;
	}
	public void deplacer(double dx, double dy) {
		centre.abs=centre.abs+dx;
		centre.ord=centre.ord+dy;
	}
	public void deplacer(Point nouveauCentre) {
		centre=nouveauCentre;
	}
	public boolean contient(Point p) {
		return centre.distance(p)<=rayon;	
	}
	public boolean estPlusGrandQue(Cercle autre) {
		return this.rayon>autre.rayon;
	}
	public static int getNbCercles() {
		return nbCercles;
	}
	
}

