/*
* Gerado automaticamente por GUMGAGenerator em 12/08/2015 11:46:56
*/


package br.com.empresa.piloto.domain.model;

import gumga.framework.domain.GumgaModel;
import gumga.framework.domain.GumgaMultitenancy;
import java.io.Serializable;
import java.util.*;
import java.math.BigDecimal;
import javax.persistence.*;
import gumga.framework.domain.domains.*;
import org.hibernate.annotations.Columns;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.envers.Audited;
import com.fasterxml.jackson.annotation.JsonIgnore;

@GumgaMultitenancy
@SequenceGenerator(name = GumgaModel.SEQ_NAME, sequenceName = "SEQ_ITEMPEDIDOSERVICO")
@Indexed
@Audited
@Entity
public class ItemPedidoServico extends GumgaModel<Long> implements Serializable {

    @Version
    private Integer version;


    //@Field //Descomente para ser utilizado na busca multientidades
    @ManyToOne
    private Servico servico;
    //@Field //Descomente para ser utilizado na busca multientidades
    private Integer horas;

    public ItemPedidoServico(){
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

}
