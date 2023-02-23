public class Empregado{
    //variável de instância (objeto)
    private String nome;
    //variável de instância (objeto)
    private int idade;
    private double salario;
    private double comissao;
    private double bonus;
    private int tipo;
    
    public double calcularSalario(){
        if (tipo == 0){
            return salario;
        }
        if (tipo == 1){
            return salario + salario * comissao;
        }
        if (tipo == 3){
            return salario + bonus;
        }
        return 0;

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
    public void setIdade(String nome){
        this.idade = idade;
    } 
}