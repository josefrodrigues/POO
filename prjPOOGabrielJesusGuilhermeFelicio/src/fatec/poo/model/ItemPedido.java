package fatec.poo.model;

/**
 *
 * @author gabriel
 */
public class ItemPedido {
    private int sequencia;
    private double qtdeVendida;
    private Produto produto;

    public ItemPedido(int sequencia, double qtdeVendida, Produto produto) {
        this.sequencia = sequencia;
        this.qtdeVendida = qtdeVendida;
        this.produto = produto;
    }
    public void setQtdeVendida(){
        produto.setQtdeEstoque(produto.getQtdeEstoque()-qtdeVendida);
    }

    public int getSequencia() {
        return sequencia;
    }

    public double getQtdeVendida() {
        return qtdeVendida;
    }
    
}
