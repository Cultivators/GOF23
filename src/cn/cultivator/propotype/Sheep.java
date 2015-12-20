package cn.cultivator.propotype;

import java.io.Serializable;
import java.util.Date;

public class Sheep implements Cloneable,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Date birthday;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		//deep clone应该加的代码
		Sheep s = (Sheep)obj;
		s.birthday = (Date) this.birthday.clone();
		return obj;
	}
	
}
