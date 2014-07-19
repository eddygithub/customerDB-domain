package com.prudent.domain;

import org.springframework.data.annotation.Id;

public class User {

	@Id
	public Long ID;
	private String profilePhotoMediaType;
	private boolean profilePhotoImported;
	
	public Long getID() {
		return ID;
	}

	public String getProfilePhotoMediaType() {
		return profilePhotoMediaType;
	}

	public void setProfilePhotoMediaType(String profilePhotoMediaType) {
		this.profilePhotoMediaType = profilePhotoMediaType;
	}

	public boolean isProfilePhotoImported() {
		return profilePhotoImported;
	}

	public void setProfilePhotoImported(boolean profilePhotoImported) {
		this.profilePhotoImported = profilePhotoImported;
	}
}
