package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.ScheduleReminder;

public class ClientTest 
{
	public static void main(String[] args) 
	{
	    ApplicationContext ctx=null;
	    ScheduleReminder remainder=null;
	    ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/ApplicationsContext.xml");
	    remainder =ctx.getBean("remainder", ScheduleReminder.class);
	    System.out.println(remainder);
	}
}