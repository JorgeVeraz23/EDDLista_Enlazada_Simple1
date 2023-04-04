/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eddlistaenlazada;

/**
 *
 * @author USER
 */
public class Nodo {
    public int dato;
    public Nodo siguiente;//Puntero enlace
    //Construtor para insertar al Final
    public Nodo(int d){
        this.dato=d;
    }
    //Constructor para insertar al inicio
    public Nodo(int d, Nodo n){
        dato = d;
        siguiente =n;
    }
   
}
