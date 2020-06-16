package com.esame.EsameProgOgg.filter;

import java.util.ArrayList;

import com.esame.EsameProgOgg.model.Post;



/**
 * <p>
 * <b> Classe </b> di filtro per un arrayList di post, utile alla ricerca di un contenuto multimediale
 * (message=null)
 * </p>
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 *
 */
public class FilterInMultimedia extends FilterIn implements Filter{
	/**
	 * costruttore
	 * @param post arrayList di post
	 * @param param arrayList di stringhe contenenti i parametri di filtraggio
	 */
	public FilterInMultimedia(ArrayList<Post> post, ArrayList<String> spec) {
		super(post,spec);
	}
	/**
	 * metodo che consente il filtraggio
	 */
	public  ArrayList<Post> doFilter() {
		ArrayList<Post> postFiltered =new ArrayList<Post>();
		for(Post p : post) {
			if(p.getMessage()==null) 
				postFiltered.add(p);
		}
		return postFiltered;
	}
}