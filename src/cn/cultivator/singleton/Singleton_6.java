package cn.cultivator.singleton;

import java.io.Serializable;

/**
 * 测试反射跟 序列化跟反序列话的漏洞
 * @author Hickey
 *
 */
public class Singleton_6 implements Serializable {
	
	private Singleton_6(){
		//用反射去破坏单例
		if(instance == null){
			throw new RuntimeException("防止用反射去创建其他实例");
		}
	}
	
	private static Singleton_6 instance = new Singleton_6();
	
	public static Singleton_6 getInstance(){
		
		return instance;
	}
	//这个是防止序列化的
	private Object readResolve(){
		return instance;
	}
	
}
