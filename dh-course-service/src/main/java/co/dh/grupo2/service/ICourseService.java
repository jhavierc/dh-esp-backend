package co.dh.grupo2.service;

import org.springframework.http.ResponseEntity;

import co.dh.grupo2.entity.Course;

public interface ICourseService {

	public ResponseEntity<Course> getById(int courseID, int userID);

}
