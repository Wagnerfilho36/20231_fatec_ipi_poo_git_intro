public class Empregado{
    //variável de instância (objeto)
    private String nome;
    //variável de instância (objeto)
    private int idade;
    private double salario;
    private double comissao;
    private double bonus;
    private int tipo;
    
    //codigo de infra

    public double calcularSalario(){
        if (tipo == 1){
            return salario;
        }
        if (tipo == 2){
            return salario + salario * comissao;
        }
        if (tipo == 3){
            return salario + bonus;
        }
        return 0;

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        //shadowing - sobreamento. a variavel nome passa em frente da variavel de instância (se tiver o mesmo nome)
        this.nome = nome;
    } 
    
    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    } 
}

//A letra A(verde) A= untracked  verde =staged
//M = modified---- verde = staged