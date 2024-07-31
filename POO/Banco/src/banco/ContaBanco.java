package banco;
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("-----------------------------");
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
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    public void setStatus(boolean s){
        this.status = s;
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")){
            this.setSaldo(50.0f);
        } else if (t.equals("CP")){
            this.setSaldo(150.0f);
        }
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta com debito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechado com sucessso");
        }
    }
    
    public void deposita(float s){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + s);
            System.out.println("Deposito realizado com sucesso a conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta fechada");
        }
    }
    
    public void sacar(float s){
        if (this.getStatus()){
            if (this.getSaldo() >= s){
                this.setSaldo(this.getSaldo() - s);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Imposivel sacar de uma conta fechada!");
        }
    }
    
    public void pagarMensal(){
        float v = 0.0f;
        if (this.getTipo().equals("CC")){
            v = 12.0f;
        }  else if (this.getTipo().equals("CP")){
            v = 20.0f;
        }
        if (this.getStatus()){
            if (this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Impossivel pagar");
        }
    }
    
}
