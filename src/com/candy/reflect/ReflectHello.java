package com.candy.reflect;

import java.lang.reflect.Method;

public class ReflectHello {
	public ReflectHello(){
		
	}
	public void sayHello(String name){
		System.out.println("Hello World"+name);
	}
	
	public static void main(String [] args){
		try {
			//通过反射生成对象，相当于 ReflectHello refect=new ReflectHello();
			ReflectHello reflectHello=(ReflectHello)Class.forName("com.candy.reflect.ReflectHello").newInstance();
			//通过类获取方法，SayHello
			Method method=reflectHello.getClass().getMethod("sayHello", String.class);
			//相当于语句，refect.sayHello（"Candy"）;
			method.invoke(reflectHello, "Candy");
			} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
