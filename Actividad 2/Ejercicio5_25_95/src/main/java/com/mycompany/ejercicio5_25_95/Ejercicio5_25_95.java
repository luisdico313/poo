/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5_25_95;

/**
 *
 * @author Usuario
 */
public class Ejercicio5_25_95 {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(“Pedro”,”Pérez”,123456789,tipo.AHORROS);
        cuenta.imprimir();
        cuenta.consignar(200000);
        cuenta.consignar(300000);
        cuenta.retirar(400000);
    }
}
