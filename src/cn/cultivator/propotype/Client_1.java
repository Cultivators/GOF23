package cn.cultivator.propotype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * �������л��������л�ʵ�����¡
 * @author Hickey
 *
 */
public class Client_1 {
	public static void main(String[] args) throws Exception {
		Sheep s1 = new Sheep();
		Date d = new Date(4554545L);
		s1.setBirthday(d);
		System.out.println(s1.getBirthday());
		
		//���л�
		//1��������д���ֽ�������ȥ
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(s1);
		byte[] b = bos.toByteArray();
		//2�����ֽ������ж�����
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Sheep s2 = (Sheep) ois.readObject();
		d.setTime(565848L);
		System.out.println(s1.getBirthday());
		System.out.println(s2.getBirthday());
		
	}
}
