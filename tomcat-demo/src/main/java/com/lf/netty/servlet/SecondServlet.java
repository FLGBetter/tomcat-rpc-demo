package com.lf.netty.servlet;


import com.lf.netty.http.NLFRequest;
import com.lf.netty.http.NLFResponse;
import com.lf.netty.http.NLFServlet;

public class SecondServlet extends NLFServlet {

	public void doGet(NLFRequest request, NLFResponse response) throws Exception {
		this.doPost(request, response);
	}

	public void doPost(NLFRequest request, NLFResponse response) throws Exception {
		response.write("This is Second Serlvet");
	}

}
