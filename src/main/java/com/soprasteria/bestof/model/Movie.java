package com.soprasteria.bestof.model;

import java.util.ArrayList;

public class Movie {

	private String titolo;
	private int anno;
	private String regista;
	private ArrayList<String>cast = new ArrayList<String>();
	
	

	public Movie() {
		
		titolo = "la regina degli scacchi";
		anno = 2022;
		regista = "booo";
		cast.add("persona1");
		cast.add("persona2");
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public String getRegista() {
		return regista;
	}

	public void setRegista(String regista) {
		this.regista = regista;
	}

	public ArrayList<String> getCast() {
		return cast;
	}

	public void setCast(ArrayList<String> cast) {
		this.cast = cast;
	}
	
	
	
	
	
	
	
}
