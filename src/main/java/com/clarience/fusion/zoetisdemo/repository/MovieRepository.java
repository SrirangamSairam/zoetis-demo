package com.clarience.fusion.zoetisdemo.repository;

import com.clarience.fusion.zoetisdemo.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
