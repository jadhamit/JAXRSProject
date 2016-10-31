package com.myrestapp.Messenger.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import com.myrestapp.Messenger.database.DatabaseStub;
import com.myrestapp.Messenger.exceptions.MessageNotFound;
import com.myrestapp.Messenger.model.*;

public class MessageService {
	
	private HashMap<Long,Messages> messages=DatabaseStub.getMessages();
	private HashMap<Long, Profile> profiles=DatabaseStub.getProfiles();
	
	public List<Messages> getAllMessages()
	{		
		return new ArrayList<Messages>(messages.values());
	}
	
	public Messages createMessage(Messages message)
	{	
		long id=(messages.size()+1);
		message.setId(id);
		messages.put(id,message);
		return messages.get(id);
	}

	public Messages getMessageById(long id) {
		Messages message= messages.get(id);
		if(message==null)
		{
			throw new MessageNotFound("No Message Found");
		}
		return message;
	}
}
