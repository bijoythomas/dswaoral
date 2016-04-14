package com.sundayschool.persistence;

public class Participant {
	private String name;
	private String church;
	private String ssGroup;
	private String soloMalayalam = "NO";
	private String soloEnglish = "NO";
	private String groupMalayalam = "NO";
	private String groupEnglish = "NO";
	private String elocution = "NO";
	
	public Participant(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChurch() {
		return church;
	}

	public void setChurch(String church) {
		this.church = church;
	}

	public String getSsGroup() {
		return ssGroup;
	}

	public void setSsGroup(String ssGroup) {
		this.ssGroup = ssGroup;
	}

	public String getSoloMalayalam() {
		return soloMalayalam;
	}

	public void setSoloMalayalam(String soloMalayalam) {
		this.soloMalayalam = soloMalayalam;
	}

	public String getSoloEnglish() {
		return soloEnglish;
	}

	public void setSoloEnglish(String soloEnglish) {
		this.soloEnglish = soloEnglish;
	}

	public String getGroupMalayalam() {
		return groupMalayalam;
	}

	public void setGroupMalayalam(String groupMalayalam) {
		this.groupMalayalam = groupMalayalam;
	}

	public String getGroupEnglish() {
		return groupEnglish;
	}

	public void setGroupEnglish(String groupEnglish) {
		this.groupEnglish = groupEnglish;
	}

	public String getElocution() {
		return elocution;
	}

	public void setElocution(String elocution) {
		this.elocution = elocution;
	}
	
	
}
