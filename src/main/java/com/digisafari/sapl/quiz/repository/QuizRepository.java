package com.digisafari.sapl.quiz.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.digisafari.sapl.quiz.model.Quiz;

@Repository
public interface QuizRepository extends MongoRepository<Quiz,String> {
	//Query Methods
}
