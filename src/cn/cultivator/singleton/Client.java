package cn.cultivator.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Client {
	public static void main(String[] args)throws Exception {
		Singleton_6 s1 = Singleton_6.getInstance();
		Singleton_6 s2 = Singleton_6.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		/*1、通过反射得到的实例不是同一个
		 * try {
			Class<Singleton_6> clazz =(Class<Singleton_6>) Class.forName("cn.cultivator.singleton.Singleton_6");
			Constructor<Singleton_6> constructor =  clazz.getDeclaredConstructor();
			constructor.setAccessible(true);
			Singleton_6 s3 = constructor.newInstance(null);
			System.out.println(s3);
			
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		FileOutputStream fos = new FileOutputStream("d:/data.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/data.txt"));
		Singleton_6 s3 = (Singleton_6) ois.readObject();
		System.out.println(s3);
		
	}
}











