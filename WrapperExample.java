/**
 *	This program is about wrapper class.
 *	To Convert primitives into objects.
 *	To convert objects to primitives.
 *	COPYRIGHT (C) 2022 QDEV TECHNOLAB. All rights reserved.
 *	@author Neel
 *	@version 1.0.0
 */
class WrapperExample {

	public static void main(String[] args) {

		int a = 10;
		Integer in = Integer.valueOf(a); //Converting int into Integer explicitly
		Integer j = a; //Autoboxing, Now compiler will write Integer.valueOf(a) internally
		System.out.println(a + " " + in + " " + j);
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40L;
		float f = 50.0F;
		double d = 60.0D;
		char c = 'a';
		boolean b1 = true;
		//Autoboxing: Converting primitives into objects
		Byte byteObj = b;
		Short shortObj = s;
		Integer intObj = i;
		Long longObj = l;
		Float floatObj = f;
		Double doubleObj = d;
		Character charObj = c;
		Boolean boolObj = b1;
		//Printing objects
		System.out.println("-----Printing object values-----");
		System.out.println("Byte object: " + byteObj);
		System.out.println("Short object: " + shortObj);
		System.out.println("Integer object: " + intObj);
		System.out.println("Long object: " + longObj);
		System.out.println("Float object: " + floatObj);
		System.out.println("Double object: " + doubleObj);
		System.out.println("Character object: " + charObj);
		System.out.println("Boolean object: " + boolObj);
		//Unboxing: Converting objects to primitives
		byte byteValue = byteObj;
		short shortValue = shortObj;
		int intValue = intObj;
		long longvalue = longObj;
		float floatValue = floatObj;
		double doubleValue = doubleObj;
		char charValue = charObj;
		boolean boolValue = boolObj;
		//Printing primitives
		System.out.println("-----Printing primitive values-----");
		System.out.println("byte value: " + byteValue);
		System.out.println("short value: " + shortValue);
		System.out.println("int value: " + intValue);
		System.out.println("long value: " + longvalue);
		System.out.println("float value: " + floatValue);
		System.out.println("double value: " + doubleValue);
		System.out.println("character value: " + charValue);
		System.out.println("boolean value: " + boolValue);	
	}

}