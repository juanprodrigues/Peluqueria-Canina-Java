package logica;


import javax.swing.WindowConstants;
import persistencia.ControladoraPersistencia;
import vistas.Guardados;
import vistas.Error;

/**
 *
 * @author JuanPC
 */
public class Controladora {

    public Controladora() {
    }
    //llamamos al control persistencia
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    //creamos un objeto para luego enviarlo a la base de datos
    public void crearCliente(String nombre, String raza, String color, String alergico, String atencion_especial, String nombre_duenio, String celular_duenio, String observaciones) {

        try {
            validarCliente(nombre, raza, color, alergico, atencion_especial, nombre_duenio, celular_duenio, observaciones);
            Perrito perri = new Perrito();

            perri.setNombre_perro(nombre);
            perri.setRaza(raza);
            perri.setColor(color);
            perri.setAlergico(alergico);
            perri.setAtencion_especial(atencion_especial);
            perri.setNombre_duenio(nombre_duenio);
            perri.setCelular_duenio(celular_duenio);
            perri.setObservaciones(observaciones);

            controlPersis.agregarCliente(perri);

            Guardados guardar = new Guardados();
            guardar.setVisible(true);
            guardar.setLocationRelativeTo(null);
            guardar.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        } catch (Exception e) {
            Error errorCargar = new Error();
            errorCargar.setVisible(true);
            errorCargar.setLocationRelativeTo(null);
            errorCargar.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        }

    }
    //validamos que los datos ingresados por usuario no sean nulos o vacios

    public void validarCliente(String nombre, String raza, String color, String alergico, String atencion_especial, String nombre_duenio, String celular_duenio, String observaciones) throws Exception {
        if (nombre == null || nombre.isEmpty()) {
            throw new Exception();
        }

        if (raza == null || raza.isEmpty()) {
            throw new Exception();
        }
        if (color == null || color.isEmpty()) {
            throw new Exception();
        }
        if (alergico ==  "-") {
            throw new Exception();
        }
        if (atencion_especial == "-") {
            throw new Exception();
        }
        if (nombre_duenio == null || nombre_duenio.isEmpty()) {
            throw new Exception();
        }
        if (celular_duenio == null || celular_duenio.isEmpty()) {
            throw new Exception();
        }
        if (observaciones == null || observaciones.isEmpty()) {
            throw new Exception();
        }

    }

}
