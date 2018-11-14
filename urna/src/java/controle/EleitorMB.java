/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.DAOeleitor;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import modelo.Eleitor;

/**
 *
 * @author helison
 */
@Named(value = "eleitorMB")
@ViewScoped
public class EleitorMB implements Serializable {
    
    
    private Eleitor eleitor;
    private long titulo;
    private DAOeleitor eleitorDAO;
    
    
    
    public EleitorMB() {
    }
    
    
    @PostConstruct
    public void init(){
        eleitor = new Eleitor();
        eleitorDAO = new DAOeleitor("urnaPU");
    }

    public long getTitulo() {
        return titulo;
    }

    public void setTitulo(long titulo) {
        this.titulo = titulo;
    }
    
    
    public String liberarVoto(){
        
        this.eleitor = this.eleitorDAO.get(Eleitor.class, titulo);
        util.Session.put("eleitor", this.eleitor);
        
        if(this.eleitor != null){
            return "urna";
        }
        else{
            return "eleitor";
        }
    }
    
}
