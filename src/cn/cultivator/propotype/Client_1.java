package cn.cultivator.propotype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 利用序列化跟反序列化实现深克隆
 * @author Hickey
 *
 */
public class Client_1 {
	public static void main(String[] args) throws Exception {
		Sheep s1 = new Sheep();
		Date d = new Date(4554545L);
		s1.setBirthday(d);
		System.out.println(s1.getBirthday());
		
		//序列化
		//1、将对象写进字节数组中去
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(s1);
		byte[] b = bos.toByteArray();
		//2、从字节数组中读出来
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Sheep s2 = (Sheep) ois.readObject();
		d.setTime(565848L);
		System.out.println(s1.getBirthday());
		System.out.println(s2.getBirthday());
		
	}
}
