package com.tonelv.rateandco.rs.irepositories;

import java.util.List;

import com.tonelv.rateandco.rs.models.Course;
import org.springframework.data.repository.CrudRepository;

public interface ICoursesRepository extends CrudRepository<Course, Integer> {

}
