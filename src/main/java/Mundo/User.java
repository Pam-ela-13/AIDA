/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mundo;

/**
 *
 * @author USER
 */
public class User extends Person {
    
    private String idCustomer;
	

	public User(String name, String lastName, String id, int accountNum, int pin, String record, String idCustomer) {
		super(name, lastName, id, accountNum, pin, record);
		this.idCustomer = idCustomer;
	}

	public String getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}
        
         
}
