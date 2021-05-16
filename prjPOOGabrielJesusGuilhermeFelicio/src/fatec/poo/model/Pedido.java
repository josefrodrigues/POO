package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author gabriel
 */
public class Pedido {
    private String numero, dataEmissao, dataPagto;
    private boolean formaPagto, situacao;
    private ArrayList<ItemPedido> itens;
    
    public Pedido(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public void setFormaPagto(boolean formaPagto) {
        this.formaPagto = formaPagto;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public boolean isFormaPagto() {
        return formaPagto;
    }

    public boolean isSituacao() {
        return situacao;
    }
    
    
    public void addItemPedido(ItemPedido p){
        this.itens.add(p);
        
    }    
}
