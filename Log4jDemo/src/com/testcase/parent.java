package com.testcase;

public class parent <E>
{
 public E get() {
	 return null;
 }
 public void set(E e) {}
}
class Child extends parent<Number>
{
	
	public Object get() {}
	public Long get() {	}
	public void set(Object org) {	}
	public void set(Long arg) {}
	public Number get() {	}
}
