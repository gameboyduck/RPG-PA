package builders;


import componentesdopersonagem.Equipamento;
import componentesdopersonagem.Sinal;
import personagens.Tipo;

public interface Builder {
	void setTipo(Tipo tipo);
	void setSexo(String sexo);
	void setOrigem(String origem);
	void setEquipamento(Equipamento equipamento);
	void setSinal(Sinal sinal);
}
