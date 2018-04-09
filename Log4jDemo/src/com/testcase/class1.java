package com.testcase;

public class class1 {

	public static void main(String[] args) {
		System.out.println(foo("hello world"));
	}

//public class class1{
	public static String foo(String str) {
		if((null==str) || (str.length()<=1))
{
	return str;
}
char[] chars=str.toCharArray();
int right=chars.length-1;
for(int left=0;left<right;left++)
{
	char swap=chars[left];
	chars[left]=chars[right];
	chars[right]=swap;
}
return new String(chars);
	}
}
//}


