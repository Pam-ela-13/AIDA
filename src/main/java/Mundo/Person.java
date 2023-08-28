/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mundo;

/**
 *
 * @author USER
 */
public class Person {
    
    //ATTRIBUTES
		private String name;
		private String lastName;
		private String id;
		private int accountNum;
		int pin;
		private String record;
		
		//CONSTRUCTOR
		public Person(String name, String lastName, String id, int accountNum, int pin, String record) {
			super();
			this.name = name;
			this.lastName = lastName;
			this.id = id;
			this.accountNum = accountNum;
			this.pin = pin;
			this.record = record;
		}
		
		//SETTERS AND GETTERS

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public int getAccountNum() {
			return accountNum;
		}

		public void setAccountNum(int accountNum) {
			this.accountNum = accountNum;
		}

		public int getPin() {
			return pin;
		}

		public void setPin(int pin) {
			this.pin = pin;
		}

		public String getRecord() {
			return record;
		}

		public void setRecord(String record) {
			this.record = record;
		}
    
}
