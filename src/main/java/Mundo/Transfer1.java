/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mundo;

/**
 *
 * @author USER
 */

public class Transfer1 {
    private User pinTransfer;
    private int monto;
    private String fecha;
    private User idUse;
    private int beneficiary;

    public Transfer1(User pinTransfer) {
        this.pinTransfer = pinTransfer;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public User getIdUse() {
        return idUse;
    }

    public void setIdUse(User idUse) {
        this.idUse = idUse;
    }

    public int getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(int beneficiary) {
        this.beneficiary = beneficiary;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public User getPinTransfer() {
        return pinTransfer;
    }

    public void setPinTransfer(User pinTransfer) {
        this.pinTransfer = pinTransfer;
    }
    //////////
    
     public boolean verifyPinTransfer() {
        int userPin = pinTransfer.getPin();
        int transferPin = pinTransfer.getPin();
        
        return userPin == transferPin;
    }
    
}
