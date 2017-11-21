package exercicioavaliativo;

public class ContaCorrenteEspecial extends ContaCorrente {

	//herança com a classe pai
	public ContaCorrenteEspecial(String cpf, Double valorContaCorrete) {
		super(cpf, valorContaCorrete);
		
	}
	
	//override do metodo sacar, porém colocando a taxa para cliente especial
	public void sacar(Double valorSaque) {
		 Double valor = valorSaque + (valorSaque*0.01);
			
			if(super.getValorContaCorrete() < valor){
				System.out.println("Saldo negativo");
			}
			else{
				super.setValorContaCorrete(super.getValorContaCorrete() - valor) ;
			}
			
	}

}
