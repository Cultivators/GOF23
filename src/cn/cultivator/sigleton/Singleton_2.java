package cn.cultivator.sigleton;
/**
 * 懒汉式
 * 要用synchronized去同步 线程安全但是效率比较低 但是能够进行懒加载 资源利用率比较高
 * @author Hickey
 *
 */
public class Singleton_2 {
	
	private Singleton_2(){}
	
	private static Singleton_2 instance;
	
	public static synchronized Singleton_2 getInstance(){
		if(instance==null){
			instance = new Singleton_2();
		}
		return instance;
	}
}
