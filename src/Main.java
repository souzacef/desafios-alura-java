import java.util.ArrayList;
import br.com.alura.desafios.Arrays.Pessoa;
import br.com.alura.desafios.desafio01.Person;
import br.com.alura.desafios.desafio01.Calculadora;
import br.com.alura.desafios.desafio01.Carro;
import br.com.alura.desafios.desafio01.Aluno;
import br.com.alura.desafios.desafio02.ContaBancaria;
import br.com.alura.desafios.desafio02.IdadePessoa;
import br.com.alura.desafios.desafio02.Produto;
import br.com.alura.desafios.desafio02.Student;
import br.com.alura.desafios.desafio02.Livro;
import br.com.alura.desafios.desafio03.Gato;
import br.com.alura.desafios.desafio03.ModeloCarro;
import br.com.alura.desafios.desafio03.Cachorro;
import br.com.alura.desafios.desafio03.ContaCorrente;
import br.com.alura.desafios.desafio04.ConversorMoeda;
import br.com.alura.desafios.desafio04.CalculadoraSalaRetangular;
import br.com.alura.desafios.desafio04.TabuadaMultiplicacao;
import br.com.alura.desafios.desafio04.ConversorTemperaturaPadrao;


public class Main {
    public static void main(String[] args) {

        Person person = new Person();
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

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNumeroConta(123);
        contaBancaria.setSaldo(5000);
        contaBancaria.titular = "James";
        System.out.println("Número da conta: " + contaBancaria.getNumeroConta());
        System.out.println("Saldo: R$" + contaBancaria.getSaldo());
        System.out.println("Titular: " + contaBancaria.titular + "\n");

        contaBancaria.setSaldo(contaBancaria.getSaldo() + 1500);
        System.out.println("Novo saldo: R$" + contaBancaria.getSaldo() + "\n");

        IdadePessoa idade1 = new IdadePessoa();
        IdadePessoa idade2 = new IdadePessoa();

        idade1.setNome("João");
        idade1.setIdade(68);
        System.out.println(idade1.getNome() + " tem " + idade1.getIdade() + " anos");
        idade1.verificaIdade();

        idade2.setNome("José");
        idade2.setIdade(8);
        System.out.println(idade2.getNome() + " tem " + idade2.getIdade() + " anos");
        idade2.verificaIdade();

        Produto produto = new Produto("Celular", 2000.0);
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco() + "\n");
        produto.aplicarDesconto(12);
        System.out.println("Preço com desconto: R$ " + produto.getPreco() + "\n");

        Student aluno1 = new Student("Ludwig", 9.9, 9.8, 9.9);
        Student aluno2 = new Student("Wolfgang",9.9, 10, 10);

        System.out.println("Aluno 1");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Média: " + aluno1.calculaMedia() + "\n");

        System.out.println("Aluno 2");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.println("Média: " + aluno2.calculaMedia() + "\n");

        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        livro1.setTitulo("Capitães da Areia");
        livro1.setAutor("Jorge Amado");
        livro1.exibeDetalhe();

        livro2.setTitulo("Anjos e Demônios");
        livro2.setAutor("Dan Brown");
        livro2.exibeDetalhe();

        ModeloCarro modeloCarro = new ModeloCarro();
        modeloCarro.definirModelo("Azera");
        modeloCarro.defineCor("Preto");
        modeloCarro.definirPreco(45000, 44000, 43000);
        modeloCarro.exibirInfo();

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSomDeAnimal();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSomDeAnimal();
        gato.arranharMoveis();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.consultaSaldo();
        contaCorrente.depositar(1500);
        contaCorrente.sacar(3000);
        contaCorrente.cobrarTarifaMensal();

        ConversorMoeda conversor = new ConversorMoeda();
        conversor.converterDolarParaReal(87.79);

        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();
        calculadoraSalaRetangular.calcularArea(15.9, 5.3);
        calculadoraSalaRetangular.calcularPerimetro(2.3, 6.9, 4.7, 5.1);

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(9);
        System.out.println();

        ConversorTemperaturaPadrao conversorTemp = new ConversorTemperaturaPadrao();
        conversorTemp.celsiusParaFahrenheit(25);
        conversorTemp.fahrenheitParaCelsius(86);


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

        System.out.println();






    }
}
