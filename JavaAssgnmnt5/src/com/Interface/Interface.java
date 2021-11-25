package com.Interface;

public class Interface implements Inter{
	int z;
	@Override
	public void eating() {
		// TODO Auto-generated method stub
	
		z = i+j;
		
		
	}
	
	public static void main(String[] args) {
		
		Interface i1 = new Interface();
		i1.eating();
		System.out.println("The sum of i and j is: "+Inter.i+"+"+Inter.j+"="+i1.z);
	}
	
	
	

}
