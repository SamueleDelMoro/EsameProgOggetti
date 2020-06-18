package com.esame.EsameProgOgg;

import static org.junit.Assert.assertThrows;


import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.esame.EsameProgOgg.exception.BetweenException;
import com.esame.EsameProgOgg.exception.CommandException;
import com.esame.EsameProgOgg.exception.UrlNotFoundException;
import com.esame.EsameProgOgg.filter.FilterBt;
import com.esame.EsameProgOgg.model.Post;
import com.esame.EsameProgOgg.service.FilterService;
import com.esame.EsameProgOgg.service.StatisticsService;
import com.esame.EsameProgOgg.util.Parsing;
import com.esame.EsameProgOgg.util.Read;

/**
 * classe di test sulle eccezioni
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 *
 */


class ExceptionTest {
	private ArrayList<Post>array= new ArrayList<Post>();
    private String urlget;
    private ArrayList<String>param= new ArrayList<String>();
    private FilterBt between;
    private final String invalidUrl ="http://tiboe";
    private final String invalidcommand1 ="iuhbnm";
    private final String invalidcommand2 ="vghukj";

	@BeforeEach
	void setUp() throws Exception {
		urlget="https://graph.facebook.com/108350877558679/feed?access_token=EAACae8EWj6UBAPCnGksMwLUdD6QnZCPiWMvaHTURou7rwJ2VDc1VpgMCWlFPuO8THGhR9pcQQebvZCrC9ZB9RzwKR8yTiuNDoLipnQoT1qh5hcmbRmdkPZBrfNlufrUvR7ZBXhl0aWRHuDxOVzGE488PZAokc6CfzKmRyzTOthZBi99f6xgY2CD9bjk8MAmVCkZD";    
	    array=Parsing.run(urlget);
		param.add("300");
		param.add("10");
		between=new FilterBt(array,param);
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	void test() {
		assertThrows(CommandException.class, ()->StatisticsService.statFormulation(invalidcommand1,array));
		assertThrows(CommandException.class, ()->FilterService.filterFormulation(invalidcommand2, array, param));
	}
	/**
	 * verifica del funzionamento eccezione UrlNotFoundException usato nel Reading
	 */
	@Test
	void test2() {

		assertThrows(UrlNotFoundException.class, ()->Read.readUrl(invalidUrl));
	}
	
	/**
	 * verifica del funzionamento eccezione BetweenException usato nel Between filter
	 */
	@Test
	void test4() {
	assertThrows(BetweenException.class, ()->between.doFilter());

	}
}


