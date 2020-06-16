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
		private static String id;
		private String message;
	
		/**
		 * Costruttore
		 * @param created_time indica il momento in cui è stato creato il post
		 * @param id indica l'id del post
		 * @param message indica il messaggio del post
		 */
		public Post(String created_time, String id, String message) {
			super();
			this.created_time = created_time;
			Post.id = id;
			this.message= message;
			
		}
		/**
		 * @return the id
		 */
		public static String getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(String id) {
			Post.id = id;
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
			return "message: " +this.getMessage()+"\nCreated time: "+this.getCreated_time()+"\n"+"id:"+Post.getId();
		}
}
