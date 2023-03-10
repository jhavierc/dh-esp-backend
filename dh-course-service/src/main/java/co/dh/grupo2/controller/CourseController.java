package co.dh.grupo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.dh.grupo2.entity.Course;
import co.dh.grupo2.service.impl.CourseService;

/**
 * 
 * @author ccepeda
 *
 */
@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/find/{courseId}")
	public ResponseEntity<Course> getCourseById(@PathVariable("courseId") int courseID,
			@RequestHeader("user-id") int userID) {

		return courseService.getById(userID, userID);

	}

}
