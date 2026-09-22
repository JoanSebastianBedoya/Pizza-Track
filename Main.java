import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionPedidos gestor = new GestionPedidos(); // Crea una instancia de GestionPedidos para manejar los pedidos y crear las pilas

        while (true) {

            // Muestra el menú de opciones al usuario
            System.out.println("\n\nSeleccione una opción:");
            System.out.println("1. Agregar pedido");
            System.out.println("2. Deshacer pedido");
            System.out.println("3. Rehacer pedido");
            System.out.println("4. Mostrar pedido actual");
            System.out.println("0. Salir\n");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 


            switch (opcion) { //llama un metodo segun la seleccion del usuario


                case 1: // Agrega un nuevo pedido (el constructor pizza lo recibe, llamamos el metodo agregarPedido y le pasamos la pizza como parametro al metodo push)
                    System.out.print("\nIngrese el nombre de la pizza: ");
                    String nombre = scanner.nextLine();
                    String ingredientes[] = new String[3];
                    for (int i = 0; i < 3; i++) {
                        System.out.print("\nIngrediente " + (i + 1) + ": ");
                        ingredientes[i] = scanner.nextLine();
                    }

                    Pizza pizza = new Pizza(nombre, ingredientes);
                    gestor.agregarPedido(pizza);
                    break;

                case 2: // Guardamos el tope actual de la pila principal en una variable temporal, actualizamos el tope con el siguiente nodo y hacemos push de la pizza que sacamos a la pila secundaria
                    gestor.deshacer(); 
                    break;

                case 3: // Guardamos el tope actual de la pila secundaria en una variable temporal, actualizamos el tope con el siguiente nodo y hacemos push de la pizza que sacamos a la pila principal
                    gestor.rehacer(); 
                    break;

                case 4://llamamos el metodo peek para obtener la pizza que se encuentra en el tope de la pila principal, sin sacarla
                //El metodo mostrar pedido retorna la pizza llamando al metodo peek, que retorna la pizza que se encuentra en el tope, al ser tipo nodo contiene el metodo getpizza, que retorna la pizza que contiene el nodo.

                    Pizza pedidoActual = gestor.mostrarPedidoActual();
                    if (pedidoActual != null) {
                        System.out.println("\nPedido actual: ");
                         System.out.println("\nNombre: " + pedidoActual.getNombre());
                        System.out.print("Ingredientes: ");
                        for (String ingrediente : pedidoActual.getIngredientes()) {
                            System.out.print(ingrediente + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("\nNo hay pedidos actuales.");
                    }
                    break;
                case 0:

                    System.out.println("\nSaliendo del programa...");
                    scanner.close();
                    return;
                default:
                    
                    System.out.println("\nOpción inválida. Intente nuevamente.");
            }
        }


    }




}