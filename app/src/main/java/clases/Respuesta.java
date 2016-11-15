package clases;

/**
 * Created by diego on 18/10/16.
 */
public class Respuesta {
    private Integer id;
    private String calificacion;

    public Respuesta(Integer id, String calificacion) {
        this.id = id;
        this.calificacion = calificacion;
    }

    public Respuesta(String calificacion) {
        this.calificacion = calificacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
}
