import java.util.ArrayList;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado e1 = new Empregado();
        Empregado e2 = new Empregado();
        Empregado e3 = new Empregado();

        e1.setTipo(1);
        e2.setTipo(2);
        e2.setTipo(3);

        e1.setSalario(2000);
        e2.setSalario(1800);
        e2.setComissao(0.1);
        e3.setSalario(1700);
        e3.setBonus(400);

        var empregados = new ArrayList<Empregado>();
        empregados.add(e1);
        empregados.add(e2);
        empregados.add(e3);


        for (Empregado e : empregados){
            System.out.println(e.calcularSalario());
        }

        
        for(int i=0; i<empregados.size(); i++){
            System.out.println(empregados.get(i).calcularSalario());
        }


        //System.out.println("Tudo certo!");
    }
}
// git status -s (esse -s significa sortgh)
//java *.java

