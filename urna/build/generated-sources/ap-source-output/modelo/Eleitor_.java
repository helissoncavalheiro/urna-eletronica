package modelo;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Urna;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-03T20:13:29")
@StaticMetamodel(Eleitor.class)
public class Eleitor_ { 

    public static volatile SingularAttribute<Eleitor, String> uf;
    public static volatile SingularAttribute<Eleitor, String> situacao;
    public static volatile SingularAttribute<Eleitor, BigInteger> cpf;
    public static volatile SingularAttribute<Eleitor, String> nome;
    public static volatile SingularAttribute<Eleitor, Urna> idUrna;
    public static volatile SingularAttribute<Eleitor, Long> tituloEleitoral;

}