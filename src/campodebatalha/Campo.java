package campodebatalha;

public class Campo extends Terreno {
	
	public Campo (String terreno) {
		super("Campo");
		try {
			setTerreno(terreno);
			
		} catch (Exception e) {
			System.out.println(e.getMessage()+ "\nMonstro n�o pode ser criado");
		}
		
		public String exibirInfo() {
			
			return "Terreno: "+this.getTerreno();
		}
	}
}
