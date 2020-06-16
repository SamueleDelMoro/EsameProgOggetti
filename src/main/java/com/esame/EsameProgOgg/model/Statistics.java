package com.esame.EsameProgOgg.model;




/**
 * <p>
 * <b> Classe </b> che crea una statistica generica la quale contiene solo la specifica
 * </p>
 * @param specifica, specifica
 */
public class Statistics {
	
	String specifica;
	/**
	 * Costruttore di default
	 */
	public Statistics() {
	}
	/**
	 * Costruttore
	 * @param s indica la specifica
	 */
	public Statistics(String s) {
		this.specifica=s;
	}
	/**
	 * @return the specifica
	 */
	public String getSpecifica() {
		return specifica;
	}
	/**
	 * @param specifica the specifica to set
	 */
	public void setSpecifica(String specifica) {
		this.specifica = specifica;
	}

	

}	 
