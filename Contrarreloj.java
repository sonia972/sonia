package contrarrelojbici;

import java.util.Scanner;

public class Contrarreloj {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //variables globales
        int opcion, dorsal;
        int llegados = 0;  // corredores llegados
        int comprobar = 0;// es para comprobar si está inscrito

        /* acorredores se declaran array de la clase Corredor, se vincula y 
        se llama al método cargardatos pasándole como parámetro el array acorredores
        no es necesario ponerle los [] con el nombre llega*/
        Corredor acorredores[];
        acorredores = new Corredor[6];   // el array de los corredores inscritos
        Corredor.cargarDatos(acorredores); // rellena el array  acorredores

        //Declaro, vinculo y llamo al método inicializar
        Dorti cronos[];
        cronos = new Dorti[6];    // el array de los tiempos de llegada
        Dorti.inicializar(cronos);// rellena el array cronos

        /* llama al método menu, trasladándole la ejecución del programa, que nos
        devolverá el valor recogido en la variable leido */
        opcion = Corredor.menu();

        while (opcion != 99) {

            switch (opcion) {

                case 0:  // meter más datos de corredores, opcion oculta
                    break;
                case 1:  // mostrar la clasificación en carrera
                    Dorti.mostrarClasificacion(cronos, llegados);
                    Dorti.Diferencia(cronos, llegados);
                    break;
                case 2: // libre
                    break;
                case 3: // anotar la llegada de un corredor bien
                    
                    System.out.println("Registro del Dorsal");
                    dorsal = teclado.nextInt();
                   
                    int tiempo;
                    comprobar = Dorti.comprobarDorsal(dorsal, acorredores, cronos);
                   
                    if (comprobar == 0) {
                        /*si válido es igual a 0, significa que está registrado 
                        pero todavía no ha llegado a meta*/
                        System.out.println("Corredor inscrito");
                        System.out.print("Introduzca el crono: ");
                        tiempo = teclado.nextInt();
                        Dorti.clasificar(dorsal, tiempo, cronos, llegados);
                        llegados++;
                        
                    } else {
                        if (comprobar == 1) {
                            System.out.print("El corredor no está inscrito");
                        } else {
                            if (comprobar == 2) {
                                System.out.print("Ese corredor ya ha sido contabilizado");
                            }
                        }
                    }

                    break;
                case 4: // Consultar posición en la clasificación
                    break;
                case 5: // mostrar la información de un corredor
                                             
                        System.out.println("Dorsal del corredor a consultar ");                         
                        dorsal = teclado.nextInt();
                    Corredor.mostrarUno(dorsal, acorredores);/* me daba error por 
                    no haberle puesto dorsal en el parámetro, necesita que le envie
                    el dorsal para hacer la comparación*/
                    
                
                case 6: // libre
                    break;
                case 7: // mostrar la lista de corredores de la carrera
                    Corredor.mostrarDatos(acorredores);
                    break;
                case 8:// 
                   Corredor.mostrarEquipo(acorredores);
                    
                  
                    break;
                case 9: // mostrar clasificación final
                    
                    break;
                default:
                    // podemos mostrar un mensaje de error
                    break;
            } // fin del switch
            opcion = Corredor.menu();
        } // del while 
    } // fin del main
} // fin de la class

