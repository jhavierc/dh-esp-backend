package co.dh.ccepeda.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.dh.ccepeda.entity.Suscripcion;
import co.dh.ccepeda.services.impl.SuscriptionService;

@RestController
@RequestMapping("/subscription")
public class SuscripcionController {

	@Autowired
	private SuscriptionService suscriptionService;
	
	//@Value("${server.port}")
	//private int serverPort;

	//localhost:8080/subscription/find/1
	//localhost:8080/subscription/find?userId=1
	@GetMapping("/find")
	public ResponseEntity<Suscripcion> getSuscriptionByUserId(@RequestParam("userId") int userID) {
		//System.out.println("Port :"+serverPort);
		Suscripcion s = suscriptionService.findByUserId(userID);
		if (s != null) {
			return ResponseEntity.status(HttpStatus.OK).body(s);
		}
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);

	}

}
