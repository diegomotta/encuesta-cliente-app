package clases;

/**
 * Created by diego on 02/11/16.
 */
public class Opcion {
    private Integer id;
    private String opcion;

    public Opcion(Integer id, String opcion) {
        this.id = id;
        this.opcion = opcion;
    }

    public Opcion(String opcion) {

        this.opcion = opcion;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }
}
