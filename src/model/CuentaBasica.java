/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hp245
 */
public class CuentaBasica {
    
    protected int numerodecuenta; 
    protected String cliente;
    protected double saldo;
    private double cantidad;
    private double retiro;

    public CuentaBasica(int numero_de_cuenta, double saldo, double cantidad, double retiro) {
        this.numerodecuenta = numero_de_cuenta;
        this.saldo = saldo;
        this.cantidad = cantidad;
        this.retiro = retiro;
    }

   public CuentaBasica() {
        
    }

   
    
    
    
   

    public double getSaldo()
    {
        return this.saldo;
    }
    
    public double depositar(double deposito)
    {
        this.cantidad=deposito;
        saldo= saldo + cantidad;
        return saldo;
    }
    
    public double retirar (double retirar)
    {
        
        this.retiro=retirar;
        saldo=saldo-retiro;
            
         return saldo;
    }
}


