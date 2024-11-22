package com.xworkz.course.repo;

import com.xworkz.course.dto.CourseDTO;

public interface CourseRepository {

	boolean save(CourseDTO courseDTO);

}
