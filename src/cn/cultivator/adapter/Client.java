package cn.cultivator.adapter;

public class Client {
	public void test(Target t){
		t.handleReq();
	}
	public static void main(String[] args) {
		/*1、继承的方法
		 * Client c = new Client();
		Target t = new Adapter();
		c.test(t);*/
		/*
		 * 2、聚合的方式
		 */
		Client c = new Client();
		Adaptee a = new Adaptee();
		Target t = new Adapter_2(a);
		c.test(t);
	}
}
