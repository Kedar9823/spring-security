package in.practice.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankingController {
	
	@GetMapping("/")
	public String homePage() {
		return "Welcome to ICICI Bank";
	}
	
	@GetMapping("/transfer")
	public String transfer() {
		return "Transfered money";
	}
	
	@GetMapping("/balance")
	public String checkBalance() {
		return "Balance amount: 10 Crore";
	}
	
	@GetMapping("/aboutus")
	public String aboutUs() {
		return "ICICI bank is governed by Government Of India";
	}
}
