package com.esame.EsameProgOgg.model;

/**
 * <p>
 * <b> Classe </b> per la creazione dei post
 * </p>
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 *
 */
public class Post {
	
	private String created_time;
		private String id;
		private String message;
		private int like;
		private String media_type;
	
	
		/**
		 * Costruttore
		 * @param created_time indica il momento in cui è stato creato il post
		 * @param id indica l'id del post
		 * @param message indica il messaggio del post
		 */
		public Post(String created_time, String id, String message, int like, String media_type) {
			super();
			this.created_time = created_time;
			this.id = id;
			this.message= message;
			this.like=like;
			this.media_type=media_type;
			
			
		}
		

		public String getMedia_type() {
			return media_type;
		}


		public void setMedia_type(String media_type) {
			this.media_type = media_type;
		}


		/**
		 * @return the id
		 */
		public String getId() {
			return id;
		}
		
		public int getLike() {
			return like;
		}
		public void setLike(int like) {
			this.like = like;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(String id) {
			this.id = id;
		}
		/**
		 * @return the descrizione
		 */
		public String getMessage() {
			return message;
		}
		/**
		 * @param descrizione the descrizione to set
		 */
		public void setMessage(String message) {
			this.message = message;
		}
		
		public String getCreated_time() {
			return created_time;
		}
		public void setCreated_time(String created_time) {
			this.created_time = created_time;
		}
	
		
		/**
		 * override del metodo toString()
		 */
		@Override
		public String toString() {
			return "message: " +this.getMessage()+"\nCreated time: "+this.getCreated_time()+"\n"+"id:"+this.getId()+"\n"+"like:"+this.getLike()+"\n"+"media_type:"+this.getMedia_type();
		}
}
