package clases;

/**
 * Created by diego on 12/10/16.
 */
public class Pregunta {

    private Integer id;
    private Integer codPregunta;
    private String pregunta;

    public Pregunta(){}

    public Pregunta(Integer id, Integer codPregunta, String pregunta){
        this.id = id;
        this.codPregunta = codPregunta;
        this.pregunta = pregunta;
    }

    public Pregunta( Integer codPregunta, String pregunta){

        this.codPregunta = codPregunta;
        this.pregunta = pregunta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodPregunta() {
        return codPregunta;
    }

    public void setCodPregunta(Integer codPregunta) {
        this.codPregunta = codPregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
}
