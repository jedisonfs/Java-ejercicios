package modelo.dto;

import java.io.Serializable;

public class TipoDocumentoDTO implements Serializable {

    private static long serialVersionUID = 43L;
    private String initial;
    private String documentName;
    private String typeDocumentState;

    public TipoDocumentoDTO() {
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getTypeDocumentState() {
        return typeDocumentState;
    }

    public void setTypeDocumentState(String typeDocumentState) {
        this.typeDocumentState = typeDocumentState;
    }
}
