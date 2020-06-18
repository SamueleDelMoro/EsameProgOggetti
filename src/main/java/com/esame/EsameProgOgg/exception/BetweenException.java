package com.esame.EsameProgOgg.exception;

/**
 * <p>
 * <b> Classe </b> di eccezione per l'errore di inserimento di valori per il filtro between
 * </p>
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 *
 */
public class BetweenException extends Exception {



	/**
	 * classe costruttore
	 */
	public BetweenException() {

		System.out.println("PARAMETRI INSERITI NON VALIDI, UGUALI O SECONDO VALORE MINORE DEL PRIMO");


	}


}