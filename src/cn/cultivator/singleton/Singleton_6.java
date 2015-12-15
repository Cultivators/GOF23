package cn.cultivator.singleton;

import java.io.Serializable;

/**
 * ���Է���� ���л��������л���©��
 * @author Hickey
 *
 */
public class Singleton_6 implements Serializable {
	
	private Singleton_6(){
		//�÷���ȥ�ƻ�����
		if(instance == null){
			throw new RuntimeException("��ֹ�÷���ȥ��������ʵ��");
		}
	}
	
	private static Singleton_6 instance = new Singleton_6();
	
	public static Singleton_6 getInstance(){
		
		return instance;
	}
	//����Ƿ�ֹ���л���
	private Object readResolve(){
		return instance;
	}
	
}
