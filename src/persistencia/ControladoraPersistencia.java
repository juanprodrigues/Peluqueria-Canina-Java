package persistencia;

import logica.Perrito;


/**
 *
 * @author JuanPC
 */
public class ControladoraPersistencia {
    PerritoJpaController perriJPA = new PerritoJpaController();
    
    //agrega un perro a ala base de datos 
    public void agregarCliente(Perrito perri){
        perriJPA.create(perri);
    }
    
 
}
