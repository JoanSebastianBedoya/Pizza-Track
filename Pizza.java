public class Pizza { // Estructura de Pizza 
    private String nombre;
    private String[] ingredientes;

    public Pizza (String nombre, String[] ingredientes) { // Constructor de la clase Pizza 
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    
    }

    //Metodos para obtener el nombre y los ingredientes de la pizza

    public String getNombre() { 
        return this.nombre;
    }

    public String[] getIngredientes() {
        return this.ingredientes;
    }


}