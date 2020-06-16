package com.esame.EsameProgOgg.stat;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.esame.EsameProgOgg.model.Post;
import com.esame.EsameProgOgg.model.StatisticsNum;

/**
 * <p>
 * <b> Classe </b> utile per il calcolo del post con minor numero di caratteri, dato un arrayList di post da analizzare, calcolo statistica
 * </p>
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 *
 */
public class StatisticsMin implements StatisticsCalculate{

private ArrayList<Post> post=new ArrayList<Post>();

	/**
	 * Costruttore
	 * @param post indica l'ArrayList dei post
	 */
	public StatisticsMin(ArrayList<Post> post) {
		this.post=post;
	}
	
	/**
	 * override del metodo doStat() 
	 */
	@Override
	public StatisticsNum doStat() {
		int min;
		Map<String,Integer> map= new HashMap<String,Integer>();
		for(Post record : post) {
			if(record.getMessage()!=null) {
				map.put(record.getMessage(), record.getMessage().length());
			}
		}
		min=Collections.min(map.values());
		StatisticsNum stat= new StatisticsNum();
		stat.setMin(min);
		stat.setSpecifica("Lunghezza minima post");
		return stat;
	}
	

}
