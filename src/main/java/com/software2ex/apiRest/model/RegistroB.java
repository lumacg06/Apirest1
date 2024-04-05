package com.software2ex.apiRest.model;

public class RegistroB {
    private Long idRegistro;
    private String codVaca; 
    private String codBecerro;
    private String nameVaca;
    private String nameBecerro;
    private String fechaNacBecerro;
    private String sexoBecerro;
    private String raza;
    
    
    
    public RegistroB() {
    }



    


    public RegistroB(Long idRegistro, String codVaca, String codBecerro, String nameVaca, String nameBecerro,
            String fechaNacBecerro, String sexoBecerro, String raza) {
        this.idRegistro = idRegistro;
        this.codVaca = codVaca;
        this.codBecerro = codBecerro;
        this.nameVaca = nameVaca;
        this.nameBecerro = nameBecerro;
        this.fechaNacBecerro = fechaNacBecerro;
        this.sexoBecerro = sexoBecerro;
        this.raza = raza;
    }


    public Long getIdRegistro() {
        return idRegistro;
    }


    public void setIdRegistro(Long idRegistro) {
        this.idRegistro = idRegistro;
    }


    public String getCodVaca() {
        return codVaca;
    }


    public void setCodVaca(String codVaca) {
        this.codVaca = codVaca;
    }

    public String getCodBecerro() {
        return codBecerro;
    }

    public void setCodBecerro(String codBecerro) {
        this.codBecerro = codBecerro;
    }

    public String getNameVaca() {
        return nameVaca;
    }

    public void setNameVaca(String nameVaca) {
        this.nameVaca = nameVaca;
    }

    public String getNameBecerro() {
        return nameBecerro;
    }

    public void setNameBecerro(String nameBecerro) {
        this.nameBecerro = nameBecerro;
    }
    public String getFechaNacBecerro() {
        return fechaNacBecerro;
    }

    public void setFechaNacBecerro(String fechaNacBecerro) {
        this.fechaNacBecerro = fechaNacBecerro;
    }

    public String getSexoBecerro() {
        return sexoBecerro;
    }

    public void setSexoBecerro(String sexoBecerro) {
        this.sexoBecerro = sexoBecerro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }



}
