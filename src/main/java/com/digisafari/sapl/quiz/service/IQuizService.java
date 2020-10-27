package com.digisafari.sapl.quiz.service;

import java.util.List;

import com.digisafari.sapl.quiz.excepetion.QuizAlreadyExistsException;
import com.digisafari.sapl.quiz.excepetion.QuizNotFoundException;
import com.digisafari.sapl.quiz.model.Quiz;

public interface IQuizService {

	public Quiz createNewQuiz(Quiz quiz) throws QuizAlreadyExistsException;
	public List<Quiz> getQuizList();
	public Quiz updateQuiz(Quiz quiz) throws QuizNotFoundException;
	public Quiz getQuizById(String id) throws QuizNotFoundException;
	public boolean deleteQuiz(String id) throws QuizNotFoundException;
}
