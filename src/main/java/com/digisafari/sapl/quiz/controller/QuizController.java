package com.digisafari.sapl.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digisafari.sapl.quiz.excepetion.QuizAlreadyExistsException;
import com.digisafari.sapl.quiz.excepetion.QuizNotFoundException;
import com.digisafari.sapl.quiz.model.Quiz;
import com.digisafari.sapl.quiz.service.QuizService;

@RestController
@RequestMapping("api/v1")

public class QuizController {
	// endpoint http://localhost:8084/api/v1/
	// create new quiz (json object) -> http post
	// http://localhost:8084/api/v1/quiz

	private QuizService quizService;
	private ResponseEntity<?> responseEntity;

	@Autowired
	public QuizController(QuizService quizService) {
		super();
		this.quizService = quizService;
	}

	@PostMapping("/quiz")
	public ResponseEntity<?> createQuiz(@RequestBody Quiz quiz) throws QuizAlreadyExistsException {
		Quiz createdQuiz = null;
		try {
			createdQuiz = this.quizService.createNewQuiz(quiz);
			if (createdQuiz != null) {
				responseEntity = new ResponseEntity<>(createdQuiz, HttpStatus.CREATED);
			}
		} catch (QuizAlreadyExistsException e) {
			// in case quiz already exists
			throw e;
		} catch (Exception e) {
			// TODO: handle exception
			responseEntity = new ResponseEntity<>("Some internal eror accured. Please try again!!!",
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}

	@GetMapping("/quiz")
	public ResponseEntity<?> getAllQuizzes() {
		List<Quiz> quizList = null;
		try {
			quizList = this.quizService.getQuizList();
			responseEntity = new ResponseEntity<>(quizList, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			responseEntity = new ResponseEntity<>("Some internal eror accured. Please try again!!!",
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}

	// get quiz by id
	@GetMapping("/quiz/{id}")
	public ResponseEntity<?> getQuiz(@PathVariable String id) throws QuizNotFoundException {
		Quiz quiz = null;
		try {
			quiz = this.quizService.getQuizById(id);
			if (quiz != null) {
				responseEntity = new ResponseEntity<>(quiz, HttpStatus.OK);
			}
		} catch (QuizNotFoundException e) {
			throw e;
		} catch (Exception e) {
			responseEntity = new ResponseEntity<>("Some internal eror accured. Please try again!!!",
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}

}
