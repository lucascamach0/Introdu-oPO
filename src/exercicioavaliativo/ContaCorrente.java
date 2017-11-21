package exercicioavaliativo;

public class ContaCorrente {
	
	//propriedades da conta
	private String cpf;
	private Double valorContaCorrete;
	
	
	//construtor
	public ContaCorrente(String cpf, Double valorContaCorrete) {
		super();
		this.cpf = cpf;
		this.valorContaCorrete = valorContaCorrete;
	}
	
	//get and sets
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Double getValorContaCorrete() {
		return valorContaCorrete;
	}
	public void setValorContaCorrete(Double valorContaCorrete) {
		this.valorContaCorrete = valorContaCorrete;
	}
	
	
	//metodo de sacar
	public void sacar(Double valorSaque){
		//aplicação da taxa no valor do saque
		Double valor = valorSaque + (valorSaque*0.05);
		
		if(this.valorContaCorrete < valor){
			System.out.println("Saldo negativo");
		}
		else{
			this.valorContaCorrete = this.valorContaCorrete - valor ;
		}
		
	}
	
	//metodo de deposito
	public void depositar(Double valorDeposito){
		this.valorContaCorrete = this.valorContaCorrete + valorDeposito;
	}
	
	//metodo de saldo
	public void realizarSaldo(){
		System.out.println("Seu saldo é: " + this.valorContaCorrete);
	}
	

}
