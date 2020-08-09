/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elbusstring;

import javax.swing.JOptionPane;

/**
 *
 * @author elmer
 */
public class ElBusString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int posicion = 5;
        String izquierda[] = new String[posicion];
        String derecha[] = new String[posicion];
        int cualAsiento, cualLugar, cuantasPersonas = 0, cambiarAsiento, aDondeQuiereSentarse = 0;
        String cuantasPersonasString = "";
        int opcionesMenu;
        String mostrarAmbosAsientos="",salida2="";

        do {

            opcionesMenu = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer \n1.Escoger lugar \n2.Mostrar Posiciones \n3.Cambiar Lugar \n Otro numero para salir"));

            if (opcionesMenu == 1) {
                //ESCOGER LUGAR,ASIENTO(POSICION),CUANTASPERSONAS
                do {
                    cualLugar = Integer.parseInt(JOptionPane.showInputDialog("En que lugar desea sentarse \n1.Izquierda \n2.Derecha"));

                } while (cualLugar < 1 || cualLugar > 2);

                if (cualLugar == 1) {
                    //ASIENTO IZQUIERDA(posicion)

                    do {
                        cuantasPersonas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas personas son:? \n(entre 1 y 2"));
                        if (cuantasPersonas == 1) {
                            cuantasPersonasString = "i";
                        } else {
                            cuantasPersonasString = "ii";

                        }

                    } while (cuantasPersonas < 1 || cuantasPersonas > 2);

                    do {
                        cualAsiento = Integer.parseInt(JOptionPane.showInputDialog("*Este es lado izquierdo del bus*\n¿En que numero de asiento desea sentarse?\n entre 1 y " + (posicion) + " "));

                    } while (cualAsiento < 1 || cualAsiento > posicion);

                    for (int i = 0; i <= posicion; i++) {

                        if (i == cualAsiento) {

                            if (izquierda[i - 1] == null) {

                                izquierda[i - 1] = cuantasPersonasString;
                                JOptionPane.showMessageDialog(null, "Adelante. Puede sentarse en el asiento # " + cualAsiento);
                            } else if (izquierda[i - 1].equals("i") && cuantasPersonasString.equalsIgnoreCase("ii")) {
                                izquierda[i - 1] = izquierda[i - 1] + "i";
                                JOptionPane.showMessageDialog(null, "El asiento está ocupado por una persona, usted puede sentarse junto a ella");
                            } else if (izquierda[i - 1].equals("ii")) {
                                JOptionPane.showMessageDialog(null, "El asiento # " + cualAsiento + " esta ocupado por 2 personas \n NO PUEDEN SENTARSE ");
                            }
                        }
                    }

                } else if (cualLugar == 2) {
                    //ASIENTO DERECHA

                    do {
                        cuantasPersonas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas personas son? \n(entre 1 y 2"));
                        if (cuantasPersonas == 1) {
                            cuantasPersonasString = "i";
                        } else {
                            cuantasPersonasString = "ii";

                        }

                    } while (cuantasPersonas < 1 || cuantasPersonas > 2);

                    do {
                        cualAsiento = Integer.parseInt(JOptionPane.showInputDialog("*Este es el lado derecho del bus*\n¿En que numero de asiento desea sentarse?\n entre 1 y " + (posicion) + " "));

                    } while (cualAsiento < 1 || cualAsiento > posicion);

                    for (int i = 0; i <= posicion; i++) {

                        if (i == cualAsiento) {
                            if (derecha[i - 1] == null) {

                                derecha[i - 1] = cuantasPersonasString;
                                JOptionPane.showMessageDialog(null, "Adelante. Puede sentarse en el asiento # " + cualAsiento);

                            } else if (derecha[i - 1].equals("i") && cuantasPersonasString.equalsIgnoreCase("ii")) {
                                derecha[i - 1] = derecha[i - 1] + "i";
                                JOptionPane.showMessageDialog(null, "El asiento está ocupado por una persona, usted puede sentarse junto a ella");
                            } else if (derecha[i - 1].equals("ii")) {
                                JOptionPane.showMessageDialog(null, "El asiento # " + cualAsiento + " esta ocupado por 2 personas \n NO PUEDEN SENTARSE ");
                            }
                        }
                    }
                }

            } else if (opcionesMenu == 2) {
                //MOSTRAR POSICIONES
                String mostrarAsientosIzquierda = "";
                String mostrarAsientosDerecha = "";
                String salida = "";
                 salida2 = "";
                 mostrarAmbosAsientos="";
                for (int i = 0; i < posicion; i++) {
                    
                    mostrarAmbosAsientos+="["+izquierda[i]+"]--------["+derecha[i]+"]\n";

                    mostrarAsientosIzquierda += "[" + izquierda[i] + "]\n";

                    mostrarAsientosDerecha += "[" + derecha[i] + "]\n";

                  //  salida = "*Lado Izquierdo del Bus*\n" + mostrarAsientosIzquierda + "\n *Lado Derecho del Bus* \n" + mostrarAsientosDerecha;
                    
                    
                    salida2="(izquierda)\t(derecha)\n"+mostrarAmbosAsientos;

                }
                //JOptionPane.showMessageDialog(null, salida);
                JOptionPane.showMessageDialog(null, salida2);

            } else if (opcionesMenu == 3) {
                //CAMBIAR ASIENTOS

                int cualAsientoCambio, cualLugarCambio;

                do {
                    cambiarAsiento = Integer.parseInt(JOptionPane.showInputDialog("Un pasajero desea camabiar de asiento \n ¿Está seguro que desea cambiar de lugar? \n \n 1. Si \n 2. No"));
                } while (cambiarAsiento < 1 || cambiarAsiento > 2);
                if (cambiarAsiento == 1) {
                    do {
                        cualLugar = Integer.parseInt(JOptionPane.showInputDialog("¿De que lado del asiento se encuentra? \n 1. Lado Izquierdo \n 2. Lado Derecho"));
                    } while (cualLugar < 1 || cualLugar > 2);

                    if (cualLugar == 1) { // LADO IZQUIERDO

//                        cualAsiento = Integer.parseInt(JOptionPane.showInputDialog("¿En que # de asiento se encuentra actualmente usted? Recuerde que entre 1 & " + posicion));
//                        if (cualAsiento < 0) {
//                            JOptionPane.showMessageDialog(null, "Ese numero de asiento no existe, adios.");
//                        } else if (cualAsiento > posicion) {
//                            JOptionPane.showMessageDialog(null, "Ese numero de asiento no existe, adios.");
//                        } else if (cualAsiento == 0) {
//                            JOptionPane.showMessageDialog(null, "Ese numero de asiento no existe, adios.");
//                        } else if (izquierda[cualAsiento] == 0) {
//                            JOptionPane.showMessageDialog(null, "Esta posicion se encuentra vacia. Ningun pasajero está sentado en este asiento");
//                        } else {
//
//                            for (int i = 0; i == izquierda[cualAsiento]; i++) {
//
//                                if (i == izquierda[cualAsiento]) {
//
//                                }
//
//                            }
//
//                        }
                        // FIN DE CAMBIAR ASIENTO IZQUIERDO  
                    } else if (cualLugar == 2) { // LADO DERECH0

                    }

                } else if (cambiarAsiento == 2) {

                    JOptionPane.showMessageDialog(null, "Usted decidio quedarse en el mismo asiento. Que disfrute del viaje");
                }

            }

        } while (opcionesMenu > 0 && opcionesMenu < 4);

    }

}
