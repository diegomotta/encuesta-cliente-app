package clases;

/**
 * Created by diego on 18/10/16.
 */
public class Sugerencia {

    private Integer id;
    private String respuesta;

    public Sugerencia( Integer id,String respuesta) {
        this.respuesta = respuesta;
        this.id = id;
    }

    public Sugerencia(String respuesta) {
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
