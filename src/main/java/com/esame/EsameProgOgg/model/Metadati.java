package com.esame.EsameProgOgg.model;

/**
 * <p>
 * <b> Classe </b> per la creazione dei Metadati 
 * </p>
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 *
 */

public class Metadati {
	String alias;
	String sourceField;
	String type;
	
	/**
	 * Costruttore
	 * @param alias indica l'ttributo della classe Post
	 * @param sourceField indica il campo dell'attributo della classe Post
	 * @param type il tipo dell'attributo della classe Post
	 */
	public Metadati(String alias, String sourceField, String type) {
		this.alias = alias;
		this.sourceField = sourceField;
		this.type = type;
	}
	
	
	/**
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}


	/**
	 * @param alias the alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}


	/**
	 * @return the sourceField
	 */
	public String getSourceField() {
		return sourceField;
	}


	/**
	 * @param sourceField the sourceField to set
	 */
	public void setSourceField(String sourceField) {
		this.sourceField = sourceField;
	}


	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * override del metodo toString
	 */
	@Override

	public String toString() {
		return "Metadati [alias=" + alias + ", sourceField=" + sourceField + ", type=" + type + "]";
	}


	
	

}
