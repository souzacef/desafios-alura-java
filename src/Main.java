import java.util.ArrayList;
import br.com.alura.desafios.Arrays.Pessoa;
import br.com.alura.desafios.desafio01.Person;
import br.com.alura.desafios.desafio01.Calculadora;
import br.com.alura.desafios.desafio01.Carro;
import br.com.alura.desafios.desafio01.Aluno;


public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println();
        person.saudacao();

        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobraNumero(5);
        System.out.println("O resultado é: " + resultado + "\n");

        Carro carro = new Carro();
        carro.modelo = "Azera";
        carro.ano = 2011;
        carro.cor = "Preto";
        carro.fichaTecnica();
        System.out.println("Idade do carro: " + carro.calculaIdade() + " anos\n");

        Aluno aluno = new Aluno();
        aluno.idade = 61;
        aluno.nome = "Till";
        aluno.exibirInfo();


        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa("Freddie", 45);
        Pessoa pessoa2 = new Pessoa("Renato", 36);
        Pessoa pessoa3 = new Pessoa("André", 47);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("A lista contém " + listaDePessoas.size() + " pessoas");
        System.out.println("A primeira pessoa da lista é: " + listaDePessoas.get(0) + "\n");
        System.out.println("Lista de pessoas: ");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }



    }
}
