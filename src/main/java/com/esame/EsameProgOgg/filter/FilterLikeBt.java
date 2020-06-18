package com.esame.EsameProgOgg.filter;

import java.util.ArrayList;


import com.esame.EsameProgOgg.exception.BetweenException;
import com.esame.EsameProgOgg.model.Post;
/**
 * <p>
 * <b> Classe </b> di filtro per i like di un arrayList di post  tra due valori interi scelti dall'utente
 * </p>
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 *
 */
public class FilterLikeBt implements Filter {
	private ArrayList<Post> post= new ArrayList<Post>();
	private ArrayList<String> param= new ArrayList<String>();
/**
 * costruttore
 * @param post arrayList di post
 * @param param arrayList di stringhe contenenti i parametri di filtraggio
 */
	public FilterLikeBt(ArrayList<Post> post, ArrayList<String> param) {
		this.post=post;
		this.param=param;
	}
	/**
	 * Metodo che consente il filtraggio
	 */
public  ArrayList<Post> doFilter() throws BetweenException  {
		if(Integer.parseInt(param.get(0))>=Integer.parseInt(param.get(1)))  {
			throw new BetweenException();

		}
		ArrayList<Post> postFiltered =new ArrayList<Post>();
		FilterLikeGt filterLG= new FilterLikeGt(post,param);
		postFiltered=filterLG.doFilter();
		param.remove(0);
		FilterLikeLt filterL = new FilterLikeLt(postFiltered,param);
		return postFiltered= filterL.doFilter();
	}




}
