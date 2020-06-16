package com.lf.netty.http;

public abstract class NLFServlet {
	
	public void service(NLFRequest request, NLFResponse response) throws Exception{

		//由service方法来决定，是调用doGet或者调用doPost
		if("GET".equalsIgnoreCase(request.getMethod())){
			doGet(request, response);
		}else{
			doPost(request, response);
		}

	}

	public abstract void doGet(NLFRequest request, NLFResponse response) throws Exception;
	
	public abstract void doPost(NLFRequest request, NLFResponse response) throws Exception;
}
