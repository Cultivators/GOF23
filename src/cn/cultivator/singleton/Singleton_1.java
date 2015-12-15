package cn.cultivator.singleton;

/**
 * 饿汉式
 * 随着类的加载而加载，天然是线程安全的。但是不能实现懒加载。
 * @author Hickey
 *
 */
public class Singleton_1 {
	
	private Singleton_1(){}
	
	private static Singleton_1 instance = new Singleton_1();
	
	public static Singleton_1 getInstance(){
		
		return instance;
	}
	
}
