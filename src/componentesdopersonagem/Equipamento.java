package componentesdopersonagem;

import personagens.Tipo;

public class Equipamento {
	
	
		private Tipo tipo;
		private String nome;
		private int ataque;
		private int defesa;
		private Sinal sinal;
		
		public Equipamento(Tipo tipo, String nome, int ataque, int defesa, Sinal sinal)
		{
			super();
			this.tipo = tipo;
			this.nome = nome;
			this.ataque = ataque;
			this.defesa = defesa;
			this.sinal = sinal;
		}
		
		public Tipo getTipo() {
			return tipo;
		}

		public void setTipo(Tipo tipo) {
			this.tipo = tipo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getAtaque() {
			return ataque;
		}

		public void setAtaque(int ataque) {
			this.ataque = ataque;
		}
		public int getDefesa() {
			return defesa;
		}

		public void setDefesa(int defesa) {
			this.defesa = defesa;
		}

		public Sinal getSinal() {
			return sinal;
		}

		public void setSinal(Sinal sinal) {
			this.sinal = sinal;
		}
}
