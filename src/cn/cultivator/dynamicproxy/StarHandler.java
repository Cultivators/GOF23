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
		System.out.println("���������̿���,�൱�����������˴����ʵ��");
		if(method.getName().equals("sing")){
			obj = method.invoke(realStar, args);
		}
		System.out.println("���̿���֮��ִ�еĴ���");
		return obj;
	}

}
