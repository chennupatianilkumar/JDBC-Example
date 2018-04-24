package com.testcase;

public class EnumInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dcdsvdv
		System.out.println(BaseEnum.ONE);
		System.out.println(DerivedEnum.ONE);
		System.out.println(DerivedEnum.TWO);
		System.out.println(DerivedEnum.THREE);

	}

}
enum BaseEnum{
ONE
}
enum DerivedEnum implements BaseEnum{
	TWO,
	THREE
}
