package com.ust_global.objectclass;

public class Employee {
	int id;
	String name;
	double sal;
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public boolean equals(Object obj)
	{
		Employee c = (Employee)obj;
		if(this==obj)
			return true;
		
		if(this.id==c.id)
		{
			if(this.name.equals(c.name))
			{
				if(this.sal==c.sal)
				{
					return true;
				}else {
					return false;
				}
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	public String toString()
	{
		return "The Id is "+id+" and name is "+name+" having salary "+sal;
	}
}
