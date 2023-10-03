package in.practice.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankingApplication {
	
	@GetMapping("/message")
	public String welcomePage() {
		return "Welcome to ICICI Bank";
	}
}
