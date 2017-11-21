package exercicioavaliativo;

public class Data {
	
	//propriedades da data
	private int ano;
	private int mes;
	private int dia;
	
	//construtor
	public Data(int dia, int mes, int ano) {
		super();
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
	}
	
	//get and sets com validação de numeros para a data
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		if(ano <= 0 || ano >= 2020 ){
			System.out.println("Ano invalido");
		}
		else{
			this.ano = ano;	
		}
		
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		if(mes <= 0 || mes > 12){
			System.out.println("Mês invalido");
		}
		else{
			this.mes = mes;
		}	
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		if(dia <= 0 || dia > 31){
			System.out.println("Dia invalido");
		}else{
			this.dia = dia;
		}
		
	}
	
	
	//metodo para mostrar data
	public void displayData(){
		System.out.println("Data: " + this.dia + "/" + this.mes + "/" + this.ano);
	}
	
	
	
}
