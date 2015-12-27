package cn.cultivator.iterator;

public class Client {
	public static void main(String[] args) {
		
		ConcreteMyAggregate cma = new ConcreteMyAggregate();
		cma.addObject("l");
		cma.addObject("o");
		cma.addObject("v");
		cma.addObject("e");
		MyIterator mi = cma.createIterator();
		while(mi.hasNext()){
			System.out.println(mi.getCurrentObj());
			mi.next();
		}
	}
	
}
