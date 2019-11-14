package com.docsconsole.corejava.hpackage;

public class MainClient {

	public static void main(String[] args) {
		
		Person person = new Person("David", "Jhonson");
		System.out.println("First Name::: " + person.firstName + " ::: Last Name::: " + person.lastName);

		System.out.println(" ::: City Name ::: " + person.cityName + " ::: State Name ::: " + person.stateName
				+ " ::: Country Name ::: " + person.countryName);
	}
}