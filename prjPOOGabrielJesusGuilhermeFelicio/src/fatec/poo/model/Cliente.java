package fatec.poo.model;

/**
 *
 * @author gabriel
 */
public class Cliente extends Pessoa {
    double limiteCred, limiteDisp;
    //Falta associação binaria com ArrayList

    public Cliente(String cpf, String nome, double limiteCred) {
        super(cpf, nome);
        this.limiteCred = limiteCred;
        limiteDisp = this.limiteCred;
    }

    public void setLimiteCred(double limiteCred) {
        this.limiteCred = limiteCred;
    }

    public double getLimiteCred() {
        return limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }
    
}
