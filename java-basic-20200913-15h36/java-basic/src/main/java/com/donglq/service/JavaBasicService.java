package com.donglq.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/api")
public class JavaBasicService {

	public JavaBasicService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GET
	@Path("/result")
	public String getResult() {
		return "Ok";
	}
}
