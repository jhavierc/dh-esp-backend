package co.dh.ccepeda.service.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import co.dh.ccepeda.service.IWeather;

@Service
public class WeatherService implements IWeather {
	
	private static final Logger LOG = Logger.getLogger(WeatherService.class.getSimpleName());

	@Override
	public Integer getTempereture(String city, String country) {
		LOG.log(Level.INFO,"City {0}", city);
		LOG.log(Level.INFO,"Country {0}", country);
		return 25;
	}

}
