package cn.cultivator.observer;

import java.io.ObjectInputStream.GetField;

public class Client {
	public static void main(String[] args) {
		ConcreteObject co = new ConcreteObject();
		ObserverA o1 = new ObserverA();
		ObserverA o2 = new ObserverA();
		ObserverA o3 = new ObserverA();
		co.addObserver(o1);
		co.addObserver(o2);
		co.addObserver(o3);
		co.set(2000);
		System.out.println("++++++++++++++++++");
		System.out.println(o1.getMyState());
		System.out.println(o2.getMyState());
		System.out.println(o3.getMyState());
		co.set(1000);
		System.out.println("++++++++++++++++++");
		System.out.println(o1.getMyState());
		System.out.println(o2.getMyState());
		System.out.println(o3.getMyState());
	}
}
