public class GestionPedidos {
    private Pila pilaPrincipal; // Pila para almacenar los pedidos realizados
    private Pila pilaSecundaria; // Pila para almacenar los pedidos deshechos

    public GestionPedidos() { //constructor que inicializa las pilas
        this.pilaPrincipal = new Pila();
        this.pilaSecundaria = new Pila();
    }


    public void agregarPedido(Pizza pizza) {
        //Registra la pizza nueva y la agrega a la pila principal
        pilaPrincipal.push(pizza);
    }


    public void deshacer() {
        //Evalua si la pila principal esta vacia, si es asi, no hay pedidos para deshacer
         if (this.pilaPrincipal.isEmpty()) {
            System.out.println("No hay pedidos para deshacer.");
            return;
        }

        //Saca la pizza del tope de la pila principal y usando la variable temporal pizzaDeshecha, la agrega a la pila secundaria
        Pizza pizzaDeshecha = this.pilaPrincipal.pop();
        this.pilaSecundaria.push(pizzaDeshecha);
    }

    public void rehacer() {
        //Evalua si la pila secundaria esta vacia, si es asi, no hay pedidos para rehacer
        if (this.pilaSecundaria.isEmpty()) {
            System.out.println("No hay pedidos para rehacer.");
            return;
        }
        //Saca la pizza del tope de la pila secundaria y usando la variable temporal pizzaRecuperada, la agrega a la pila principal
        Pizza pizzaRecuperada = this.pilaSecundaria.pop();
        this.pilaPrincipal.push(pizzaRecuperada);
    }

      public Pizza mostrarPedidoActual() {
        //Retorna la pizza que se encuentra en el tope de la pila principal, sin sacarla
        return this.pilaPrincipal.peek();
    }



}
