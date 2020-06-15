package campodebatalha;

public class Pantano  extends Terreno{

	public Pantano (int id, String terreno) {
		super("Pantano");
		try {
			setTerreno(terreno);
			
		} catch (Exception e) {
			System.out.println(e.getMessage()+ "\nTerreno nao pode ser criado");
		}
	}
	public String exibirTerreno() {
		// TODO Auto-generated method stub
		return "Terreno: "+ this.getTerreno();
	}
}
