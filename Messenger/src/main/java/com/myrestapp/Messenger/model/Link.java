package com.myrestapp.Messenger.model;

public class Link {
	
	private String uri;
	private String ref;
	
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	
	public static Link addLink(String rel,String uri)
	{
		Link link=new Link();
		link.setRef(rel);
		link.setUri(uri);
		return link;
	}
}
