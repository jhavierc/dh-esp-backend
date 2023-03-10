package co.dh.ccepeda.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.dh.ccepeda.service.impl.WeatherService;

@RestController
@RequestMapping("/weather")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
public class WeatherController {
	
	@Autowired
	private WeatherService weatherService;
	
	@GetMapping
	private Integer getTemperature(@RequestParam("city") String city, @RequestParam("country") String country) {
		return weatherService.getTempereture(city, country);
	}

}
