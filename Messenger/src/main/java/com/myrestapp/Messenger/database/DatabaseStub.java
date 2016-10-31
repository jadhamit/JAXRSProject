package com.myrestapp.Messenger.database;

import java.util.HashMap;

import com.myrestapp.Messenger.model.Messages;
import com.myrestapp.Messenger.model.Profile;

public class DatabaseStub {
	
	private static HashMap<Long,Messages> messages=new HashMap<>();
	private static HashMap<Long,Profile> profiles=new HashMap<>();
	
	public static HashMap<Long, Messages> getMessages() {
		return messages;
	}
	public static HashMap<Long, Profile> getProfiles() {
		return profiles;
	}
	
}
