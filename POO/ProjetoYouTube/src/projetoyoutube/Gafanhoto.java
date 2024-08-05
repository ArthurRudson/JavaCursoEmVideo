package projetoyoutube;
public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    public String getLofin() {
        return login;
    }

    public void setLofin(String lofin) {
        this.login = lofin;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{"+ super.toString() + "\nlogin=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
}
