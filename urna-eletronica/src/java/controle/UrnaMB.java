/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.DAO;
import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import modelo.Chapa;

/**
 *
 * @author helison
 */
@Named(value = "urnaMB")
@ViewScoped
public class UrnaMB implements Serializable {

    private DAO daoUrna;
    private Chapa chapa;
    
    public UrnaMB() {
    }
    
    public void registrarVoto(){
        
    }
    
}