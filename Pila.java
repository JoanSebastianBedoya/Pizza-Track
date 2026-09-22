public class Pila {
    private Nodo tope;

    public Pila() {
        this.tope = null;
    }

    public void push(Pizza pizza) {
        Nodo nuevoNodo = new Nodo(pizza);
        nuevoNodo.setSiguiente(tope);
        tope = nuevoNodo;
        
    }

    public Pizza pop() {

        if (this.tope == null) {
            return null;    
        }

        Pizza pizzaSacada = this.tope.getPizza();
        this.tope = this.tope.getSiguiente();
        return pizzaSacada;


    }

    public Pizza peek() {
        if (this.tope == null) {
            return null;
        }
        return this.tope.getPizza();
    }

    public boolean isEmpty() {
        return this.tope == null;
    }

}   