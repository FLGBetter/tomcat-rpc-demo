package com.lf.rpc.consumer;


import com.lf.rpc.api.IRpcLFHelloService;
import com.lf.rpc.api.IRpcLFService;
import com.lf.rpc.consumer.proxy.RpcProxy;

public class RpcConsumer {
	
    public static void main(String [] args){  
        IRpcLFHelloService rpcHello = RpcProxy.create(IRpcLFHelloService.class);
        
        System.out.println(rpcHello.helloLF("Mir LF"));

        IRpcLFService service = RpcProxy.create(IRpcLFService.class);
        
        System.out.println("5 + 2 = " + service.add(5, 2));
        System.out.println("5 - 2 = " + service.sub(5, 2));
        System.out.println("5 * 2 = " + service.mult(5, 2));
        System.out.println("5 / 2 = " + service.div(5, 2));
    }
    
}
