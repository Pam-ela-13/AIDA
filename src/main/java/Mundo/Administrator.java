/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Mundo;

/**
 *
 * @author USER
 */
public class Administrator extends Person {
    private String idAdmin;

    public Administrator(String idAdmin, String name, String lastName, String id, int accountNum, int pin, String record) {
        super(name, lastName, id, accountNum, pin, record);
        this.idAdmin = idAdmin;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }
    
        
}
