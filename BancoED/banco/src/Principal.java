import java.util.Scanner;
public class Principal {
	
	public static void main(String[] args) {
		int capacidade;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Qual a capacidade do vetor? ");
		capacidade =input.nextInt();	
		input.nextLine();
		CadastrarConta addConta = new CadastrarConta(capacidade);
		
		Conta conta1 = new Conta();
		conta1.setNome("Mylle");
		conta1.setValor(800);

		Conta conta2 = new Conta();
		conta2.setNome("Luluzinha");
		conta2.setValor(900);

		Conta conta3 = new Conta();
		conta3.setNome("Sebastião");
		conta3.setValor(1000);
		
		addConta.adicionarConta(conta1);
		addConta.adicionarConta(conta2);
		addConta.adicionarConta(conta3);

		addConta.listarConta();
		
		Conta cont1 = new Conta();
		System.out.print("Digite o nome da conta e receba os respectivos dados: ");
		cont1.setNome(input.nextLine());
		addConta.procurarConta(cont1.getNome());
	
		Conta novaConta = new Conta();
		System.out.println("\nCadastre uma nova conta!");
		System.out.print("Insira o nome: ");
		novaConta.setNome(input.nextLine());
		System.out.print("Insira o valor: ");
		novaConta.setValor(input.nextDouble());
		
		System.out.print("Qual posição do vetor deseja que essa conta ocupe? ");
		int i = input.nextInt();
		addConta.definirPosicao(novaConta, i);

		System.out.println("\nAtualização de listagem:");
		addConta.listarConta();
		input.close();
    }

}
