package tarea1n1.undo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Undo {
    private static Undo objeto;
    private final List<String> verLosPedidos;

    final static Scanner entrada = new Scanner(System.in);

    private Undo() {  //Constructor privado de la clase Undo
        verLosPedidos = new ArrayList<>();
    }

    public static Undo getObjeto() {  //Singleton de la clase Undo
        if (objeto == null) {
            objeto = new Undo();
        }
        return objeto;
    }

    public void anadirPedido() {  //Anade pedidos a la lista
        try {
            System.out.print("Escribe el nombre del pedido que quieres hacer: ");
            String nombrePedido = entrada.nextLine();
            verLosPedidos.add(nombrePedido);
            System.out.println("Pedido '" + nombrePedido + "' se agregó correctamente a la lista de pedidos.");
        } catch (Exception e) {
            System.out.println("No se pudo agregar el pedido. Inténtalo de nuevo.");
        }
    }

    public void eliminarPedido() {
        try {
            int numeroPedido;
            if (!verLosPedidos.isEmpty()) {
                do {
                    System.out.println("Escribe el numero del pedido que quieres eliminar: ");
                    listarPedidos();

                    numeroPedido = entrada.nextInt();
                    numeroPedido--;
                    if (numeroPedido >= verLosPedidos.size() || numeroPedido < 0) {
                        System.out.println("Número de pedido inválido. Inténtalo de nuevo.");
                    }
                } while (numeroPedido >= verLosPedidos.size() || numeroPedido < 0);

                String eliminarComando = verLosPedidos.remove(numeroPedido);
                System.out.println("Pedido '" + eliminarComando + "' se eliminó de la lista de pedidos correctamente.");
            } else {
                System.out.println("No existen pedidos para eliminar.");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No existen pedidos para eliminar.");
        }
    }

    public void listarPedidos() {  //Muestra la lista de pedidos
        try {
            if (!verLosPedidos.isEmpty()) {
                System.out.println("Lista de pedidos:");
                for (int i = 0; i < verLosPedidos.size(); i++) {
                    System.out.println((i + 1) + ". " + verLosPedidos.get(i));
                }
            } else {
                System.out.println("No existen pedidos para mostrar.");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No existen pedidos para mostrar.");
        }
    }

}