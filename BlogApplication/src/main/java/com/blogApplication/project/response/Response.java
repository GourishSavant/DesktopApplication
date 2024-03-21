package com.blogApplication.project.response;

public class Response {

	private String messgae;
	private boolean sucess;
	public Response() {
		
	}
	public Response(String messgae, boolean sucess) {
		super();
		this.messgae = messgae;
		this.sucess = sucess;
	}
	public String getMessgae() {
		return messgae;
	}
	public void setMessgae(String messgae) {
		this.messgae = messgae;
	}
	public boolean isSucess() {
		return sucess;
	}
	public void setSucess(boolean sucess) {
		this.sucess = sucess;
	}
	
	
	
}
