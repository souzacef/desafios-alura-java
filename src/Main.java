import java.util.ArrayList;
import br.com.alura.desafios.Arrays.Pessoa;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa("Freddie", 45);
        Pessoa pessoa2 = new Pessoa("Renato", 36);
        Pessoa pessoa3 = new Pessoa("André", 47);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("A lista contém " + listaDePessoas.size() + " pessoas\n");
        System.out.println("A primeira pessoa da lista é: " + listaDePessoas.get(0) + "\n");
        System.out.println("Lista de pessoas");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
        System.out.println();


    }
}
