package contrarrelojbici;

/**
 * declaramos aquí un nuevo objeto dorti ( dorsal-tiempo) y la tabla de
 * clasificacion que es un array de dortis
 */
public class Dorti {

    // atributos. Variables de instancia
    int dorsal;
    int tiempo;

    // método constructor de la clase
    public Dorti(int dorsal, int tiempo) {
        this.dorsal = dorsal;
        this.tiempo = tiempo;
    }

    public static void inicializar(Dorti aaa[]) { //bien

        for (int i = 0; i < aaa.length; i++) {

            aaa[i] = new Dorti(888, 999);/*estos argumentos los ponemos como valores
            iniciales, para ir pisándolos según vallamos recibiendo los cronos.
             */

        }

    }

    public static int clasificar(int dorsal, int tiempo, Dorti aaa[], int llegados) {   //bien

        /* llegados funcionará como el índice del array, si está a cero se 
        guardará en la posición cero */
        aaa[llegados].dorsal = dorsal;
        aaa[llegados].tiempo = tiempo;

        // Ordenar array clasificación método burbuja      bien
        boolean cambio = true;
        int puesto = 0;
        while (cambio) {
            cambio = false;

            for (int i = 0; i < aaa.length - 1; i++) {
                if (aaa[i].tiempo > aaa[i + 1].tiempo) {
                    Dorti aux = aaa[i];
                    aaa[i] = aaa[i + 1];
                    aaa[i + 1] = aux;
                    puesto = i;
                    cambio = true;
                }
            }

        }

        for (int d = 0; d < aaa.length; d++) {
            System.out.println(" * - * - * - * ");
            System.out.println(+aaa[d].dorsal + "  " + aaa[d].tiempo);
        }
        System.out.println(" * - * - * - * ");
        return (llegados);

    }

    /* ahora ordena el array por el tiempo , método de los jugadores de cartas 
        int  j;

        for (int i = 1; i < aaa.length - 1; i++) {
            
            Dorti aux = aaa[i];
            j = i - 1;
            
                while (j >= 0 &&  aaa[j] > aux) {
                    aaa[j + 1] = aaa[j];
                    j = j - 1;
                }

                aaa[j + 1] = aux;
            }
            for (int r = 0; r < aaa.length; r++) {
                System.out.println(aaa[r] + "");

            }
            System.out.println("");
            
            
            return (llegados);
        }
    }*/
  

    public static int posicionClasificacion(Dorti cronos[], int tiempo) {
        int posicion = 0;
        for (int i = 0; i < cronos.length; i++) {
            if (cronos[i].tiempo < tiempo) {
                posicion = i + 1;
            }
        }
        return posicion;
    }

    public static void mostrarClasificacion(Dorti aaa[], int llegados) { //bien
        System.out.println("");
        System.out.println("Clasificación");

        if (llegados == 0) {
            System.out.print("No ha llegado ningún corredor a META");
        } else {

            for (int p = 0; p <= llegados; p++) {
                System.out.println(" * - * - * - * ");

                System.out.println(p + 1 + " : " + aaa[p].dorsal + " >> " + aaa[p].tiempo);

            }

            System.out.println(" * - * - * - * ");

        }
    }

    public static int comprobarDorsal(int dorsal, Corredor acorredores[], Dorti crono[]) { //

        int valido = 0;
        boolean inscrito = false;
        boolean llegado = false;
        for (Corredor aux : acorredores) {
            if (aux.dorsal == dorsal) {//comprueba que el dorsal está inscrito
                inscrito = true;
            }
        }

        for (Dorti aux : crono) {
            if (aux.dorsal == dorsal) {//comprueba si el dorsal ya había llegado a META
                llegado = true;
            }
        }
        if (inscrito && !llegado) { // inscrito pero que no ha llegado
            valido = 0;
        }
        if (!inscrito) {  //no está inscrito
            valido = 1;
        }
        if (inscrito && llegado) { //está inscrito y ya ha sido registrada su entrada
            valido = 2;
        }

        return valido;

    }
  public static String Diferencia(Dorti tiempos[], int Tiempo) {
        int diferencia;
        String mensaje = " ";
        diferencia = Tiempo - tiempos[0].tiempo;
        if (diferencia == 0) {
            mensaje = " Nuevo lider, a " + (Tiempo - tiempos[1].tiempo) + " segundos del 2ºclasificado ";

        }
        if (diferencia > 0) { // Para q imprima solo diferencias con el primer clasificado
            mensaje = " A + " + diferencia + " segundos del 1º clasificado ";
        }

        return mensaje;
        /*
    public static String Diferncia (Dorti cronos[], int Tiempo){
        int aux = 0;
        String mensaje = " ",
        aux = Tiempo - cronos[0].tiempo;
        if (aux == 0){
            mensaje = 
        }
        
         */
    }
}
