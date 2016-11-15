package clases;

/**
 * Created by diego on 18/10/16.
 */
public class Dicotomica {

    private Integer id;
    private String respuesta;

    public Dicotomica(Integer id, String respuesta) {
        this.id = id;
        this.respuesta = respuesta;
    }

    public Dicotomica( String respuesta) {

        this.respuesta = respuesta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
