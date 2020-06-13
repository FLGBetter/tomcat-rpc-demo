package com.lf.io.bio.tomcat.http;

/**
 */
public abstract class LFServlet {
    public void service(LFRequest request, LFResponse response) throws Exception{
        if("GET".equalsIgnoreCase(request.getMethod())){
            doGet(request,response);
        }else{
            doPost(request,response);
        }
    }

    public abstract void doGet(LFRequest request, LFResponse response) throws Exception;
    public abstract void doPost(LFRequest request, LFResponse response) throws Exception;
}
