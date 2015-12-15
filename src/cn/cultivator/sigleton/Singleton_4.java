package cn.cultivator.sigleton;
/**
 * 用静态内部类去实现单例模式 
 * 在需要去加载的时候才会去加载这个静态内部类 可以实现懒加载 因为静态方法会随这个类
 * 的加载而加载 所以是天然是线程安全的  不用使用synchronized去同步 效率也比较高
 * @author Hickey
 *
 */
public class Singleton_4 {
	
	private Singleton_4(){}
	
	private static class innerSingleton{
		private static final Singleton_4 instance = new Singleton_4();
	}
	
	public static Singleton_4 getInstance(){
		return innerSingleton.instance;
	}
}
