public class Gerente extends Funcionario{
	
	public double getBonus(){ //O metodo get Bonus eh "abstract" e veio da classe pai funcionario, e eh obrigatorio overrides
		                      //Sobre overriding o metodo getbonus() orignal da classe Funcionario
		return this.salario * 0.3;
		
				
	}//getBonus
	
	

}//Gerente
