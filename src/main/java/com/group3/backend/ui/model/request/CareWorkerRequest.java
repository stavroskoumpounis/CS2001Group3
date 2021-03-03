package com.group3.backend.ui.model.request;

public class CareWorkerRequest {
	
	
	private Long careWorkerId;
	private Long careHomeId;
	private String firstName;
	private String surName;
	private boolean archived;


	public boolean isArchived() {
		return archived;
	}
	public void setArchived(boolean archived) {
		this.archived = archived;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String sureName) {
		this.surName = sureName;
	}
	public Long getCareHomeId() {
		return careHomeId;
	}
	public void setCareHomeId(Long careHomeId) {
		this.careHomeId = careHomeId;
	}
	public Long getCareWorkerId() {
		return careWorkerId;
	}
	public void setCareWorkerId(Long careWorkerId) {
		this.careWorkerId = careWorkerId;
	}
}
