package com.esame.EsameProgOgg.filter;





import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.esame.EsameProgOgg.model.Post;




	
public class FilterTimeAfter implements Filter {
	
	private ArrayList<Post> post= new ArrayList<Post>();
	private ArrayList<String> param= new ArrayList<String>();
	


	public FilterTimeAfter(ArrayList<Post> post, ArrayList<String> param) {
		this.post=post;
		this.param=param;
		
	}  
	
	
	
	/**
	 * metodo che consente il filtraggio
	 * @throws java.text.ParseException 
	 */
	
	
	public ArrayList<Post> doFilter() throws ParseException{
		ArrayList<Post> postFiltered =new ArrayList<Post>();
		SimpleDateFormat formatter1=new SimpleDateFormat("yyyy-MM-dd");
		
		for(Post p : post) {
			if(p.getCreated_time()!=null) {
		
			Date date2=formatter1.parse(param.get(0));
			Date date=formatter1.parse(p.getCreated_time());
		
			if(date.compareTo(date2) > 0)
			postFiltered.add(p);
             
			}
			 
		}
		
		return postFiltered;
	}
}
