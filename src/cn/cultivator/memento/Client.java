package cn.cultivator.memento;

public class Client {
	public static void main(String[] args) {
		Emp emp = new Emp("Hickey", 22, 2000);
		CareTaker ct = new CareTaker();
		System.out.println("��һ���޸Ķ���");
		System.out.println(emp.getName()+"==="+emp.getAge()+"==="+emp.getSalary());
		//����һ��������
		ct.setEmpMemento(emp.memento());
		emp.setName("Mike");
		emp.setAge(22);
		emp.setSalary(3000);
		System.out.println("�ڶ����޸Ķ���");
		System.out.println(emp.getName()+"==="+emp.getAge()+"==="+emp.getSalary());
		emp.recovery(ct.getEmpMemento());
		System.out.println("�������޸Ķ���");
		System.out.println(emp.getName()+"==="+emp.getAge()+"==="+emp.getSalary());
	}
}
