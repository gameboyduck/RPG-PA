package campodebatalha;

public class Subterraneo  extends Terreno{
	
	public Subterraneo (String terreno) {
		super("Subterraneo");
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
