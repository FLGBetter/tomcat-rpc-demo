package com.lf.io.bio.tomcat.servlet;

import com.lf.io.bio.tomcat.http.LFRequest;
import com.lf.io.bio.tomcat.http.LFResponse;
import com.lf.io.bio.tomcat.http.LFServlet;

public class SecondServlet extends LFServlet {

	public void doGet(LFRequest request, LFResponse response) throws Exception {
		this.doPost(request, response);
	}

	public void doPost(LFRequest request, LFResponse response) throws Exception {
		response.write("This is Second Serlvet");
	}

}
