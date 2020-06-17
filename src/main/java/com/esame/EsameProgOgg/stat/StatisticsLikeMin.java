package com.esame.EsameProgOgg.stat;

import java.util.ArrayList;

import com.esame.EsameProgOgg.model.Post;
import com.esame.EsameProgOgg.model.StatisticsNum;

public class StatisticsLikeMin implements StatisticsCalculate {
private ArrayList<Post> post=new ArrayList<Post>();
	
	public StatisticsLikeMin(ArrayList<Post> post) {
		this.post=post;
	}
	
	/**
	 * metodo di calcolo statistica
	 */
	@Override
	public  StatisticsNum doStat() {
	
		int min=0;
		int num=0;
		
		for(int i=0;i<post.size();i++) {
			if(post.get(i).getLike()!=0) {
				num=post.get(i).getLike();}
				if(num>min)
					min=num;
			}
		
		
		StatisticsNum stat= new StatisticsNum();
		stat.setMax(min);
		stat.setSpecifica("Lunghezza max post");
		return stat;
		
}

}
