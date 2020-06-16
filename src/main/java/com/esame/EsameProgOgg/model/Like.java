package com.esame.EsameProgOgg.model;

public class Like {
	
	private String id_post;
	private int total_count;
	
	
	
	
	

	

	

	public Like(String id_post, int total_count) {
		super();
		this.id_post = id_post;
		this.total_count = total_count;
	}

	
	/**
	 * @return the id_post
	 */
	public String getId_post() {
		return id_post;
	}


	/**
	 * @param id_post the id_post to set
	 */
	public void setId_post(String id_post) {
		this.id_post = id_post;
	}


	public int getNlike() {
		return total_count;
	}

	public void setNlike(int total_count) {
		this.total_count= total_count;
	}


	@Override
	public String toString() {
		return "Like [id_post=" + id_post + ", total_count=" + total_count + "]";
	}

	
	

}
