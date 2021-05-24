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
    private Cliente cliente;
    private Vendedor vendedor;
    
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
     
       public boolean getFormaPagto() {
        return formaPagto;
    }

    public boolean getSituacao() {
        return situacao;
    }

 
     
     
     
     
    public void addItemPedido(ItemPedido p){
        this.itens.add(p);
        
    }    
}
