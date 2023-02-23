public class Calculadora{
    public int somar(int n){
        int resultado = 0;
        for(int i = 1; i <= n; i++){
            resultado += i;
        }
        return resultado;
    }
}