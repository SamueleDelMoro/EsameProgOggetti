package com.esame.EsameProgOgg.stat;

import java.util.ArrayList;


import com.esame.EsameProgOgg.model.Post;
import com.esame.EsameProgOgg.model.StatisticsNum;

/**
 * <p>
 * <b> Classe </b> utile al calcolo del numero totale dei post
 * </p>
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 *
 */
public class StatisticsNumPost implements StatisticsCalculate{
	
	private ArrayList<Post> post=new ArrayList<Post>();
	
	/**
	 * Costruttore
	 * @param post indica l'ArraList dei post
	 */
	public StatisticsNumPost(ArrayList<Post> post) {
		this.post=post;
	}
	/**
	 * override del metodo dell'interfaccia StatisticsCalculate dostat()
	 */
	public  StatisticsNum doStat() {
		StatisticsNum stat=new StatisticsNum();
		stat.setNumTotalePost(post.size());
		stat.setSpecifica("numero di post");
		return stat;
	}

}
