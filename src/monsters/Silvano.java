package monsters;

public class Silvano extends Monster {

	public Silvano(int id, float defesa, float ataque, int energia, String terreno) {
		super("Silvano");
		// TODO Auto-generated constructor stub

		try {
			setDefesa(defesa);
			setAtaque(ataque);
			setEnergia(energia);
			setTerreno(terreno);
			
		} catch (Exception e) {
			System.out.println(e.getMessage()+ "\nMonstro não pode ser criado");
		}
	}

	public String exibirInfo() {
		
		return"Classe: "+this.getClasse()
        + "\nDefesa: "+this.getDefesa()
        + "\nAtaque: "+ this.getAtaque()
        + "\nEnergia: "+ this.getEnergia()
        + "\nTerreno: "+this.getTerreno();
	}
}
