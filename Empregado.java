public class Empregado{
    //variável de instância (objeto)
    private String nome;
    //variável de instância (objeto)
    private int idade;
    
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