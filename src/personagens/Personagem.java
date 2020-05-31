package personagens;

import componentesdopersonagem.Equipamento;
import componentesdopersonagem.Sinal;

public class Personagem {

	private Tipo tipo;
	private String sexo;
	private String origem;
	private Equipamento equipamento;
	private Sinal sinal;
	
	public Personagem(Tipo tipo, String sexo, String origem, Equipamento equipamento, Sinal sinal) {
		super();
		this.tipo = tipo;
		this.sexo = sexo;
		this.origem = origem;
		this.equipamento = equipamento;
		this.sinal = sinal;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}

	public Sinal getSinal() {
		return sinal;
	}

	public void setSinal(Sinal sinal) {
		this.sinal = sinal;
	}
	
	
}
