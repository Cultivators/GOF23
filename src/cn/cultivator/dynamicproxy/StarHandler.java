package cn.cultivator.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler{

	private Star realStar;
	
	
	public StarHandler(Star realStar) {
		super();
		this.realStar = realStar;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object obj = null;
		System.out.println("这里做流程控制,相当于在这里做了代理的实现");
		if(method.getName().equals("sing")){
			obj = method.invoke(realStar, args);
		}
		System.out.println("流程控制之后执行的代码");
		return obj;
	}

}
