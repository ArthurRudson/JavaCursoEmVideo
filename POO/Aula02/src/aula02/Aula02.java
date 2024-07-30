package aula02;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
        
        Celular tel = new Celular();
        tel.modelo = "Xaomi";
        tel.marca = "Redmi note 11";
        tel.cor = "Azul celeste";
        tel.carga = 0;
        tel.status();
        tel.ligado();
        
        Trabalho job = new Trabalho();
        job.proficao = "Vigilante";
        job.area = "Vigilante patrimonial";
        job.trabalhando = true;
        job.salario = 2567.33f;
        job.horas_trabalhadas = 180;
        job.status();
        job.salarioMinimo();
        
        System.out.println("");
        
        Trabalho estagio = new Trabalho();
        estagio.proficao = "Progamacao";
        estagio.area = "estagiario";
        estagio.trabalhando = false;
        estagio.salario = 500.0f;
        estagio.horas_trabalhadas = 400;
        estagio.status();
        estagio.salarioMinimo();
    }
    
}
