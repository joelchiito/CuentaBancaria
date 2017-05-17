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
public class CuentaDeCheques {
    int ValorI = 2000;
    int ValorNew;
    int chequesEmitidos;
    int CountCE=0;
    int chequesRebotados;
    int CountCR =0;
    double Comisión1;
    double Comisión2;
    double Comisión;
    double Corte;

    public CuentaDeCheques(int chequesEmitidos, int chequesRebotados) {
        this.chequesEmitidos = chequesEmitidos;
        this.chequesRebotados = chequesRebotados;
    }

    public CuentaDeCheques() {
    }
    
    public void retirar (double cantidad){
        if (ValorI > chequesEmitidos){
            ValorNew= ValorI - chequesEmitidos;
            CountCE++;
        }
        else{
            if (ValorI < chequesEmitidos){
               CountCR++;
            }
        }
     }
    
    public void  calcularComusionPorChequesEmitidos (){
        if ( CountCE >= 6){
            Comisión1= CountCE * 10;
        }
        else{
            Comisión1= 0;
        }
    }
    
     public void  calcularComusionPorChequesRebotados (){
        Comisión2= CountCR * 20;
    }
      public void  calcularComusionPorCheques (){
        Comisión= Comisión1 + Comisión2;}
     
    public void realizarCorteMEensual(){
    Corte = ValorI - (Comisión);
    }
}
