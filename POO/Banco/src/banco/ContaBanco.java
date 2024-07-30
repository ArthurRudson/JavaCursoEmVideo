package banco;
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

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
        if (saldo > 0){
            System.out.println("Conta com dinheiro");
        } else if (saldo < 0){
            System.out.println("Conta com debito");
        } else {
            this.setStatus(false);
        }
    }
    
    public void deposita(float s){
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo() + s);
        } else {
            System.out.println("Impossivel depositar");
        }
    }
    
    public void sacar(float s){
        if (this.getStatus() == true){
            if (this.getSaldo() > s){
                this.setSaldo(this.getSaldo() - s);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Imposivel sacar");
        }
    }
    
    public void pagarMensal(){
        float v = 0.0f;
        if (this.getTipo().equals("CC")){
            v = 12.0f;
        }  else if (this.getTipo().equals("CP")){
            v = 20.0f;
        }
        if (this.getStatus() == true){
            if (this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Impossivel pagar");
        }
    }
    
}
