package campodebatalha;

public class Floresta  extends Terreno{

	public Floresta (int id, String terreno) {
		super("Floresta");
		try {
			setTerreno(terreno);
			
		} catch (Exception e) {
			System.out.println(e.getMessage()+ "\nTerreno nao pode ser criado");
		}
		
	}

	@Override
	public String exibirTerreno() {
		// TODO Auto-generated method stub
		return "Terreno: "+ this.getTerreno();
	}
}
