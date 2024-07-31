package banco;
public class Banco {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        
        p1.deposita(100.0f);
        p2.deposita(500.0f);
        
        p2.sacar(100.0f);
        
        p1.sacar(150.0f);
        p1.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
}
