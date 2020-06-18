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
		private int count;
	
	
		/**
		 * Costruttore
		 * @param created_time indica il momento in cui è stato creato il post
		 * @param id indica l'id del post
		 * @param message indica il messaggio del post
		 * @param count indica la lunghezza del messaggio
		 * @param like indica il numero di like del post
		 * @param media_type indica il tipo di multimedia presente nel post
		 */
		public Post(String created_time, String id, String message, int like, String media_type, int count) {
			super();
			this.created_time = created_time;
			this.id = id;
			this.message= message;
			this.count=count;
			this.like=like;
			this.media_type=media_type;
			
			
			
		}
		
		
		/**
		 * @return lunghezza messaggio
		 */
		public int getCount() {
			return count;
		}

		/**
		 * @param count lunghezza messaggio da impostare
		 */

		public void setCount(int count) {
			this.count = count;
		}

		/**
		 * @return il tipo di multimedia
		 */

		public String getMedia_type() {
			return media_type;
		}

		/**
		 * @param  media_type il tipo di multimedia da impostare
		 */
		public void setMedia_type(String media_type) {
			this.media_type = media_type;
		}
        /**
		 * @return numero di like
		 */
		public int getLike() {
			return like;
		}
		/**
		 * @param like numero di like da impostare
		 */
		public void setLike(int like) {
			this.like = like;
		}/**
		 * @return the id
		 */
		public String getId() {
			return id;
		}
		/**
		 * @param id L'id da impostare
		 */
		public void setId(String id) {
			this.id = id;
		}
		/**
		 * @return il messaggio
		 */
		public String getMessage() {
			return message;
		}
		/**
		 * @param message il messaggio da impostare
		 */
		public void setMessage(String message) {
			this.message = message;
		}
		/**
		 * @return data di pubblicazione
		 */
		public String getCreated_time() {
			return created_time;
		}
		/**
		 * @param created_time la data di pubblicazione da impostare
		 */
		public void setCreated_time(String created_time) {
			this.created_time = created_time;
		}
	
		
		/**
		 * override del metodo toString()
		 */
		@Override
		public String toString() {
			return "message: " +this.getMessage()+"\n"+"count:"+this.getCount()+"\nCreated time: "+this.getCreated_time()+"\n"+"id:"+this.getId()+"\n"+"like:"+this.getLike()+"\n"+"media_type:"+this.getMedia_type();
		}
}
