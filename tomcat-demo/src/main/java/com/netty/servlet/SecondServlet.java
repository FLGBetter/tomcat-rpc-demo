package com.netty.servlet;


import com.netty.http.NLFRequest;
import com.netty.http.NLFResponse;
import com.netty.http.NLFServlet;

public class SecondServlet extends NLFServlet {

	public void doGet(NLFRequest request, NLFResponse response) throws Exception {
		this.doPost(request, response);
	}

	public void doPost(NLFRequest request, NLFResponse response) throws Exception {
		response.write("This is Second Serlvet");
	}

}
