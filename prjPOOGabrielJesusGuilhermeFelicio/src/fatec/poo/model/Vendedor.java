package fatec.poo.model;

/**
 *
 * @author gabriel
 */
public class Vendedor extends Pessoa{
    private double salarioBase, taxaComissão;
    //Falta implementar ArrayList

    public Vendedor(String cpf, String nome, double salarioBase) {
        super(cpf, nome);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getTaxaComissão() {
        return taxaComissão;
    }

    public void setTaxaComissão(double taxaComissão) {
        this.taxaComissão = taxaComissão;
    }
    
}
