package cn.cultivator.memento;

public class Emp {
	private String name;
	private int age;
	private double salary;
	
	public Emp() {
	}

	public Emp(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	//��������
	public EmpMemento memento(){
		return new EmpMemento(this);
	}
	//���ݻָ�
	public void recovery(EmpMemento empMemento){
		this.name = empMemento.getName();
		this.age = empMemento.getAge();
		this.salary = empMemento.getSalary();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
