package com.donglq.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.donglq.basic.FirstExample;

@Path("/api")
public class JavaBasicService {

	public JavaBasicService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GET
	@Path("/result/{input}")
	public String getResult(@PathParam("input") String input) {
		FirstExample firstExm = new FirstExample();
		return firstExm.printString(input);
	}
}
