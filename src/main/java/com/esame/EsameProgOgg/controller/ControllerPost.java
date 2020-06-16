package com.esame.EsameProgOgg.controller;

import org.springframework.web.bind.annotation.RequestBody;



import org.springframework.web.bind.annotation.RequestMapping;



import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;

import com.esame.EsameProgOgg.exception.BetweenException;
import com.esame.EsameProgOgg.exception.CommandException;

import com.esame.EsameProgOgg.model.Metadati;
import com.esame.EsameProgOgg.model.Post;
import com.esame.EsameProgOgg.model.Statistics;
import com.esame.EsameProgOgg.service.AndOrFilter;
import com.esame.EsameProgOgg.service.FacebookService;
import com.esame.EsameProgOgg.service.StatisticsService;
import com.esame.EsameProgOgg.stat.StatisticsCalculate;

/**
 * <p>
 * <b> Classe </b> tramite la quale si fanno le richieste al localhost
 * </p>
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 * @see com.esame.EsameProgOgg.stat
 * @see com.esame.ProgOgg.filter
 */




@RestController

public class ControllerPost {
	
	 
	/**
	 * Metodo get tramite il quale abbiamo l'elenco totale dei metadati
	 * @return elenco dei metadati
	 */
	

	@RequestMapping(value = "/metadata", method = RequestMethod.GET)
	public  ArrayList<Metadati> metadati(){
		return FacebookService.getMetadati();
	}
	
	/**
	 * Metodo get tramite il quale abbiamo l'elenco totale dei post
	 * @return elenco dei post con i relativi attributi
	 * @throws IOException
	 */
	@RequestMapping(value = "/posts", method = RequestMethod.GET)
	public static ArrayList<Post> post() throws IOException {
		return FacebookService.getPosts();
	}
	
	/**
	 * Metodo get tramite il quale vengono calcolate le statistiche su elenco totale di post
	 * @param specifica ,cioe la specifica di statistica richiesta
	 * @return un oggetto con la statistica relativa 
	 * @throws commandStatException
	 */
	@RequestMapping(value="stat", method=RequestMethod.GET)
	public Statistics stat(@RequestParam(value="specifica") String specifica) throws CommandException {
		StatisticsCalculate newStat= StatisticsService.statFormulation(specifica, FacebookService.posts);
		return newStat.doStat();
	}
	
	/**
	 * Metodo tramite il quale operiamo un filtraggio su un elenco di post
	 * @param type , ovvero il tipo di filtraggio (and, or , default)
	 * @param map , mappa la quale contiene come chiave i metodi di filtraggio e come valori le stringhe di parametri di filtraggio
	 * @return elenco dei post filtrati
	 * @throws commandStatException
	 * @throws BetweenException
	 */
	
	@RequestMapping(value="filter", method=RequestMethod.POST)
	public ArrayList<Post> filter(@RequestParam(value="type")String type,@RequestBody HashMap<String,ArrayList<String>> map) throws CommandException, BetweenException{	
		return AndOrFilter.andOrFiltering(type, FacebookService.posts, map);
	}
	
	/**
	 * Metodo tramite il quale calcoliamo la statistica su elenco totale di post filtrati
	 * @param type , ovvero tipo di filtraggio (and, or , default)
	 * @param stat , ovvero la stringa tipo di statistica
	 * @param map , mappa la quale contiene come chiave i metodi di filtraggio e come valori le stringhe di parametri di filtraggio
	 * @return statistica su elenco di post filtrati
	 * @throws commandStatException
	 * @throws BetweenException
	 */
	@RequestMapping(value="stat",method=RequestMethod.POST)
	public Statistics statFiltered(@RequestParam(value="type") String type,@RequestParam(value="spec") String stat, @RequestBody HashMap<String,ArrayList<String>> map) throws CommandException, BetweenException {
		ArrayList<Post> postFiltered=AndOrFilter.andOrFiltering(type, FacebookService.posts, map);
		StatisticsCalculate newStat= StatisticsService.statFormulation(stat, postFiltered);
		return newStat.doStat();
		
	}
	
	
}
