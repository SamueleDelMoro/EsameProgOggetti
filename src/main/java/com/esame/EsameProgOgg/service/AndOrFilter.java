package com.esame.EsameProgOgg.service;

import java.text.ParseException;
/**
 * <p>
 * <b> Classe </b>  la quale calcola il filtraggio post
 * </p>
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 */
import java.util.ArrayList;


import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.esame.EsameProgOgg.exception.BetweenException;
import com.esame.EsameProgOgg.exception.CommandException;
import com.esame.EsameProgOgg.filter.Filter;
import com.esame.EsameProgOgg.model.Post;

public class AndOrFilter {
	/**
	 * Dato il tipo di filtraggio (and,or, default), l'elenco di post da filtrare ed i parametri di 
	 * filtraggio (in,Gt,...) calcolo elenco di post che rispettano tali specifiche
	 * @param type , specifica di filtraggio avanzata nel caso di molteplici richieste (and,or,default)
	 * @param post , elenco di post da filtrare
	 * @param map , hashmap avente key=tipo di filtraggio(in,gt,lt,bt,...) e value=parametri di filtraggio
	 * @return elenco dei post filtrati
	 * @throws commandStatException
	 * @throws BetweenException
	 * @throws ParseException 
	 */
	public static ArrayList<Post> andOrFiltering(String type,ArrayList<Post> post, HashMap<String,ArrayList<String>> map) throws CommandException, BetweenException, ParseException{
		ArrayList<Post> postFiltered2= new ArrayList<Post>();
		ArrayList<Post> postFiltered1= new ArrayList<Post>();
			ArrayList<Filter> filter= new ArrayList<Filter>();
			for(Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
				filter.add(FilterService.filterFormulation(entry.getKey(), post, entry.getValue()));
			}
			postFiltered1=filter.get(0).doFilter();
			filter.remove(0);
			
			if(type.equals("or")||type.equals("and")) {
				for(Filter f : filter) {
					Set<Post> set = new LinkedHashSet<>(postFiltered1);
					postFiltered2=f.doFilter();
					
					if(type.equals("and")) {
						set.retainAll(postFiltered2);
						if(type.equals("or")) {
						set.addAll(postFiltered2);
					}
					
					}
					postFiltered2=new ArrayList<>(set);
					postFiltered1=postFiltered2;
				}
					
			}
		return postFiltered1;
	}
}
