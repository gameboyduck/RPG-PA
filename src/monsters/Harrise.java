package monsters;

public class Harrise extends Monster{
	
	public Harrise(int id, float defesa, float ataque, int energia, String terreno) {
		super("Harrise");
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

	@Override
	public String exibirInfo() {
		
		return "Classe: "+this.getClasse()
                + "\nDefesa: "+this.getDefesa()
                + "\nAtaque: "+ this.getAtaque()
                + "\nEnergia: "+ this.getEnergia()
                + "\nTerreno: "+this.getTerreno();
	}
}
