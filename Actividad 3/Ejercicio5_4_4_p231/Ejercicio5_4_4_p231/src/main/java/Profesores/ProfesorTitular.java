/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Profesores;

/**
 *
 * @author Usuario
 */
public class ProfesorTitular extends Profesor{
    /**
    * Método que sobreescribe el método imprimir heredado de la clase
    * padre Profesor
    */
    protected void imprimir() {
        System.out.println("Es un profesor titular.");
    }
    
}
