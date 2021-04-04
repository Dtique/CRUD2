
package models;

/**
 *
 * @author Diego Tique
 */
public class Cliente {
    private int id;
    private String nombre;
    private String direccion;
    private String correo;
    private String telefono;
    
    /**
     *
     */
    public Cliente() {
    }

    /**
     *
     * @param id para registrar,actualizar y borrar los datos
     * @param nombre para registrar,actualizar y borrar los datos
     * @param direccion para registrar,actualizar y borrar los datos
     * @param correo para registrar,actualizar y borrar los datos
     * @param telefono para registrar,actualizar y borrar los datos
     */
    public Cliente(int id, String nombre, String direccion, String correo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     *
     * @return
     */
    public String getCorreo() {
        return correo;
    }

    /**
     *
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     *
     * @return
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }  
}
