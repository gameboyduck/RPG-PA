package aplicacao;

import java.util.Random;

import factorymonsters.MonsterFactory;
import monsters.Monster;

public class Core {

	public static void main(String[] args) throws Exception {
		
		Random gerar = new Random();
		
		System.out.println("\n\n###### Fábrica de Famílias de Monstros ######"
				+"\n\n####Gerando 25 monstros aleatórios###\n\n");
		
		
		for(int i=0; i<25; i++) {
			
		int criatura = gerar.nextInt(12);
		MonsterFactory fabrica = MonsterFactory.getInstance(criatura);
		Monster monstros = fabrica.getMonster(criatura);
		
		System.out.println(monstros.exibirInfo()+"\n");		
		
		}        
	}
}