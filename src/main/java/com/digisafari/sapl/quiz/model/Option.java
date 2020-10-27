package com.digisafari.sapl.quiz.model;

public class Option {

	private Integer id;
	private String value;
	private boolean iscorrect;
	private String descrption;
	
	
	// no argument constructor 
	public Option() {
		// TODO Auto-generated constructor stub
	}

	// getters and setters begin

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the iscorrect
	 */
	public boolean isIscorrect() {
		return iscorrect;
	}

	/**
	 * @param iscorrect the iscorrect to set
	 */
	public void setIscorrect(boolean iscorrect) {
		this.iscorrect = iscorrect;
	}

	/**
	 * @return the descrption
	 */
	public String getDescrption() {
		return descrption;
	}

	/**
	 * @param descrption the descrption to set
	 */
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	
	// getters and setters end

	// To string() begin

	@Override
	public String toString() {
		return "Option [id=" + id + ", value=" + value + ", iscorrect=" + iscorrect + ", descrption=" + descrption
				+ "]";
	}
	
	// To string() end

}
