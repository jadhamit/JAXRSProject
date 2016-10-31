package com.myrestapp.Messenger.exceptions;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.myrestapp.Messenger.model.ErrorMessage;

@Provider
public class MessageNotFoundMapper implements ExceptionMapper<MessageNotFound> {

	@Override
	public Response toResponse(MessageNotFound error) {

		ErrorMessage errormessage=new ErrorMessage("Content Not Found", 404);
		return Response.status(404)
				.entity(errormessage)
				.build();
	}	
}
