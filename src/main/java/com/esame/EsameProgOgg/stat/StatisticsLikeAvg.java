package com.esame.EsameProgOgg.stat;

import java.util.ArrayList;

import com.esame.EsameProgOgg.model.Post;
import com.esame.EsameProgOgg.model.StatisticsNum;

/**
 * <p>
 * <b> Classe </b> la quale calcola la lunghezza media dei like
 * </p>
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 */
public class StatisticsLikeAvg implements StatisticsCalculate {
	private ArrayList<Post> post=new ArrayList<Post>();
	
	/**
	 * Costruttore
	 * @param post indica l'ArrayList di post
	 */
	public StatisticsLikeAvg(ArrayList<Post> post) {
		this.post=post;
	}
	/**
	 * override del metodo dell'interfaccia statCalcNum dostat()
	 */
	public  StatisticsNum doStat() {
		int somma=0;
		int n=0;
		for(int i=0;i<post.size();i++) {
			if(post.get(i).getLike()!=0) {
				somma+=post.get(i).getLike();
			}
			n++;

		 }
		StatisticsNum stat= new StatisticsNum();
		stat.setAvg(somma/n);
		stat.setSpecifica("Media numero di like");
		return stat;
	}


}
