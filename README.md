# Peluqueria-Canina-Java
## De que se trata

En este proyecto se realizó una interfaz con la cual un usuario pudiera registrar una mascota en una base de datos.
La metodología que se utilizó, fue separar en 3 capas, una vista, controlador y lógica

Para interactuar con la base de datos por medio de objetos se usó JPA, haciendo una conexión con MySQL 


# Capas
A continuación, se muestras las capas y un resumen de sus características
## Lógica
Contienen 3 clases, en la cuales encontramos un clase principal TP02 , una clase de entidad y por último, una clase de Controladora.

La clase Principal, nos ayuda a ejecutar la interfaz, ya que llama los recursos que se necesitan para que se ejecute.

La clases Perrito contiene los atributos y métodos para acceder a el.

La clase Controladora , continente 2 métodos, los cuales son
 #### validadCliente
 Este método valida que los datos ingresados no sean nulos o vacío.
 #### crearCliente
 En este método contiene el método anterior, dentro de un Try-Catch, para que verifique si los datos ingresados son correctos. Sí no ocurre una excepción, los datos ingresados se guardan en la Base de Datos.
## Persistencia
En esta capa podemos encontrar clases que nos ayudan a persistir la base de datos

PerritoJpaController, hace la conexión a la base de datos y en esta clase podemos crear métodos de los cuales podemos enviar y recibir información de la base de datos.

#### PerritoJpaController
Realiza una conexión con la base de datos a partir del archivo persistence.xml
#### create 
Persiste en la base de datos creando el objeto.

La ControladoraPersistencia contine métodos para enviar y recibir los elementos de la BD.
#### agregarCliente 
Envía el objeto creado al método create de la clase PerritoJpaController.

## Vistas/GUI
En esta capa se encuentran las vistas o interfaces graficas que creamos. En particular, para este proyecto se realizaron 3 vistas
#### Principal
La primera vista al ingresar a la aplicación. Como se observa, hay campos a completar y dos botones con su respectiva acción.
![alt pepe](https://i.ibb.co/xLb7XSG/image.png)
#### Error
Si al momento de guardar los datos, se hallan campos vacíos, emerge esta ventana como advertencia y no se guardaran los datos
![alt text](https://i.ibb.co/PW3xLTh/image.png)
#### Guardar
En el caso que los datos sean correctos, se guardaran en la base de datos y se mostrara esta ventana.
![alt text](https://i.ibb.co/TT0Wt1c/image.png)

