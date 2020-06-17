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
	 * costruttore di default preso dalla superclasse stat
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
 * getters/setters
 * 
 */
	public String getNumTotalePost() {
		return numTotalePost;
	}

	public void setNumTotalePost(int numTotalePost) {
		this.numTotalePost = Integer.toString(numTotalePost);
		this.max=null;
		this.min=null;
		this.avg=null;
		
	}

	public String getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = Integer.toString(avg);
		this.max=null;
		this.min=null;
		this.numTotalePost=null;
	}

	public String getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = Integer.toString(min);
		this.max=null;
		this.avg=null;
		this.numTotalePost=null;
	}

	public String getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = Integer.toString(max);
		this.avg=null;
		this.min=null;
		this.numTotalePost=null;
	}

	
	
	

}