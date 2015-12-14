package cn.cultivator.sigleton;
/**
 * �þ�̬�ڲ���ȥʵ�ֵ���ģʽ 
 * ����Ҫȥ���ص�ʱ��Ż�ȥ���������̬�ڲ��� ����ʵ�������� ��Ϊ��̬�������������
 * �ļ��ض����� ��������Ȼ���̰߳�ȫ��  ����ʹ��synchronizedȥͬ�� Ч��Ҳ�Ƚϸ�
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
