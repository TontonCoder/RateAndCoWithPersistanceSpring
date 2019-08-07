package com.tonelv.rateandco.rs;

import com.tonelv.rateandco.rs.irepositories.ICoursesRepository;
import com.tonelv.rateandco.rs.models.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CoursesController {

    private  ICoursesRepository coursesRepository;

    @GetMapping("courses/")
    @ResponseBody
    public Iterable<Course> getAll()
    {

        return coursesRepository.findAll();
    }

    @GetMapping("courses/addRandom")
    @ResponseBody
    public String InsertRandom()
    {
        Course course = new Course("Java 8","Apprenez à utiliser Java ", false);
        coursesRepository.save(course);

        return "Done";
    }

}
