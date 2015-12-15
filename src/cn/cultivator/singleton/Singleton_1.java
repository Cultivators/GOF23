package cn.cultivator.singleton;

/**
 * ����ʽ
 * ������ļ��ض����أ���Ȼ���̰߳�ȫ�ġ����ǲ���ʵ�������ء�
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
