El objetivo del Programa es registrar las Pizzas en una lista ligada, con la característica de poder deshacer cambios y rehacer las pizzas previamente desechas.

Para ingresar las pizzas como pedido primero tenemos que definir la estructura de pizza, por medio de una clase "Pizza"
La cual contiene 2 variables tipo "String" Nombre y el arreglo ingredientes. capturamos los valores por medio de un constructor
Y creamos los métodos "getNombre" y "getIngredientes"

Creamos la estructura de "Nodo" que es la clase que nos permite guardar una "pizza" y un atributo "Siguiente" que sera lo que conecte la pizza que ingresemos con la ultima pizza agregada. Creamos los métodos getPizza y getSiguiente para saber que pizza tiene este nodo y a cual pizza apunta
y creamos el método void setSiguiente para actualizar el atributo "siguiente" con la ultima pizza ingresada

En la clase pila.java programamos la lógica manual (push, pop, peek, isEmpty)

**push:** cuando llamemos el método el parámetro captura una pizza, pasamos la pizza ingresada al constructor nuevoNodo y actualizamos el atributo siguiente con el tope actual, una vez guardamos el tope actual en siguiente, remplazamos el tope con la pizza que acabamos de ingresar sin riesgo de perder la pizza anterior (Ya que ya esta en siguiente)

**pop:** Eliminamos la pizza simplemente modificando el atributo tope, pero cada vez que hacemos pop, tenemos que hacer push en la otra pila, entonces capturamos el tope actual (la pizza que vamos a sacar) en una variable temporal y actualizamos el tope con la pizza que se encontraba en el atributo siguiente de la pizza que acabamos de eliminar

**nodo 1**                   
Pizza: hawaiana          
Siguiente: Pepperoni

**nodo 2**
Pizza: Pepperoni
Siguiente: null

hawaina se guarda en pizzasacada
tope = siguiente de nodo 1 es decir "Pepperoni"

**Peek:** Evaluamos si la pila principal tiene pedidos que mostrar

En caso de que los tenga solo retornamos getPizza apuntando al tope actual, tope al ser de tipo Nodo tiene acceso a este método

**isEmpty:** Evalúa si hay pizzas en la pila usando como condición si tope es null, en caso de que sea null arroja true caso contrario arroja else 
este no lo utilizamos como una acción de consola pero si como condición en los métodos deshacer y rehacer

==========================================================================================================================================================

En gestionPedidos.java definimos la pilaprincipal (pedidos activos) y pilasecundaria (pedidos deshechos)

Creamos los métodos correspondientes a la acción:

**Agregar pizza:** Llama el método push, ingresando la pizza que entra como parámetro cuando llamamos la función

**Deshacer:** Evalúa si hay pizzas en la pilaprincipal, llamamos el método pop y cuando termine guarda el tope previo a la eliminación en una variable temporal "Pizzadeshecha" 
luego hacemos push de "pizzadeshecha" a la pilasecundaria

**Rehacer:** Evalúa si hay pizzas en la pilasecundaria, llamamos el método pop y cuando termine guarda el tope previo a la recuperación en una variable temporal "Pizzarecuperada" 
luego hacemos push de "pizzarecuperada" a la pilaprincipal 

**MostrarPedidoActual:** Llamamos el método peek que internamente evalúa si hay pizzas en la pilaprincipal y retorna el tope

==========================================================================================================================================================

Por ultimo en main.java llamamos el método que corresponda con la acción elegida en consola

1. **Agregar pedido:** Captura Nombre y los 3 ingredientes por medio de scanner.nextLine(), Pasa estas variables como parámetro al constructor de la clase Pizza.java y llama el método AgregarPedido pasando como parámetro pizza, que es la variable que acabamos de crear al mandar el nombre y los ingredientes al constructor

2. **Deshacer:** Llamamos al método deshacer

3. **Rehacer:** Llamamos al método rehacer

4. **MostrarPedidoActual:** Llamamos al método mostrarPedidoActual, nos retorna una pizza de getPizza (método del Nodo) y de aquí sacamos getNombre y getIngredientes. condicionando de que si el tope es null imprimimos un mensaje que dice que no hay pedidos. 


**CAPTURAS:**

**1. Agregamos la primera pizza y la mostramos:**

<img width="601" height="874" alt="imagen" src="https://github.com/user-attachments/assets/68ee837b-f97b-4fa5-b3f7-dc7dabba04ff" />

**2. Agregamos 2 Pizzas mas (Hawaiana (tope) > Pollo > Pepperoni > Null)**

Ingresamos Pollo:

<img width="572" height="660" alt="imagen" src="https://github.com/user-attachments/assets/522b70ea-fadc-4a87-9431-9f72973e7a8e" />

Ingresamos Hawaiana:

<img width="597" height="669" alt="imagen" src="https://github.com/user-attachments/assets/a91d116a-5c74-4749-9647-2f6a5cc3fa12" />

**Llegamos a Pepperoni con la accion "Deshacer" 2 veces**

<img width="593" height="904" alt="imagen" src="https://github.com/user-attachments/assets/4d7ae3ae-3870-4588-9853-e2a469814006" />

**Llegamos a Hawaiana con la accion "Rehacer" 2 veces**

<img width="615" height="746" alt="imagen" src="https://github.com/user-attachments/assets/88260c5c-2d10-4c73-a4c1-6e632c964b0f" />

**Escenarios donde no hay pizzas que Mostrar, Deshacer y Rehacer**

<img width="612" height="893" alt="imagen" src="https://github.com/user-attachments/assets/32325ec5-3fee-4186-93e2-a0d6d1513499" />





**VIDEO**

https://drive.google.com/file/d/1-dbPqrmY_wD1DqzDZZD6a8791skGAuCf/view?usp=sharing





