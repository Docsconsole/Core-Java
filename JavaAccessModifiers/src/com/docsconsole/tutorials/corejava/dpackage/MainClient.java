package com.docsconsole.tutorials.corejava.dpackage;

import com.docsconsole.tutorials.corejava.cpackage.MessageProvider;

public class MainClient{
	
	public static void main(String[] args) {
		//It will give compile time error As MessageProvider declared as protected 
		MessageProvider provider = new MessageProvider();
		String className = provider.getMessage();
		System.out.println("Name of the Class is ::  " + className);
		
	}
}
