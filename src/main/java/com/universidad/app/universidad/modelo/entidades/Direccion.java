package com.universidad.app.universidad.modelo.entidades;

import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
public class Direccion implements Serializable {
    private String calle;
    private String numero;
    private String codigoPostal;
    private String dpto;
    private String piso;
    private String localisdad;

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getLocalisdad() {
        return localisdad;
    }

    public void setLocalisdad(String localisdad) {
        this.localisdad = localisdad;
    }

    public Direccion() {
    }

    public Direccion(String calle, String numero, String codigoPostal, String dpto, String piso, String localisdad) {
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.dpto = dpto;
        this.piso = piso;
        this.localisdad = localisdad;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", numero='" + numero + '\'' +
                ", cogigoPostal='" + codigoPostal + '\'' +
                ", dpto='" + dpto + '\'' +
                ", piso='" + piso + '\'' +
                ", localisdad='" + localisdad + '\'' +
                '}';
    }
}
