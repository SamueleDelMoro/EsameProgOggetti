package com.esame.EsameProgOgg.stat;

import java.util.ArrayList;


import com.esame.EsameProgOgg.model.Post;
import com.esame.EsameProgOgg.model.StatisticsPres;

/**
 * <p>
 * <b> Classe </b> la quale calcola il numero totale dei post con multimedia
 * </p>
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 *
 */
public class StatisticsPresMult implements StatisticsCalculate{
	
	
	private ArrayList<Post> post=new ArrayList<Post>();
	
	/**
	 * Costruttore
	 * @param post Indica l'ArrayList dei post
	 */
	public StatisticsPresMult(ArrayList<Post> post) {
		this.post=post;
	}
	/**
	 * override del metodo dell'interfaccia StatisticsCalculate dostat()
	 */
	public  StatisticsPres doStat() {
		int n=0;
		StatisticsPres stat=new StatisticsPres();
		for(Post post : post) {
			if(post.getMedia_type()!=null) 
			n++;
		 }
		if(n!=0)
			stat.setPres(true);
		else
			stat.setPres(false);
			stat.setNumPost(n);
			stat.setSpecifica("numero di post con multimedia");
		return stat;
	}

}
