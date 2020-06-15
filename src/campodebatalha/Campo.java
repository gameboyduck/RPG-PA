package campodebatalha;

public class Campo extends Terreno {
	
	public Campo (int id, String terreno) {
		super("Campo");
		
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
