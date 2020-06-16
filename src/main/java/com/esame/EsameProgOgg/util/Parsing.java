package com.esame.EsameProgOgg.util;

import java.io.IOException;




import java.net.MalformedURLException;
import java.util.ArrayList;

import java.util.jar.JarException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.esame.EsameProgOgg.exception.UrlNotFoundException;

import com.esame.EsameProgOgg.model.Post;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;




/**
 * <p>
* <b> Classe </b> di parsing dato una stringa url sorgente
* @author Samuele Del Moro	
* @author Lorenzo Silvestri
* @author Antonio Antonini
*
*/

public class Parsing {
	/**
	 * metodo di parsing per la creazione di arraylist di post
	 * @param url , url da dove otteniamo la stringa per il parsing, alla quale si effettua una richiesta get
	 * @return arraylist di post, l'elenco da utilizzare
	 * @throws MalformedURLException
	 * @throws JsonMappingException
	 * @throws JsonProcessingException
	 * @throws JSONException
	 * @throws UrlNotFoundException
	 */
	public static ArrayList<Post> run(String url) throws MalformedURLException, JsonMappingException, JsonProcessingException, JarException, UrlNotFoundException, JarException, JSONException, IOException  {
		ArrayList<Post>postatore=new ArrayList<Post>();	
		
		
		String str = null;
		try {
			str = Read.readUrl(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
		JSONObject obj = new JSONObject(str);
		

		JSONArray t=obj.getJSONArray("data");
		for(int i=0; i<t.length();i++){
			
			
			JSONObject res1 = obj.getJSONArray("data").getJSONObject(i);
			ObjectMapper mapper= new ObjectMapper();
			mapper.findAndRegisterModules();
			
			
			try {
				
				
				Post post = mapper.readValue(res1.toString(),Post.class);
				
				postatore.add(post);
				
				
			}
			catch (JsonProcessingException e) {
	            throw e;
	        }
			
		}
		return postatore;
		
		
	}
	
	
	
	
}
