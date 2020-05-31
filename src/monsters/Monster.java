package monsters;

public abstract class Monster {
	private String classe;
	private float defesa;
	private float ataque;
	private int energia;
	private String terreno;
	

	public Monster(String classe) {
		super();
		this.classe = classe;
	}
	public String getClasse() {
		return classe;
	}
	public float getDefesa() {
		return defesa;
	}
	public float getAtaque() {
		return ataque;
	}
	public int getEnergia() {
		return energia;
	}
	public String getTerreno() {
		return terreno;
	}
	
	public void setDefesa(float defesa) {
		this.defesa = defesa;
	}
	public void setAtaque(float ataque) {
		this.ataque = ataque;
	}
	public void setEnergia(int energia) throws Exception {
		if(energia>0){
            this.energia = energia;
        }else{
            throw new Exception("Energia não pode ser nula");
        }
	}
	public void setTerreno(String terreno) {
		this.terreno = terreno;
	}
	public abstract String exibirInfo();

}
