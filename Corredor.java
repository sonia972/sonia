package contrarrelojbici;

import java.util.Scanner;

public class Corredor {

    // atributos
    int dorsal;
    String nombre;
    String equipo;
    String pais;

    // metodo constructor
    public Corredor(int dorsal, String nombre, String equipo, String pais) {

        this.dorsal = dorsal;
        this.nombre = nombre;
        this.equipo = equipo;
        this.pais = pais;
    }

    /* El argumento pasado por el array acorredores, se ha 
    guardado en el parámetro, en aaa[] 
     */
    public static void cargarDatos(Corredor aaa[]) {    //bien

        int dorsal = 10;
        String nombre = "Peter";
        String equipo = "Saxo";
        String pais = "Eslovenia";

        Corredor uno = new Corredor(dorsal, nombre, equipo, pais);
        // declara el objeto uno, y le asigna como parámetro las variables arriba declaradas.

        aaa[0] = uno;
       // aaa[1] = new Corredor(20, "Perico", "Banesto");
        //aaa[2] = new Corredor(30, "Indurain", "Banesto");
        //aaa [0] = new Corredor(10,"Peter","Saxo","Eslovenia");
        aaa[1] = new Corredor(20,"Alberto","Trek","España");
        aaa[2] =new Corredor(30,"Joaquin","Movistar","Eslovenia");
        aaa[3]= new Corredor(40,"Alejandro","Euskaltel","España");     
        aaa[4] = new Corredor(50,"Nairo","Movistar","Colombia");
        aaa[5]= new Corredor(60,"Cadel","Sky","Eslovenia");

    }

    public static int menu() {

        int leido;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println(" ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
        System.out.println("1 : Mostrar la clasificación");
        System.out.println("3 : Introducir la llegada del corredor ");
        System.out.println("5 : Mostrar información de un corredor");
        System.out.println("7 : Mostrar corredores participantes ");
        System.out.println("8 : Mostrar equipos participantes");
        System.out.println("9 : ");
        System.out.println("99 : Salir");

        leido = entradaTeclado.nextInt();
        return (leido);
    } // fin del método menu. le devuelve la opción elegida por el usuario7

    public static void mostrarUno(int dorsal, Corredor aaa[]) {    //bien
        for (int i = 0; i < aaa.length; i++) {
            if (dorsal == aaa[i].dorsal) {
                // muestra los datos de un corredor
                System.out.println("Corredor : " + aaa[i].dorsal + " >> " + aaa[i].nombre + " >> " + aaa[i].equipo + " >> " + aaa[i].pais);

            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void mostrarDatos(Corredor aaa[]) { //bien

        for (int d = 0; d < aaa.length; d++) {
            System.out.println(" * - * - * - * ");
            System.out.println("Corredor : " + aaa[d].dorsal + " >> " + aaa[d].nombre 
                    + " >> " + aaa[d].equipo + " >> "
                            + "" + aaa[d].pais);
        }
        System.out.println(" * - * - * - * ");
    }

    public static void mostrarEquipo(Corredor aaa[]) {  //bien
        System.out.println("Equipos participantes");
        for (int a = 0; a < aaa.length; a++) {
            System.out.println(aaa[a].equipo);
        }

    }

} // fin de 

