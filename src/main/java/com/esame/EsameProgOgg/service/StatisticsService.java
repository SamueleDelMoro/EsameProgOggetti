package com.esame.EsameProgOgg.service;

import java.lang.reflect.Constructor;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import com.esame.EsameProgOgg.exception.CommandException;
import com.esame.EsameProgOgg.model.Post;
import com.esame.EsameProgOgg.stat.StatisticsCalculate;

/**
 * <p>
 * <b> Classe </b> per il servizio statistica
 * </p>
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 *  */
public class StatisticsService {
	
	private static String dir="com.esame.EsameProgOgg.stat.Statistics";
	/**
	 * Metodo il quale calcola la classe statistica 
	 * @param command, specifica per la statistica utile alla creazione della classe
	 * @param post, arrayList di post da analizzare
	 * @return statistica impostata secondo le richieste
	 * @throws commandStatException 
	 */
	public static StatisticsCalculate statFormulation(String command, ArrayList<Post> post) throws CommandException {
		
		StatisticsCalculate newStat = null;
		try {
			Class <?> c = Class.forName(dir+command.substring(0, 1).toUpperCase()+command.substring(1));
			
			Constructor<?> con = c.getDeclaredConstructor(ArrayList.class);
			newStat= (StatisticsCalculate) con.newInstance(post);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		throw new CommandException(e);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newStat;
	}

}
