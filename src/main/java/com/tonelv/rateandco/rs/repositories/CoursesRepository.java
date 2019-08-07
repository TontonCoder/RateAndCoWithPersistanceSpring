package com.tonelv.rateandco.rs.repositories;

import com.tonelv.rateandco.rs.irepositories.ICoursesRepository;
import com.tonelv.rateandco.rs.models.Course;

import java.util.Optional;

public class CoursesRepository implements ICoursesRepository {
    @Override
    public <S extends Course> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Course> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Course> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Course> findAll() {
        return null;
    }

    @Override
    public Iterable<Course> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Course entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Course> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
