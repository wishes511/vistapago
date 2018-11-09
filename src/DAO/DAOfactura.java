/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Persistencia.db;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.factura;
import modelo.intfactura;

/**
 *
 * @author Michelon
 */
public class DAOfactura implements intfactura {

    @Override
    public boolean checkdatos(int folio, Connection c) {
        boolean resp = false;
        db bd = new db();
        try {
            resp = bd.checkcampos(folio, c);
        } catch (SQLException ex) {
            Logger.getLogger(DAOfactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resp;
    }

    @Override
    public boolean actualizadatos(ArrayList<String> arr, Connection c) {
        boolean resp = false;
        factura f = new factura();
        db bd = new db();
        try {
            f.setFoliofiscal(arr.get(3));
            f.setFechacertificado(arr.get(2));
            f.setSellosat(arr.get(1));
            f.setNocertificado(arr.get(0));
            f.setSellocfdi(arr.get(4));
            f.setFolio(Integer.parseInt(arr.get(5)));
            resp=bd.updatefields(f, c);
        } catch (SQLException ex) {
            Logger.getLogger(DAOfactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resp;
    }

}
