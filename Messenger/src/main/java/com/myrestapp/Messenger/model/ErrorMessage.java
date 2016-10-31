package com.myrestapp.Messenger.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {

	private String errorMessage;
	private int errorType;
	
	public ErrorMessage()
	{
		
		
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public void setErrorType(int errorType) {
		this.errorType = errorType;
	}
	public ErrorMessage(String errormessage,int errortype)
	{
		super();
		this.errorMessage=errormessage;
		this.errorType=errortype;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public int getErrorType() {
		return errorType;
	}
	
}
