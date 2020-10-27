package com.digisafari.sapl.quiz.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "quiz")
public class Quiz {

	@Id
	private String id;
	private String quizid;
	private String title;
	private QuestionType questionType;
	private Integer marks;
	private Integer negtiveMarks;
	private TaxonomyLevel taxonomyLevel;
	private Date createdOn;
	private Date updatedOn;
	private String incorrectAnswerExplanation;
	private Option option;
	
	
	// no argument constructor 
	public Quiz(String id, String quizid,  String title,  QuestionType questionType,  Integer marks,  Integer negtiveMarks,  TaxonomyLevel taxonomyLevel,  Date createdOn,  Date updatedOn,  String incorrectAnswerExplanation, Option option) {
		this.id = id;
		this.quizid = quizid;
		this.title = title;
		this.questionType = questionType;
		this.marks = marks;
		this.negtiveMarks = negtiveMarks;
		this.taxonomyLevel = taxonomyLevel;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.incorrectAnswerExplanation = incorrectAnswerExplanation;
		this.option = option;
	}

	
	// getters and setters begin

	/**
	 * @return the id
	 */
	public String getid() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setid(String id) {
		this.id = id;
	}

	/**
	 * @return the quizid
	 */
	public String getQuizid() {
		return quizid;
	}

	/**
	 * @param quizid the quizid to set
	 */
	public void setQuizid(String quizid) {
		this.quizid = quizid;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the questionType
	 */
	public QuestionType getQuestionType() {
		return questionType;
	}

	/**
	 * @param questionType the questionType to set
	 */
	public void setQuestionType(QuestionType questionType) {
		this.questionType = questionType;
	}

	/**
	 * @return the marks
	 */
	public Integer getMarks() {
		return marks;
	}

	/**
	 * @param marks the marks to set
	 */
	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	/**
	 * @return the negtiveMarks
	 */
	public Integer getNegtiveMarks() {
		return negtiveMarks;
	}

	/**
	 * @param negtiveMarks the negtiveMarks to set
	 */
	public void setNegtiveMarks(Integer negtiveMarks) {
		this.negtiveMarks = negtiveMarks;
	}

	/**
	 * @return the taxonomyLevel
	 */
	public TaxonomyLevel getTaxonomyLevel() {
		return taxonomyLevel;
	}

	/**
	 * @param taxonomyLevel the taxonomyLevel to set
	 */
	public void setTaxonomyLevel(TaxonomyLevel taxonomyLevel) {
		this.taxonomyLevel = taxonomyLevel;
	}

	/**
	 * @return the createdOn
	 */
	public Date getCreatedOn() {
		return createdOn;
	}

	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	/**
	 * @return the updatedOn
	 */
	public Date getUpdatedOn() {
		return updatedOn;
	}

	/**
	 * @param updatedOn the updatedOn to set
	 */
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	/**
	 * @return the incorrectAnswerExplanation
	 */
	public String getIncorrectAnswerExplanation() {
		return incorrectAnswerExplanation;
	}

	/**
	 * @param incorrectAnswerExplanation the incorrectAnswerExplanation to set
	 */
	public void setIncorrectAnswerExplanation(String incorrectAnswerExplanation) {
		this.incorrectAnswerExplanation = incorrectAnswerExplanation;
	}

	/**
	 * @return the option
	 */
	public Option getOption() {
		return option;
	}

	/**
	 * @param option the option to set
	 */
	public void setOption(Option option) {
		this.option = option;
	}
	
	// getters and setters end
	
	// To string() begin

	@Override
	public String toString() {
		return "Quiz [id=" + id + ", quizid=" + quizid + ", title=" + title + ", questionType=" + questionType
				+ ", marks=" + marks + ", negtiveMarks=" + negtiveMarks + ", taxonomyLevel=" + taxonomyLevel
				+ ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + ", incorrectAnswerExplanation="
				+ incorrectAnswerExplanation + ", option=" + option + "]";
	}
	
	// To string() end

}
