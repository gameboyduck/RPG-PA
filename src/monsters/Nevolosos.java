package monsters;

public class Nevolosos extends Monster {

	public Nevolosos(int id, float defesa, float ataque, int energia, String terreno) {
		super("Nevolosos");
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

	@Override
	public String exibirInfo() {
		
		return "Classe: "+this.getClasse()
                + "\nDefesa: "+this.getDefesa()
                + "\nAtaque: "+ this.getAtaque()
                + "\nEnergia: "+ this.getEnergia()
                + "\nTerreno: "+this.getTerreno();
	}

}
