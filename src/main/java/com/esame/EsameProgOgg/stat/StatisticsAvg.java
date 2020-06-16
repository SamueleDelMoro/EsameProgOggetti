package com.esame.EsameProgOgg.stat;

import java.util.ArrayList

;

import com.esame.EsameProgOgg.model.Post;
import com.esame.EsameProgOgg.model.StatisticsNum;

/**
 * <p>
 * <b> Classe </b> la quale calcola la lunghezza media dei post
 * </p>
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 */
public class StatisticsAvg implements StatisticsCalculate{
	
	
	private ArrayList<Post> post=new ArrayList<Post>();
	
	/**
	 * Costruttore
	 * @param post indica l'ArrayList di post
	 */
	public StatisticsAvg(ArrayList<Post> post) {
		this.post=post;
	}
	/**
	 * override del metodo dell'interfaccia statCalcNum dostat()
	 */
	public  StatisticsNum doStat() {
		int somma=0;
		int n=0;
		for(int i=0;i<post.size();i++) {
			if(post.get(i).getMessage()!=null) {
				somma+=post.get(i).getMessage().length();
			}
			n++;

		 }
		StatisticsNum stat= new StatisticsNum();
		stat.setAvg(somma/n);
		stat.setSpecifica("Lunghezza media post");
		return stat;
	}

}
