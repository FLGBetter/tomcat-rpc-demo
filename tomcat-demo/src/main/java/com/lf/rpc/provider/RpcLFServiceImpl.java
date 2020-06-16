package com.lf.rpc.provider;


import com.lf.rpc.api.IRpcLFService;

public class RpcLFServiceImpl implements IRpcLFService {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mult(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}

}
