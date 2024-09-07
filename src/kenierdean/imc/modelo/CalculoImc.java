/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kenierdean.imc.modelo;

import java.io.Serializable;
/**
 *
 * @author USUARIO
 */
public class CalculoImc implements Serializable {
    
    private float peso;
    private float altura;
    
    public static class Imc {
        
        public float resultado;
        public String mensaje;
    }
    
    private Imc imc;
    
    public CalculoImc() {}
    
    public CalculoImc(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }
    
    public Imc getImc() {
        imc = new Imc();
        if (peso <= 0 || altura <= 0){
            imc.mensaje = "ERROR: El peso y altura deben ser mayores que 0";
            return imc;
        } else {
            imc.resultado = peso / (altura * altura);
            if (imc.resultado < 18.5) {
                imc.mensaje = "Debes ver a un medico, tienes un peso muy bajo";
            } else if (imc.resultado >= 18.5 && imc.resultado <= 24.9){
                imc.mensaje = "Tienes un buen peso";
            } else if (imc.resultado > 24.9  && imc.resultado <= 29.9) {
                imc.mensaje = "Deberias considerar bajar un poco de peso";
            } else {
                imc.mensaje = "Debes ver a un medico, tienes un peso muy alto";
            }
            return imc;
        }
        
    }
    
    public float getPeso() {
        return peso;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public float getAltura() {
        return altura;  
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
