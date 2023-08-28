/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aida.frame;

/**
 *
 * @author Maicol Andres
 */
public class User {
    String nombres;
    String identificacion;
    String nCuenta;
    String pin;
    String contrasena;

    public User(String nombres, String identificacion, String nCuenta, String pin, String contrasena) {
        this.nombres = nombres;
        this.identificacion = identificacion;
        this.nCuenta = nCuenta;
        this.pin = pin;
        this.contrasena = contrasena;
    }

    public User() {
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(String nCuenta) {
        this.nCuenta = nCuenta;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
