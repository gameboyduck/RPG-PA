package monsters;

public class Ghouls extends Monster {

	public Ghouls(int id, float defesa, float ataque, int energia, String terreno) {
		super("Ghouls");
		// TODO Auto-generated constructor stub

		try {
			setDefesa(defesa);
			setAtaque(ataque);
			setEnergia(energia);
			setTerreno(terreno);
			
		} catch (Exception e) {
			System.out.println(e.getMessage()+ "\nMonstro n�o pode ser criado");
		}
	}

	public String exibirInfo() {
		
		return "Classe: "+this.getClasse()
        + "\nDefesa: "+this.getDefesa()
        + "\nAtaque: "+ this.getAtaque()
        + "\nEnergia: "+ this.getEnergia()
        + "\nTerreno: "+this.getTerreno();
	}
	
}
