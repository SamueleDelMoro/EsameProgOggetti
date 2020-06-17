package com.esame.EsameProgOgg.filter;

import java.util.ArrayList;

import com.esame.EsameProgOgg.model.Post;

public class FilterLikeLt implements Filter {
	private ArrayList<Post> post= new ArrayList<Post>();
	private ArrayList<String> param= new ArrayList<String>();
	/**
	 * costruttore
	 * @param post arrayList di post
	 * @param param arrayList di stringhe contenenti i parametri di filtraggio
	 */
	public FilterLikeLt(ArrayList<Post> post, ArrayList<String> param) {
		this.post=post;
		this.param=param;
	}
	/**
	 * metodo che consente il filtraggio
	 */
	public  ArrayList<Post> doFilter(){
		ArrayList<Post> postFiltered =new ArrayList<Post>();
		for(Post p : post) {
			if(p.getLike()!=0) {
			if(p.getLike()<Integer.parseInt(param.get(0)))
				postFiltered.add(p);}
		}
		return postFiltered;
	}

}
