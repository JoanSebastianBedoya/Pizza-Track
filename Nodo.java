public class Nodo {
    private Pizza pizza;
    private Nodo siguiente;

    public Nodo(Pizza pizza) {
        this.pizza = pizza;
        this.siguiente = null;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }




}