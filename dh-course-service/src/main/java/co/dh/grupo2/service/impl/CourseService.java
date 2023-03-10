package co.dh.grupo2.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import co.dh.grupo2.entity.Chapter;
import co.dh.grupo2.entity.Course;
import co.dh.grupo2.entity.Suscripcion;
import co.dh.grupo2.service.ICourseService;
import co.dh.grupo2.service.ISuscriptionClient;
import co.dh.grupo2.util.FechaUtil;

public class CourseService implements ICourseService {
	
	private static final String MSJ_SUSCRIPTION_NOT_FOUND="No se encontró asociado una suscrpición asociado al usuario que intenta consultar el curso";
	private static final String MSJ_SUSCRIPTION_NOT_ACTIVE="El usuario no cuenta con una suscripcion activa";
	
	private ISuscriptionClient suscriptionClient;
	
	private List<Course> courses;
	
	public CourseService(ISuscriptionClient suscriptionClient) {
		 this.courses = new ArrayList<>();
		
		 List<Chapter> chapters = new ArrayList<>();
		 chapters.add(new Chapter(1, "Capitulo 1", "www.dh.com/modules/chapter1"));
		 chapters.add(new Chapter(1, "Capitulo 2", "www.dh.com/modules/chapter2"));
		 chapters.add(new Chapter(1, "Capitulo 3", "www.dh.com/modules/chapter3"));
		 chapters.add(new Chapter(1, "Capitulo 4", "www.dh.com/modules/chapter4"));
		 
		 this.courses.add(new Course(1, "Esp Backend I", chapters));
		 this.courses.add(new Course(2, "Base de datos II", chapters));
		 this.courses.add(new Course(3, "Gestion de producto", chapters));
		 
		 this.suscriptionClient = suscriptionClient;
		
	}

	@Override
	public ResponseEntity<Course> getById(int courseID, int userID) {
		Course course = new Course();
		Suscripcion suscripcion = this.suscriptionClient.getSuscripcionWithClientID(userID);
		if(suscripcion==null) {
			course.setMessage(MSJ_SUSCRIPTION_NOT_FOUND);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(course);
		}
		Date fechaSistema = new Date();
		Date fechaInicioSuscripcion = FechaUtil.castearStringToDate(suscripcion.getStartDate());
		Date fechaFinSuscripcion = FechaUtil.castearStringToDate(suscripcion.getEndDate());
		if(fechaSistema.before(fechaInicioSuscripcion) || fechaSistema.after(fechaFinSuscripcion)) {
			course.setMessage(MSJ_SUSCRIPTION_NOT_ACTIVE);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(course);
		}
		
		for (Course c : courses) {
			if(c.getId()==courseID) {
				course = c;
				break;
			}
		}
		return ResponseEntity.status(HttpStatus.OK).body(course);
	}

}
