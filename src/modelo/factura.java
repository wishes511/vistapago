/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Michelon
 */
public class factura implements java.io.Serializable{

    public String getFoliofiscal() {
        return this.foliofiscal;
    }

    public void setFoliofiscal(String foliofiscal) {
        this.foliofiscal = foliofiscal;
    }

    public String getNocertificado() {
        return this.nocertificado;
    }

    public void setNocertificado(String nocertificado) {
        this.nocertificado = nocertificado;
    }

    public String getFechacertificado() {
        return this.fechacertificado;
    }

    public void setFechacertificado(String fechacertificado) {
        this.fechacertificado = fechacertificado;
    }

    public String getSellosat() {
        return this.sellosat;
    }

    public void setSellosat(String sellosat) {
        this.sellosat = sellosat;
    }

    public String getSellocfdi() {
        return this.sellocfdi;
    }

    public void setSellocfdi(String sellocfdi) {
        this.sellocfdi = sellocfdi;
    }
    private String foliofiscal,nocertificado,fechacertificado,sellosat,sellocfdi;
    private int folio;

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }
}
