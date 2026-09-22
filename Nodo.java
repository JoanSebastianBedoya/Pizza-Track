public class Nodo { // Estructura de Nodo para la pila
    private Pizza pizza;
    private Nodo siguiente;

    public Nodo(Pizza pizza) { //Captura la pizza y declara nulo el siguiente nodo
        this.pizza = pizza;
        this.siguiente = null;
    }

    //Metodos para obtener la pizza y el siguiente nodo

    public Pizza getPizza() {
        return pizza;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }


    //Metodo para establecer el siguiente nodo (la pizza que se encuentre en el tope)

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }




}