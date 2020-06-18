package com.esame.EsameProgOgg.model;

/**
 * <p>
 * <b> Classe </b> la quale descrive un oggetto statistica
 * </p>
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 */
public class StatisticsNum extends Statistics {
	private String avg;
	private String min;
	private String max;
	private String numTotalePost;
	/**
	 * costruttore di default preso dalla superclasse Statistics
	 */
	public StatisticsNum() {
		super();
	}
	/**
	 * costruttore
	 * @param specifica , specifica di statistica
	 * @param avg , calcolo numero medio di caratteri nel post
	 * @param min , calcolo numero minimo di caratteri nell'elenco dei post
	 * @param max , calcolo numero massimo di caratteri nell'elenco dei post
	 * @param n , numero dei post
	 */
	public StatisticsNum(String specifica,int avg, int min, int max, int n) {
		
		super(specifica);
		this.avg=Integer.toString(avg);
		this.max=Integer.toString(max);
		this.min=Integer.toString(min);
		this.numTotalePost=Integer.toString(n);
	}
/**
 * @return numero totale post
 * 
 */
	public String getNumTotalePost() {
		return numTotalePost;
	}
	/**
	 * @param numTotalePost il numero totale di post da impostare
	 * 
	 */
	public void setNumTotalePost(int numTotalePost) {
		this.numTotalePost = Integer.toString(numTotalePost);
		this.max=null;
		this.min=null;
		this.avg=null;
		
	}
	/**
	 * @return media
	 * 
	 */
	public String getAvg() {
		return avg;
	}
	/**
	 * @param avg la media da impostare
	 * 
	 */

	public void setAvg(int avg) {
		this.avg = Integer.toString(avg);
		this.max=null;
		this.min=null;
		this.numTotalePost=null;
	}
	/**
	 * @return minimo
	 * 
	 */
	public String getMin() {
		return min;
	}
	/**
	 * @param min il minimo da impostare
	 * 
	 */
	public void setMin(int min) {
		this.min = Integer.toString(min);
		this.max=null;
		this.avg=null;
		this.numTotalePost=null;
	}
	/**
	 * @return massimo
	 * 
	 */
	public String getMax() {
		return max;
	}
	/**
	 * @param max il massimo da impostare
	 * 
	 */
	public void setMax(int max) {
		this.max = Integer.toString(max);
		this.avg=null;
		this.min=null;
		this.numTotalePost=null;
	}

	
	
	

}