
package Aula05CursoemVideo;


public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("-------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public ContaBanco() {
        this.saldo = 0.0f;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        }
        else if (t == "CP") {
            this.setSaldo(150);
        }
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0)
            System.out.println("Conta com dinheiro.");
        else if (this.getSaldo() < 0)
            System.out.println("Conta em débito.");
        else
            this.setStatus(false);
    }
    
    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
        }
        else {
            System.out.println("Impossível depositar");
        }
    }
    
    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(getSaldo() - v);
            }
            else {
                System.out.println("Saldo insuficiente");
            }
        }
        else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    
    public void pagarMensal() {
        float v;
        
        v = 0.0f;
        
        if (this.getTipo() == "CC") {
            v = 12.0f;
        }
        else if (this.getTipo() == "CP") {
            v = 20.0f;
        }
        
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(getSaldo() - v);
            }
            else {
                System.out.println("Saldo insuficiente");
            }
        }
        else {
            System.out.println("Impossível pagar uma conta fechada");
        }
    }
}
