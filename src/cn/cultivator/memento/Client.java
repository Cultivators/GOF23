package cn.cultivator.memento;

public class Client {
	public static void main(String[] args) {
		Emp emp = new Emp("Hickey", 22, 2000);
		CareTaker ct = new CareTaker();
		System.out.println("第一次修改对象");
		System.out.println(emp.getName()+"==="+emp.getAge()+"==="+emp.getSalary());
		//设置一个备忘点
		ct.setEmpMemento(emp.memento());
		emp.setName("Mike");
		emp.setAge(22);
		emp.setSalary(3000);
		System.out.println("第二次修改对象");
		System.out.println(emp.getName()+"==="+emp.getAge()+"==="+emp.getSalary());
		emp.recovery(ct.getEmpMemento());
		System.out.println("第三次修改对象");
		System.out.println(emp.getName()+"==="+emp.getAge()+"==="+emp.getSalary());
	}
}
