package com.example.sayhellojni;

public class HelloJNI {

	static{
		System.loadLibrary("HelloJNI");
	}
	
	 public native String sayHello();
	
}
