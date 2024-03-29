package com.software2ex.apiRest.model;

public class RegistroB {
    private Long idRegistro;
    private String codVaca; 
    private String codBecerro;
    private String nameVaca;
    private String nameBecerro;
    private String fechaNacBecerro;
    private String SexoBecerro;
    private String Raza;
    
    
    
    public RegistroB() {
    }



    public RegistroB(Long idRegistro, String idVaca, String idBecerro, String nameVaca, String nameBecerro,
            String fechaNacBecerro, String sexoBecerro, String raza) {
        this.idRegistro = idRegistro;
        this.codVaca = idVaca;
        this.codBecerro = idBecerro;
        this.nameVaca = nameVaca;
        this.nameBecerro = nameBecerro;
        this.fechaNacBecerro = fechaNacBecerro;
        SexoBecerro = sexoBecerro;
        Raza = raza;
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
        return SexoBecerro;
    }



    public void setSexoBecerro(String sexoBecerro) {
        SexoBecerro = sexoBecerro;
    }



    public String getRaza() {
        return Raza;
    }



    public void setRaza(String raza) {
        Raza = raza;
    }




}
