
package com.esame.EsameProgOgg.exception;


import java.net.UnknownHostException;
/**
 * <p>
 * <b> Classe </b> di eccezione per URL non trovato
 * </p>
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 *
 */
public class UrlNotFoundException extends Exception {
	

	/**
	 * costruttore
	 * @param e , eccezione di tipo UknownHost
	 */
	public UrlNotFoundException ( UnknownHostException e) {
		super();
		System.out.println("URL NON TROVATO");
	}
}