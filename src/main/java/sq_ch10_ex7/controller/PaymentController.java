package sq_ch10_ex7.controller;

import java.util.logging.Logger;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import space.jbpark.utility.MyUtil;
import sq_ch10_ex7.dto.PaymentDetails;

@RestController
public class PaymentController {
	
	private final Logger logger = 
			MyUtil.getLogger(PaymentController.class.getName());
	
	@PostMapping("/payment")
	public ResponseEntity<PaymentDetails> processPayment(
			@RequestBody PaymentDetails details) {
		logger.info("지불금액: " + details.getAmount());
		return ResponseEntity.accepted().body(details);
	}
}
