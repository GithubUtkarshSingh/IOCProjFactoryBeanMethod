package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;
public class DateFctoryBeans implements FactoryBean<Date>
{
	private int year;
	private int month;
	private int date;
	public DateFctoryBeans(int year, int month, int date) 
	{
		this.year = year;
		this.month = month;
		this.date = date;
	}
	//@Override
	public Date getObject()throws Exception
	{
		System.out.println("Hello Bhayi");
		return new Date(year,month,date);
	}
//@Override
	public Class<?>getObjectType()
	{
		System.out.println("Hello GetObject()");
		return Date.class;
	}
	//@Override
	public boolean isSingleton()
	{
		System.out.println("isSinglton");
		return true;
	
}
}

