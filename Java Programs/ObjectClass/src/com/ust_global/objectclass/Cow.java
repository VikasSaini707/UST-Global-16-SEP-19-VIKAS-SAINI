package com.ust_global.objectclass;

public class Cow {
	int cost;
	String name;
	int age;
	public Cow(int cost, String name, int age) 
	{
		super();
		this.cost = cost;
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj)
	{
		Cow c = (Cow)obj;
		if(this==obj)
			return true;
		
		if(this.cost==c.cost)
		{
			if(this.name.equals(c.name))
			{
				if(this.age==c.age)
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
}
