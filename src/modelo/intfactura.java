/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author gateway1
 */
public interface intfactura {
    public boolean actualizadatos(ArrayList<String> arr, Connection c);
    public boolean checkdatos(int folio, Connection c);
}
