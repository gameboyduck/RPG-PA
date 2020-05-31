package builders;


import componentesdopersonagem.Equipamento;
import componentesdopersonagem.Sinal;
import personagens.Personagem;
import personagens.Tipo;

public class PersonagemBuilder implements Builder {

	private Tipo tipo;
	private String sexo;
	private String origem;
	private Equipamento equipamento;
	private Sinal sinal;

	@Override
	public void setTipo(Tipo tipo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setSexo(String sexo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setOrigem(String origem) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setEquipamento(Equipamento equipamento) {
		// TODO Auto-generated method stub
		
	}
	public void setSinal(Sinal sinal) {
		// TODO Auto-generated method stub
		
	}
	
	public Personagem getResult() {
		return new Personagem(tipo, sexo, origem, equipamento, sinal);
	}


	
}
