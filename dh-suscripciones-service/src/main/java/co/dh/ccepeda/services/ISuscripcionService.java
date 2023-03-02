package co.dh.ccepeda.services;

import co.dh.ccepeda.entity.Suscripcion;

public interface ISuscripcionService {
	
	public Suscripcion findByUserId(int userId);

}
