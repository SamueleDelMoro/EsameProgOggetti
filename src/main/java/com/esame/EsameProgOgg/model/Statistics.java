package com.esame.EsameProgOgg.model;




/**
 * classe statistica generica, contiene solo la specifica
 * @param spec, specifica
 */
public class Statistics {
	
	String specifica;
	public Statistics() {
	}
	public Statistics(String s) {
		this.specifica=s;
	}

	public String getSpecifica() {
		return specifica;
	}

	public void setSpecifica(String specifica) {
		this.specifica = specifica;
	}

}	 
