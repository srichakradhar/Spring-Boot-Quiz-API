package com.digisafari.sapl.quiz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digisafari.sapl.quiz.excepetion.QuizAlreadyExistsException;
import com.digisafari.sapl.quiz.excepetion.QuizNotFoundException;
import com.digisafari.sapl.quiz.model.Quiz;
import com.digisafari.sapl.quiz.repository.QuizRepository;

@Service
public class QuizService implements IQuizService {
	
	@Autowired
	QuizRepository quizRepository;

	@Override
	public Quiz createNewQuiz(Quiz quiz) throws QuizAlreadyExistsException {
		// Quiz logic to create quiz
		Quiz createdQuiz = null;
		try {
			Optional<Quiz> quizById = this.quizRepository.findById(quiz.getid());
			if(quizById.isPresent()) {
				throw new QuizAlreadyExistsException();
			} else {
				createdQuiz = this.quizRepository.save(quiz);
			}
		} catch (QuizAlreadyExistsException e) {
			throw e;
		}
		catch (Exception e) {
		}
		return createdQuiz;
	}

	@Override
	public List<Quiz> getQuizList() {
		// to find all quizzes
		
		return this.quizRepository.findAll();
	}

	@Override
	public Quiz updateQuiz(Quiz quiz) throws QuizNotFoundException {
		// TODO Auto-generated method stub
		Quiz updatedQuiz = null;
		try {
        Optional<Quiz> quizById = this.quizRepository.findById(quiz.getid());
        if (quizById.isPresent()) {
        	Quiz updateQuiz = quizById.get();
            updateQuiz.setid(quiz.getid());
            updateQuiz.setTitle(quiz.getTitle());
            updateQuiz.setQuestionType(quiz.getQuestionType());
            updateQuiz.setOption(quiz.getOption());
            updateQuiz.setMarks(quiz.getMarks());
            updateQuiz.setNegtiveMarks(quiz.getNegtiveMarks());
            updateQuiz.setTaxonomyLevel(quiz.getTaxonomyLevel());
            updateQuiz.setCreatedOn(quiz.getCreatedOn());
            updateQuiz.setUpdatedOn(quiz.getUpdatedOn());
            updateQuiz.setOption(quiz.getOption());
            updateQuiz.setIncorrectAnswerExplanation(quiz.getIncorrectAnswerExplanation());
            quizRepository.save(updateQuiz);
        } else { // added constructor to display feedback
            throw new QuizNotFoundException();
        }
		}catch (Exception e) {
		}
		return updatedQuiz;
	}

	@Override
	public Quiz getQuizById(String id) throws QuizNotFoundException {
		Quiz quiz = null;
		try {
			Optional<Quiz> quizById = this.quizRepository.findById(id);
			if(!quizById.isPresent()) {
				throw new QuizNotFoundException();
			}
		} catch (QuizNotFoundException e) {
			throw e;
		}
		catch (Exception e) {
		}
		return quiz;
	}

	@Override
	public boolean deleteQuiz(String id) throws QuizNotFoundException {
		// delete Quiz by ID
		boolean status = false;
		Optional<Quiz> findById = quizRepository.findById(id);
		if(!findById.isPresent()) {
			throw new QuizNotFoundException();
		} else {
			quizRepository.delete(findById.get());
			status = true;
		}
		return status;
	}

}
