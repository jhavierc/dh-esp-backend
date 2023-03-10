package co.dh.ccepeda.services.impl;

import java.util.ArrayList;
import java.util.List;

import co.dh.ccepeda.entity.Plan;
import co.dh.ccepeda.entity.Suscripcion;
import co.dh.ccepeda.services.ISuscripcionService;

public class SuscriptionService implements ISuscripcionService {
	
	private List<Suscripcion> listaBD;
	
	
	public SuscriptionService() {
		listaBD = new ArrayList<>();
		listaBD.add(new Suscripcion(1,"27/02/2023","27/03/2023",new Plan(1,"AAA",22),1));
		listaBD.add(new Suscripcion(1,"27/02/2023","27/03/2023",new Plan(2,"BBB",22),2));
		listaBD.add(new Suscripcion(1,"27/02/2023","27/03/2023",new Plan(3,"CCC",22),3));
		listaBD.add(new Suscripcion(1,"27/02/2023","27/03/2023",new Plan(4,"DDD",22),4));
		listaBD.add(new Suscripcion(1,"27/02/2023","27/03/2023",new Plan(1,"AAA",22),5));
	}

	@Override
	public Suscripcion findByUserId(int userId) {
		Suscripcion suscripcion = null;
		for (Suscripcion s : listaBD) {
			if(s.getUserId()==userId) {
				 suscripcion = s;
				 break;
			 }
		}
		return suscripcion;
	}

}
