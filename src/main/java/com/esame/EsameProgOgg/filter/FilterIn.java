package com.esame.EsameProgOgg.filter;

import java.util.ArrayList;

import com.esame.EsameProgOgg.model.Post;



/**
 * <p>
 * <b> Classe astratta </b> di filtro arrayList di post, utile alla ricerca di un determinato contenuto nel message
 * </p>
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 *
 */
public abstract class FilterIn implements Filter{

	protected ArrayList<String> spec= new ArrayList<String>();
	protected ArrayList<Post> post= new ArrayList<Post>();
	/**
	 * costruttore
	 * @param post arrayList di post
	 * @param param arrayList di stringhe contenenti i parametri di filtraggio
	 */
	public FilterIn(ArrayList<Post> post, ArrayList<String> spec) {
		this.post=post;
		this.spec=spec;


	}
	
	/**
	 * metodo che consente il filtraggio
	 */
	public abstract ArrayList<Post> doFilter();


}