package com.myrestapp.Messenger.Resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import com.myrestapp.Messenger.exceptions.MessageNotFound;
import com.myrestapp.Messenger.model.Link;
import com.myrestapp.Messenger.model.Messages;
import com.myrestapp.Messenger.service.MessageService;

@Path("/messages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class MyMessage {

	MessageService messageservice=new MessageService();
	
	@GET   
	public List<Messages> getMessage()
	{
		return messageservice.getAllMessages();
	}

	@POST
	public Response createMessage(Messages message)
	{
		return Response.status(Status.CREATED)
				.entity(messageservice.createMessage(message))
				.build();
	}
	
	@GET
	@Path("/{messageId}")
	public Messages getMessage(@PathParam("messageId") long id,@Context UriInfo uriInfo)
	{
		String uri=uriInfo.getBaseUriBuilder()
				.path(MyMessage.class)
				.path(Long.toString(id))
				.build()
				.toString();
		
		Messages message=messageservice.getMessageById(id);
		message.getLink().add(Link.addLink("self", uri));
		
		return message;
	}
	
}
