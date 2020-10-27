package com.digisafari.sapl.quiz.excepetion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "quiz already exists with this ID")
public class QuizAlreadyExistsException extends Exception {

}
