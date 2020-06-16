package com.esame.EsameProgOgg.stat;

import java.util.ArrayList;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.esame.EsameProgOgg.model.Post;

import com.esame.EsameProgOgg.model.StatisticsNum;

/**
 * <p>
 * <b> Classe </b> utile per il calcolo del post con massimo numero di caratteri, dato un ArrayList di post
 * </p>
 * 
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 *
 */
public class StatisticsMax implements StatisticsCalculate {
	//definisco l'arrayList da analizzare per la statistica
	private ArrayList<Post> post=new ArrayList<Post>();
	
	public StatisticsMax(ArrayList<Post> post) {
		this.post=post;
	}
	
	/**
	 * metodo di calcolo statistica
	 */
	@Override
	public  StatisticsNum doStat() {
	
		int max;
		Map<String,Integer> map= new HashMap<String,Integer>();
		for(Post record : post) {
			if(record.getMessage()!=null) {
				map.put(record.getMessage(), record.getMessage().length());
			}
		}
		max=Collections.max(map.values());
		StatisticsNum stat= new StatisticsNum();
		stat.setMax(max);
		stat.setSpecifica("Lunghezza max post");
		return stat;
		
}
}
