package com.esame.EsameProgOgg;


import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.esame.EsameProgOgg.service.FacebookService;

/**
 * <p>
 * <b> Classe </b> che contiene il main e il lancio del framework Springboot 
 * </p>
 * @author Samuele Del Moro
 * @author Lorenzo Silvestri
 * @author Antonio Antonini
 * 
 */




@SpringBootApplication
public class EsameProgOggApplication {
	

	public static void main(String[] args) throws Exception {
	

	FacebookService.metadata("https://graph.facebook.com/108350877558679/feed?access_token=EAACae8EWj6UBAPCnGksMwLUdD6QnZCPiWMvaHTURou7rwJ2VDc1VpgMCWlFPuO8THGhR9pcQQebvZCrC9ZB9RzwKR8yTiuNDoLipnQoT1qh5hcmbRmdkPZBrfNlufrUvR7ZBXhl0aWRHuDxOVzGE488PZAokc6CfzKmRyzTOthZBi99f6xgY2CD9bjk8MAmVCkZD");
	SpringApplication.run(EsameProgOggApplication.class, args);
}
}	
		
	


