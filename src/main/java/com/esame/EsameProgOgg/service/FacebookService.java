package com.esame.EsameProgOgg.service;


import java.io.IOException;



import java.util.ArrayList;


import org.json.JSONException;
import org.springframework.stereotype.Service;

import com.esame.EsameProgOgg.exception.UrlNotFoundException;

import com.esame.EsameProgOgg.model.Metadati;
import com.esame.EsameProgOgg.model.Post;
import com.esame.EsameProgOgg.util.Parsing;




/**
 * <p>
 * <b> Classe </b> per la creazione di un database di metadati e di post
 * </p>
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 *
 */



@Service
public class FacebookService {
	static ArrayList<Metadati> metadati= new ArrayList<>();
	public static ArrayList<Post> posts= new ArrayList<>();
	
	
	/**
	 * Metodo grazie al quale otteniamo la lista dei post e la lista dei metadati
	 * @param code indica l'url dal quale prendere i post
	 * @throws UrlNotFoundException
	 * @throws JSONException
	 * @throws IOException
	 */
	public static void metadata(String code ) throws UrlNotFoundException, JSONException, IOException {
		
		posts=Parsing.run(code);
		
		
		metadati.add(new Metadati("created_time","Time publishing post","String"));
		metadati.add(new Metadati("id", "Id del post", "String"));
		metadati.add(new Metadati("message", "Descrizione del post", "String " ));
		metadati.add(new Metadati("media_type", "tipo di media" , "String"));
		metadati.add(new Metadati("total_count", "numero like", "int"));
		
	}
	
	/**
	 * @return the metadati
	 */
	public static ArrayList<Metadati> getMetadati() {
		return metadati;
	}
	
	/**
	 * Metodo per il ritorno dei post da richiamare nel controller
	 * @return elenco dei post
	 */
		
	public static ArrayList<Post> getPosts() {
		return posts;
	}
	
	
	
}
	
	
	

