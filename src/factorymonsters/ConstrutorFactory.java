package factorymonsters;

import monsters.*;


public class ConstrutorFactory extends MonsterFactory {

	public Monster getMonster(int id){
		
		if(id ==0)
            return new Djinn(0, 150f, 500f, 500, "Território do Ar");
		
		if(id ==1)
            return new Golens(1, 150f, 300f, 600, "Territorio desconhecido");
        
		if(id ==2)
            return new Gargulas(2, 50f, 250f, 700, "Territorio desconhecido");
		 return null;
		}
	

}
