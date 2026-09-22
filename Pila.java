public class Pila { // Estructura de pila
    private Nodo tope;

    public Pila() {
        this.tope = null;
    }

    //Metodos para agregar, sacar y ver la pizza en el tope de la pila

    public void push(Pizza pizza) {  // Ingresa pizza a una pila
        
        // crea un nuevo nodo con la pizza > actualiza el atributo siguiente con el tope actual > actualiza el tope con el nuevo nodo
        Nodo nuevoNodo = new Nodo(pizza);
        nuevoNodo.setSiguiente(tope);
        tope = nuevoNodo;
        
    }

    public Pizza pop() { //Sacar pizza de una pila

        // verifica si la pila esta vacia, si es asi retorna null
        if (this.tope == null) { 
            return null;    }

        // Guarda en una variable temporal la pizza que se encuentre en el tope
        Pizza pizzaSacada = this.tope.getPizza();
        //Actualiza el tope con el siguiente nodo, eliminando asi la pizza del tope
        this.tope = this.tope.getSiguiente();
        //Retorna la pizza que sacamos a una variable externa (para insertarla en otra pila)
        return pizzaSacada;


    }

    public Pizza peek() { //Mostrar pizza en el tope de la pila sin sacarla
        //Verifica si la pila PRINCIPAL esta vacia, si es asi retorna null
        if (this.tope == null) {
            return null; }

        //Si no esta vacia, retorna la pizza actual del tope. tope es de tipo Nodo, Nodo tiene metodo getpizza, que retorna la pizza que contiene el nodo.    
        return this.tope.getPizza();
    }


    public boolean isEmpty() { //Verifica si la pila esta vacia, retorna true si lo esta, false si no lo esta 
        return this.tope == null;
    }

}   