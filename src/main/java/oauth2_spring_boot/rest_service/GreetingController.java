package oauth2_spring_boot.rest_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableGlobalMethodSecurity(prePostEnabled = true)
@RestController
public class GreetingController {
	
	
@Autowired	
private GreetingService greetingService;	
@PreAuthorize("#oauth2.hasScope('level_1')")
@RequestMapping(value="/greeting", method=RequestMethod.GET)
public ResponseEntity<String> greet (){
	return new ResponseEntity<String>(greetingService.greet(), HttpStatus.OK );
}

}
