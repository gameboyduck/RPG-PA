package personagens;

import componentesdopersonagem.Equipamento;
import componentesdopersonagem.Sinal;

public class Manual {
	
	private Tipo tipo;
	private String sexo;
	private String origem;
	private Equipamento equipamento;
	private Sinal sinal;
	
	
	public Manual(Tipo tipo, String sexo, String origem, Equipamento equipamento, Sinal sinal) {
		super();
		this.tipo = tipo;
		this.sexo = sexo;
		this.origem = origem;
		this.equipamento = equipamento;
		this.sinal = sinal;
	}


	
	public String manualInfo() {
		return "Personagem do tipo: " + tipo + ", Sexo: " + sexo + ", Origem: " + origem + ", Equipado com: " + equipamento
				+ "Sinal: "+ sinal;
	}
	
	
}
