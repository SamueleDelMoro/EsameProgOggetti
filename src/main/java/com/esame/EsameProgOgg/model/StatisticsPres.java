package com.esame.EsameProgOgg.model;

/**
 * <p>
 * <b> Classe </b> di estensione di statistiche , contenente statistiche ulteriori come presenza di file multimediali
 * </p>
 *
 */
public class StatisticsPres extends Statistics{
	private boolean pres;
	private int numPost;
	/**
	 * costruttore
	 * @param pres , presenza o meno di una determinata specifica
	 * @param specifica , specifica di statistica
	 * @param numPost , numero di post che rispettano determinata specifica
	 */
	public StatisticsPres(boolean pres, String specifica, int numPost) {
		super(specifica);
		this.pres=pres;
		this.numPost=numPost;
	}

	public StatisticsPres() {
		super();
	}

	/**
	 * @return the pres
	 */
	public boolean isPres() {
		return pres;
	}

	/**
	 * @param pres the pres to set
	 */
	public void setPres(boolean pres) {
		this.pres = pres;
	}

	/**
	 * @return the numPost
	 */
	public int getNumPost() {
		return numPost;
	}

	/**
	 * @param numPost the numPost to set
	 */
	public void setNumPost(int numPost) {
		this.numPost = numPost;
	}

	
	
	

}
