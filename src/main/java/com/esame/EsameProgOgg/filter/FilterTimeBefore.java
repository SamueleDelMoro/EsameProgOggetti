package com.esame.EsameProgOgg.filter;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.esame.EsameProgOgg.model.Post;

/**
 * <p>
 * <b> Classe </b> di filtro per un arrayList di post per una data più piccola scelta dall'utente 
 * </p>
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 *
 */
public class FilterTimeBefore {
	private ArrayList<Post> post= new ArrayList<Post>();
	private ArrayList<String> param= new ArrayList<String>();
	
	/**
	 * costruttore
	 * @param post arrayList di post
	 * @param param arrayList di stringhe contenenti i parametri di filtraggio
	 */

	public FilterTimeBefore(ArrayList<Post> post, ArrayList<String> param) {
		this.post=post;
		this.param=param;
		
	}  
	
	
	
	/**
	 * metodo che consente il filtraggio
	 * @throws java.text.ParseException 
	 */
	public ArrayList<Post> doFilter() throws ParseException{
		ArrayList<Post> postFiltered =new ArrayList<Post>();
		SimpleDateFormat formatter1=new SimpleDateFormat("yyyy-MM-dd");
		
		for(Post p : post) {
			if(p.getCreated_time()!=null) {
		
			Date date2=formatter1.parse(param.get(0));
			Date date=formatter1.parse(p.getCreated_time());
		
			if(date.compareTo(date2) < 0)
			postFiltered.add(p);
             
			}
			 
		}
		
		return postFiltered;
	}
}


