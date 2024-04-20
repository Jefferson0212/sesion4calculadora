/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principall;

/**
 *
 * @author Estudiante
 */
public class calculadora {
    float valor1;
    float valor2;
    
    public calculadora(float valor1,float valor2){
        this.valor1=valor1;
        this.valor2=valor1;
        
    }
    public calculadora(){}
    public float sumar(){
        return this.valor1+this.valor2;
    }
    public float restar(){
        return this.valor1-this.valor2;
    }
    public float multiplicar(){
        return this.valor1*this.valor2;
    }
    public float dividir(){
        return this.valor1/this.valor2;
    }
}
