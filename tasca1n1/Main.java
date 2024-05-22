/*En todos los ejercicios, crea un proyecto con una clase Main que demuestre el uso del patrón (con las necesarias invocaciones).

Pattron --> Singleton
Crea una clase que replique el funcionamiento del comando 'Undo'. Esta clase será utilizada por la clase Main,
que permitirá introducir opciones por consola.

La clase 'Undo' debe guardar los últimos pedidos introducidos. Debe permitir añadir o eliminar pedidos,
así como listar los últimos pedidos introducidos (similar al comando 'history' en Linux).
La clase 'Undo' debe implementar imprescindiblemente un patrón Singleton.*/

package tasca1n1;

import tasca1n1.undo.Undo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean opcion = true;
        String opcionUsuario;
        Scanner entrada = new Scanner(System.in);

        Undo pedido = Undo.getObjeto();  //Se instancia la clase

        do {
            System.out.println("\nEscribe el numero de la opcion que quieres realizar:\n" +
            "1. Añadir pedido\n" +
            "2. Eliminar pedido\n" +
            "3. Listar pedidos\n" +
            "4. SALIR" );

            opcionUsuario = entrada.nextLine();

            switch (opcionUsuario) {
                case "1":
                    pedido.anadirPedido();
                    break;
                case "2":
                    pedido.eliminarPedido();
                    break;
                case "3":
                    pedido.listarPedidos();
                    break;
                case "4":
                    System.out.println("Hasta pronto ...");
                    opcion = false;
                    break;
                default:
                    System.out.println("Este opcion no existe. Intenta de nuevo.Escribe una opcion valida!");
            }

        } while (opcion);

    }
}