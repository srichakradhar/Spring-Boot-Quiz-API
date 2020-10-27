package com.digisafari.sapl.quiz.model;

public class TaxonomyLevel {

	private String remember;
	private String understand;
	private String apply;
	private String analyze;
	private String evaluate;
	private String create;
	
	// no argument constructor 
	public TaxonomyLevel(String remember,  String understand,  String apply,  String analyze,  String evaluate,  String create) {
		this.remember = remember;
		this.understand = understand;
		this.apply = apply;
		this.analyze = analyze;
		this.evaluate = evaluate;
		this.create = create;
	}

	// getters and setters begin

	/**
	 * @return the remember
	 */
	public String getRemember() {
		return remember;
	}

	/**
	 * @param remember the remember to set
	 */
	public void setRemember(String remember) {
		this.remember = remember;
	}

	/**
	 * @return the understand
	 */
	public String getUnderstand() {
		return understand;
	}

	/**
	 * @param understand the understand to set
	 */
	public void setUnderstand(String understand) {
		this.understand = understand;
	}

	/**
	 * @return the apply
	 */
	public String getApply() {
		return apply;
	}

	/**
	 * @param apply the apply to set
	 */
	public void setApply(String apply) {
		this.apply = apply;
	}

	/**
	 * @return the analyze
	 */
	public String getAnalyze() {
		return analyze;
	}

	/**
	 * @param analyze the analyze to set
	 */
	public void setAnalyze(String analyze) {
		this.analyze = analyze;
	}

	/**
	 * @return the evaluate
	 */
	public String getEvaluate() {
		return evaluate;
	}

	/**
	 * @param evaluate the evaluate to set
	 */
	public void setEvaluate(String evaluate) {
		this.evaluate = evaluate;
	}

	/**
	 * @return the create
	 */
	public String getCreate() {
		return create;
	}

	/**
	 * @param create the create to set
	 */
	public void setCreate(String create) {
		this.create = create;
	}

	// getters and setters end

	// To string() begin

	@Override
	public String toString() {
		return "TaxonomyLevel [remember=" + remember + ", understand=" + understand + ", apply=" + apply + ", analyze="
				+ analyze + ", evaluate=" + evaluate + ", create=" + create + "]";
	}
	
	// To string() end

	
}
