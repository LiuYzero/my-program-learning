package com.github.zj.dreamly.guava.cache;

import com.google.common.base.MoreObjects;

/**
 * <h2>Employee</h2>
 *
 * @author: 苍海之南
 * @since: 2019-10-29 14:54
 **/
public class Employee {
	private final String name;
	private final String dept;
	private final String empID;
	private final byte[] data = new byte[1024 * 1024];

	public Employee(String name, String dept, String empID)
	{
		this.name = name;
		this.dept = dept;
		this.empID = empID;
	}

	public String getName()
	{
		return name;
	}

	public String getDept()
	{
		return dept;
	}

	public String getEmpID()
	{
		return empID;
	}

	@Override
	public String toString()
	{
		return MoreObjects.toStringHelper(this)
			.add("Name", this.getName()).add("Department", getDept())
			.add("EmployeeID", this.getEmpID()).toString();
	}

	@Override
	protected void finalize() throws Throwable
	{
		System.out.println("The name " + getName() + " will be GC.");
	}
}
