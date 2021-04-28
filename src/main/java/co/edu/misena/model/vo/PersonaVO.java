package co.edu.misena.model.vo;

public class PersonaVO {
    //  definir propiedades atribuutos o campos

    private int idPersona;
    private String documentoPersona;
    private String nombresPersona;
    private String apellidosPersona;
    private String correoPersona;

    //  Constructores de la clase

    public PersonaVO() {
    }

    public PersonaVO(int idPersona, String documentoPersona, String nombresPersona, String apellidosPersona, String correoPersona) {
        this.idPersona = idPersona;
        this.documentoPersona = documentoPersona;
        this.nombresPersona = nombresPersona;
        this.apellidosPersona = apellidosPersona;
        this.correoPersona = correoPersona;
    }

    public PersonaVO(int idPersona) {
        this.idPersona = idPersona;
    }
    //  getter y setter (encapsulación)

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getDocumentoPersona() {
        return documentoPersona;
    }

    public void setDocumentoPersona(String documentoPersona) {
        this.documentoPersona = documentoPersona;
    }

    public String getNombresPersona() {
        return nombresPersona;
    }

    public void setNombresPersona(String nombresPersona) {
        this.nombresPersona = nombresPersona;
    }

    public String getApellidosPersona() {
        return apellidosPersona;
    }

    public void setApellidosPersona(String apellidosPersona) {
        this.apellidosPersona = apellidosPersona;
    }

    public String getCorreoPersona() {
        return correoPersona;
    }

    public void setCorreoPersona(String correoPersona) {
        this.correoPersona = correoPersona;
    }


    //  representación de un toString()

    @Override
    public String toString() {
        return "PersonaVO{" +
                "idPersona=" + idPersona +
                ", documentoPersona='" + documentoPersona + '\'' +
                ", nombresPersona='" + nombresPersona + '\'' +
                ", apellidosPersona='" + apellidosPersona + '\'' +
                ", correoPersona='" + correoPersona + '\'' +
                '}';
    }
}
