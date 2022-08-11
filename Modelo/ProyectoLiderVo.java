
package mintic.reto5listo.Modelo;

public class ProyectoLiderVo {
    
   private Integer id_lider;
   private String nombre;
   private String primer_apellido;
   private String ciudad_residencia;

   //como ven es una clase comun y corrienete solo tengo que generar los getter y los setter para ella y el constructor

    public ProyectoLiderVo(Integer id_lider, String nombre, String primer_apellido, String ciudad_residencia) {
        this.id_lider = id_lider;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.ciudad_residencia = ciudad_residencia;
    }

   
   
    public Integer getId_lider() {
        return id_lider;
    }

    public void setId_lider(Integer id_lider) {
        this.id_lider = id_lider;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getCiudad_residencia() {
        return ciudad_residencia;
    }

    public void setCiudad_residencia(String ciudad_residencia) {
        this.ciudad_residencia = ciudad_residencia;
    }


} 
