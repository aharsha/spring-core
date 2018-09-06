package com.harsha.dt12.maventest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Entry {

	public static void main(String[] args) {

 
 
		//here context is the reffrence of SpringContainer object
ApplicationContext container=
new ClassPathXmlApplicationContext("beans.xml");

Object obj=container.getBean("cal");

Cal cal=(Cal)obj;

Polygon p=cal.getPolygon();

p.info();

	}

}
