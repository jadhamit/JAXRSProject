package com.myrestapp.Messenger.exceptions;

public class MessageNotFound extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MessageNotFound(String message)
	{
		super(message);
	}
	
}
