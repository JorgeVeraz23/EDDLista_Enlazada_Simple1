/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eddlistaenlazada;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class EDDListaEnlazada {

    public static void main(String[] args) {
        Lista listita = new Lista();
        int opcion = 0, el;
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"1. Agregar un elemento al inicio de la lista \n2. Mostrar los datos de la lista\n"
                        +"3. Salir"));
                switch(opcion){
                    case 1:
                        try{
                            el = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento: ", "Insertando al inicio",3));
                            listita.agregarAlInicio(el);
                            //Agregando al Nodo
                        }catch(NumberFormatException n){
                            JOptionPane.showMessageDialog(null,"Error "+n.getMessage());
                        }
                        break;
                    case 2:
                        listita.mostrarLista();
                        break;
                    case 3:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error "+e.getMessage());
            }
        }while(opcion!=3);
    }
}
