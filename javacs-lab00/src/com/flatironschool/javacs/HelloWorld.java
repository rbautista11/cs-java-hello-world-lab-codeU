package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
	double d = Double.parseDouble(System.getProperty("java.version")); 
    	return d;
	}

    public static void main(String[] args) {
	System.out.println(getVersion());
    }
}
