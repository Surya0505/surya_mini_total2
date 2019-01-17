package com.cg.mini.model;

public class FeedbackMasterModel {
	
	private int trainingCode;
	private int participantId;
	private int fbPrscomm;
	private int fbClrfydbts;
	private int fbTm;
	private int fbHndOut;
	private int fbHwSwNtwrk;
	private String comments;
	private String suggestions;
	
	public FeedbackMasterModel() {
		// TODO Auto-generated constructor stub
	}

	public FeedbackMasterModel(int trainingCode, int participantId,
			int fbPrscomm, int fbClrfydbts, int fbTm, int fbHndOut,
			int fbHwSwNtwrk, String comments, String suggestions) {
		super();
		this.trainingCode = trainingCode;
		this.participantId = participantId;
		this.fbPrscomm = fbPrscomm;
		this.fbClrfydbts = fbClrfydbts;
		this.fbTm = fbTm;
		this.fbHndOut = fbHndOut;
		this.fbHwSwNtwrk = fbHwSwNtwrk;
		this.comments = comments;
		this.suggestions = suggestions;
	}

	public int getTrainingCode() {
		return trainingCode;
	}

	public void setTrainingCode(int trainingCode) {
		this.trainingCode = trainingCode;
	}

	public int getParticipantId() {
		return participantId;
	}

	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}

	public int getFbPrscomm() {
		return fbPrscomm;
	}

	public void setFbPrscomm(int fbPrscomm) {
		this.fbPrscomm = fbPrscomm;
	}

	public int getFbClrfydbts() {
		return fbClrfydbts;
	}

	public void setFbClrfydbts(int fbClrfydbts) {
		this.fbClrfydbts = fbClrfydbts;
	}

	public int getFbTm() {
		return fbTm;
	}

	public void setFbTm(int fbTm) {
		this.fbTm = fbTm;
	}

	public int getFbHndOut() {
		return fbHndOut;
	}

	public void setFbHndOut(int fbHndOut) {
		this.fbHndOut = fbHndOut;
	}

	public int getFbHwSwNtwrk() {
		return fbHwSwNtwrk;
	}

	public void setFbHwSwNtwrk(int fbHwSwNtwrk) {
		this.fbHwSwNtwrk = fbHwSwNtwrk;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getSuggestions() {
		return suggestions;
	}

	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}

	

}
