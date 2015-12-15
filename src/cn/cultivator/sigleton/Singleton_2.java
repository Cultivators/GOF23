package cn.cultivator.sigleton;
/**
 * ����ʽ
 * Ҫ��synchronizedȥͬ�� �̰߳�ȫ����Ч�ʱȽϵ� �����ܹ����������� ��Դ�����ʱȽϸ�
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
