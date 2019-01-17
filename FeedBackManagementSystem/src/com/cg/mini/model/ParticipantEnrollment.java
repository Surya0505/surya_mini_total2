package com.cg.mini.model;

public class ParticipantEnrollment {
	private int trainingCode;
	private int participantId;
	
	public ParticipantEnrollment() {
		// TODO Auto-generated constructor stub
	}

	public ParticipantEnrollment(int trainingCode, int participantId) {
		super();
		this.trainingCode = trainingCode;
		this.participantId = participantId;
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
	
	

}
