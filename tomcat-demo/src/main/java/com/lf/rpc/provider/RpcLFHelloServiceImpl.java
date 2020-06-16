package com.lf.rpc.provider;


import com.lf.rpc.api.IRpcLFHelloService;

public class RpcLFHelloServiceImpl implements IRpcLFHelloService {


    @Override
    public String helloLF(String name) {
        return "Hello " + name + "!";
    }
}
