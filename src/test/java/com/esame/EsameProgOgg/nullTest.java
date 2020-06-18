package com.esame.EsameProgOgg;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.esame.EsameProgOgg.model.Post;
import com.esame.EsameProgOgg.util.Parsing;

/**
 * classe di test per verificare che non ci siano valori nulli
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 *
 */
class nullTest {
	
     private ArrayList<Post>array= new ArrayList<Post>();
     private String urlget;
     private Post post;
    

	@BeforeEach
	void setUp() throws Exception {
		 urlget="https://graph.facebook.com/108350877558679/feed?access_token=EAACae8EWj6UBAPCnGksMwLUdD6QnZCPiWMvaHTURou7rwJ2VDc1VpgMCWlFPuO8THGhR9pcQQebvZCrC9ZB9RzwKR8yTiuNDoLipnQoT1qh5hcmbRmdkPZBrfNlufrUvR7ZBXhl0aWRHuDxOVzGE488PZAokc6CfzKmRyzTOthZBi99f6xgY2CD9bjk8MAmVCkZD";    
			array=Parsing.run(urlget);
			post=array.get(0);
			
	}

	@AfterEach
	void tearDown() throws Exception {
	}

		/**
		 * test sul parsing 
		 */
	    @Test
	    void test1() {
	    	assertNotNull(array);
	    }
	    /**
	     * test sul post
	     */
	    @Test
	    void test2() {
	    	assertNotNull(post);
	    }
}


