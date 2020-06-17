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
	
		/**
		 * Costruttore
		 * @param created_time indica il momento in cui è stato creato il post
		 * @param id indica l'id del post
		 * @param message indica il messaggio del post
		 */
		public Post(String created_time, String id, String message, int like) {
			super();
			this.created_time = created_time;
			this.id = id;
			this.message= message;
			this.like=like;
			
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
			return "message: " +this.getMessage()+"\nCreated time: "+this.getCreated_time()+"\n"+"id:"+this.getId();
		}
}
