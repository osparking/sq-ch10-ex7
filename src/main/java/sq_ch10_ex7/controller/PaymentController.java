package sq_ch10_ex7.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sq_ch10_ex7.dto.PaymentDetails;

@RestController
public class PaymentController {
	
	@PostMapping("/payment")
	public ResponseEntity<PaymentDetails> processPayment(
			@RequestBody PaymentDetails details) {
		return ResponseEntity.accepted().body(details);
	}
}
