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
 * 
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 *
 */

public class Parsing {
	/**
	 * metodo di parsing per la creazione di arraylist di post
	 * 
	 * @param url , url da dove otteniamo la stringa per il parsing, alla quale si
	 *            effettua una richiesta get
	 * @return arraylist di post, l'elenco da utilizzare
	 * @throws MalformedURLException
	 * @throws JsonMappingException
	 * @throws JsonProcessingException
	 * @throws JSONException
	 * @throws UrlNotFoundException
	 */
	public static ArrayList<Post> run(String url) throws MalformedURLException, JsonMappingException,
			JsonProcessingException, JarException, UrlNotFoundException, JarException, JSONException, IOException {
		ArrayList<Post> arrpost = new ArrayList<Post>();

		String str = null;
		try {
			str = Read.readUrl(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JSONObject obj = new JSONObject(str);

		JSONArray t = obj.getJSONArray("data");
		for (int i = 0; i < t.length(); i++) {

			JSONObject res1 = obj.getJSONArray("data").getJSONObject(i);
			ObjectMapper mapper = new ObjectMapper();
			mapper.findAndRegisterModules();

			try {
				Post post = mapper.readValue(res1.toString(), Post.class);
				arrpost.add(post);
			} catch (JsonProcessingException e) {
				throw e;
			}

			for (int h = 0; h < arrpost.size(); h++) {

				arrpost.get(h).setCount(arrpost.get(h).getMessage().length());

			}

			for (int k = 0; k < arrpost.size(); k++) {
				String str2 = null;
				try {
					str2 = Read.readUrl("https://graph.facebook.com/" + arrpost.get(k).getId()
							+ "?fields=likes.summary(true)&access_token=EAACae8EWj6UBAPCnGksMwLUdD6QnZCPiWMvaHTURou7rwJ2VDc1VpgMCWlFPuO8THGhR9pcQQebvZCrC9ZB9RzwKR8yTiuNDoLipnQoT1qh5hcmbRmdkPZBrfNlufrUvR7ZBXhl0aWRHuDxOVzGE488PZAokc6CfzKmRyzTOthZBi99f6xgY2CD9bjk8MAmVCkZD");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				JSONObject obj2 = new JSONObject(str2);

				int res2 = obj2.getJSONObject("likes").getJSONObject("summary").getInt("total_count");
				arrpost.get(k).setLike(res2);
			}

			for (int j = 0; j < arrpost.size(); j++) {

				String str3 = null;
				try {
					str3 = Read.readUrl("https://graph.facebook.com/" + arrpost.get(j).getId()
							+ "?fields=attachments{media_type}&access_token=EAACae8EWj6UBAPCnGksMwLUdD6QnZCPiWMvaHTURou7rwJ2VDc1VpgMCWlFPuO8THGhR9pcQQebvZCrC9ZB9RzwKR8yTiuNDoLipnQoT1qh5hcmbRmdkPZBrfNlufrUvR7ZBXhl0aWRHuDxOVzGE488PZAokc6CfzKmRyzTOthZBi99f6xgY2CD9bjk8MAmVCkZD");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				JSONObject obj3 = new JSONObject(str3);

				String res3 = obj3.getJSONObject("attachments").getJSONArray("data").getJSONObject(0)
						.getString("media_type");
				arrpost.get(j).setMedia_type(res3);

			}

		}
		return arrpost;
	}

}
		
	

