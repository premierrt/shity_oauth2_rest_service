package oauth2_spring_boot.rest_service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

	public  String greet(){
		return "hello!";
	}
	
}
