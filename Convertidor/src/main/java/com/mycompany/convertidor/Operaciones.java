/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.convertidor;

/**
 *
 * @author saman
 */
public class Operaciones {
    private double valor,resultado;
    private int divisa, divisafinal;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public int getDivisa() {
        return divisa;
    }

    public void setDivisa(int divisa) {
        this.divisa = divisa;
    }

    public int getDivisafinal() {
        return divisafinal;
    }

    public void setDivisafinal(int divisafinal) {
        this.divisafinal = divisafinal;
    }

    public Operaciones() {
    }
    
    
    
    public double convertir (){
        if(divisa==divisafinal && divisafinal==divisa){
        resultado=valor;}
        //PESOS COLOMBIANOS
       else if(divisa==0 && divisafinal==1){
        resultado =valor*0.00021;
        }
        else  if(divisa==0 && divisafinal==2){
        resultado =valor*0.0017;
        }
        else if(divisa==0 && divisafinal==3){
        resultado =valor*0.00020;
        }
        //DOLARES
        else if(divisa==1 && divisafinal==0){
        resultado =valor*4778.33;
        }
        else  if(divisa==1 && divisafinal==2){
        resultado =valor*7.86;
        }
        else if(divisa==1 && divisafinal==3){
        resultado =valor*0.94;
        }
        //QUETZALES
        else if(divisa==2 && divisafinal==0){
        resultado =valor*608.14;
        }
        else  if(divisa==2 && divisafinal==1){
        resultado =valor*0.13;
        }
        else if(divisa==2 && divisafinal==3){
        resultado =valor*0.12;
        }
        //EUROS
         else if(divisa==3 && divisafinal==0){
        resultado =valor*5091.24;
        }
        else  if(divisa==3 && divisafinal==1){
        resultado =valor*1.07;
        }
        else if(divisa==3 && divisafinal==2){
        resultado =valor*8.38;
        }
    
    return resultado;
    }
    
}
