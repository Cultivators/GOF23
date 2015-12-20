package cn.cultivator.propotype;

import java.util.Date;

/**
 * 测试浅复制
 * s1、s2 的birthday 是指向了同一个对象 所以改变s1的值会同时改变克隆对象s2的值
 * 就是说复制的是一份对象的引用 （引用地址也复制了过去）
 * @author Hickey
 *
 */
public class Client {
	public static void main(String[] args) throws Exception {
		Sheep s1 = new Sheep();
		Date date = new Date(64654646L);
		s1.setBirthday(date);
		s1.setName("多利");
		//修改被克隆对象的属性 浅复制的话 克隆对象也会改变
		System.out.println(s1.getBirthday());
		System.out.println(s1);
		Sheep s2 = (Sheep) s1.clone();
		System.out.println(s2);
		date.setTime(4545454L);
		System.out.println(s1.getBirthday());
		System.out.println(s2.getBirthday());
		System.out.println(s1==s2);
	}
}
