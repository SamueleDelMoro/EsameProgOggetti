package com.esame.EsameProgOgg.exception;

/**
 * <p>
 * <b> Classe </b> di eccezione per stringa errata nel momento in cui viene creata la classe stat/filter
 * </p>
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 *
 */
public class CommandException extends ClassNotFoundException {
	

	/**
	 * classe costruttore
	 * @param e , eccezione di tipo ClassNotFound
	 */
	public CommandException(ClassNotFoundException e) {
		super();
		System.out.println("STRINGA COMMAND NON VALIDA");
	}
}
