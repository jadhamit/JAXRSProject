package com.myrestapp.Messenger.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Messages {
	
	private long id;
	private String name;
	List<Link> link=new ArrayList<Link>();
	
	public List<Link> getLink() {
		return link;
	}

	public void setLink(List<Link> link) {
		this.link = link;
	}

	public Messages()
	{
		
	}
	
	public Messages(long id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
