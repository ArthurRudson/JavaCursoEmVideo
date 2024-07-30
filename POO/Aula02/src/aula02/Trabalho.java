package aula02;
public class Trabalho {
    String proficao;
    String area;
    boolean trabalhando;
    float salario;
    int horas_trabalhadas;
    
    void status(){
        System.out.println("Proficao: " + this.proficao);
        System.out.println("Area: " + this.area);
        System.out.println("Trabalhando? " + this.trabalhando);
        System.out.println("Salario: " + this.salario);
        System.out.println("Horas trabalhadas: " + this.horas_trabalhadas);
    }
    
    void salarioMinimo(){
        if (salario > 1412){
            System.out.println("maior que o salrio minino atual");
        } else {
            System.out.println("menor que o salario minino atual");
        }
    }
}
