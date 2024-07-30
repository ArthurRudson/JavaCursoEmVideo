package aula02;
public class Celular {
    String marca;
    String modelo;
    String cor;
    int carga;
    
    void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Carga: " + this.carga);
    }
    
    void ligado(){
        if (carga > 0){
            System.out.println("Ligado");
        } else {
            System.out.println("Desligado");
        }
    }
}
