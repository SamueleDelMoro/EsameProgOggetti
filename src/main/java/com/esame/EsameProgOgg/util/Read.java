package com.esame.EsameProgOgg.util;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;

import com.esame.EsameProgOgg.exception.UrlNotFoundException;

/**
 * <p>
* <b> Classe </b> di lettura
* @author Samuele Del Moro
* @author Lorenzo Silvestri
* @author Antonio Antonini
*
*/
public class Read {
	
	/**
	 * lettura dato un url
	 * @param url
	 * @return String lettura da url
	 * @throws IOException
	 * @throws UrlNotFoundException
	 */

	public static String readUrl(String url) throws IOException, UrlNotFoundException  {

		String str=new String();
		URL url1;
		try {
			url1 = new URL(url);


		BufferedReader in= new BufferedReader(new InputStreamReader(url1.openStream()));
		String line;
		while((line=in.readLine())!=null) {
			str+=line;
		}

} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();

}catch (UnknownHostException e ) {
	throw new UrlNotFoundException(e);

}
		return str;
	}
	
	/**
	 * lettura da file
	 * @param file
	 * @return String di lettura da file
	 * @throws IOException
	 */
	public static ArrayList<String> readFile(String file) throws IOException {
		ArrayList<String> post=new ArrayList<String>();
		BufferedReader in= new BufferedReader(new FileReader(file));
		String line;
		while((line=in.readLine())!=null) {
			post.add(new String(line));
		}
		in.close();
		return post;
	}

}