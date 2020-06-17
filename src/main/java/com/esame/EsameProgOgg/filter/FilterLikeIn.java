package com.esame.EsameProgOgg.filter;

import java.util.ArrayList;

import com.esame.EsameProgOgg.model.Post;

public class FilterLikeIn extends FilterIn implements Filter{
	/**
	 * costruttore
	 * @param post arrayList di post
	 * @param param arrayList di stringhe contenenti i parametri di filtraggio
	 */
	public FilterLikeIn(ArrayList<Post> post, ArrayList<String> spec) {
		super(post, spec);
	}
	/**
	 * metodo consente il filtraggio
	 */
	public ArrayList<Post> doFilter() {
		ArrayList<Post> postFiltered =new ArrayList<Post>();
		for(String s : spec) {
		for(Post p : post) {
			if(p.getLike()!=0) {
			if(p.getLike()==Integer.parseInt(s));
				postFiltered.add(p);}
		}
		}
		return postFiltered;
	}


}

