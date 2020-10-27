package com.digisafari.sapl.quiz.model;

public class QuestionType {

	private Boolean MCQ;
	
	// no argument constructor 
	public QuestionType(Boolean MCQ) {
		this.MCQ = MCQ;
	}

	
	// getters and setters begin

	/**
	 * @return the mCQ
	 */
	public Boolean getMCQ() {
		return MCQ;
	}

	/**
	 * @param mCQ the mCQ to set
	 */
	public void setMCQ(Boolean mCQ) {
		MCQ = mCQ;
	}

	// getters and setters end

	// To string() begin

	@Override
	public String toString() {
		return "QuestionType [MCQ=" + MCQ + "]";
	}
	
	// To string() end

	
}
