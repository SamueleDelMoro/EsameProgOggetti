package com.esame.EsameProgOgg.filter;

import java.util.ArrayList;


import com.esame.EsameProgOgg.model.Post;




/**
 * <p>
 * <b> Classe </b> di filtro arrayList di post per un valore più basso scelto dall'utente
 * </p>
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 *
 */
public class FilterLt implements Filter{

	private ArrayList<Post> post= new ArrayList<Post>();
	private ArrayList<String> param= new ArrayList<String>();
	/**
	 * costruttore
	 * @param post arrayList di post
	 * @param param arrayList di stringhe contenenti i parametri di filtraggio
	 */
	public FilterLt(ArrayList<Post> post, ArrayList<String> param) {
		this.post=post;
		this.param=param;
	}
	/**
	 * metodo che consente il filtraggio
	 */
	public  ArrayList<Post> doFilter(){
		ArrayList<Post> postFiltered =new ArrayList<Post>();
		for(Post p : post) {
			if(p.getMessage()!=null) {
			if(p.getMessage().length()<Integer.parseInt(param.get(0)))
				postFiltered.add(p);}
		}
		return postFiltered;
	}
}