package com.docsconsole.tutorials.corejava.fpackage;

import com.docsconsole.tutorials.corejava.epackage.MessageProvider;

public class MainClient extends MessageProvider{
	
	public static void main(String[] args) {
		
		MessageProvider provider = new MessageProvider();
		String className = provider.getMessage();
		System.out.println("Name of the Class is ::  " + className);
		
	}

}
