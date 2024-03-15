public class CadastrarConta {

    private  Conta[] contas;
	private int totalContas;
	
	public CadastrarConta(int capacidade) {
		contas = new Conta[capacidade];
		totalContas = 0;
	}
	
	public void adicionarConta(Conta addConta) {
		if(totalContas<contas.length) {
			
			contas[totalContas]=addConta;
			totalContas++;
		}else {
			System.out.println("O vetor atingiu a capacidade máxima!");
		}
	}
	
	public void listarConta() {
		for(int i=0; i<totalContas;i++) {
			System.out.println(contas[i]);
		}
	}
	
	public Conta procurarConta(String nome) {
		for(int i=0; i<totalContas;i++) {
			if(nome.equals(contas[i].getNome())) {
				System.out.println(contas[i]);
				return contas[i];
			}
		}
		System.out.println("Esse nome não está relacionado a nanhum cadastro!");
		return null;
	}
	
	public void definirPosicao(Conta conta, int posicao) {
	    if (posicao >= 0 && posicao <= totalContas && totalContas < contas.length) {
	       
	        for (int i = totalContas; i > posicao; i--) {
	            contas[i] = contas[i - 1];
	        }
	        contas[posicao] = conta;
	        totalContas++;
            System.out.println("Alteração feita!");
	    } else {
	        System.out.println("Não foi possível adicionar a conta! (Posição inválida ou vetor cheio)" + posicao + ".");
	    }
	}
}
