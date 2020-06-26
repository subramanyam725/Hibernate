package com.balu.lc.Dto;

public class CoupleNamesDto {

	private String yourName="male";
	private String crushName="female";
	
	CoupleNamesDto()
	{
		System.out.println("CoupleNamesDto constructor called");
	}

	public String getYourName() {
		return yourName;
	}

	public void setYourName(String yourName) {
		this.yourName = yourName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

}
