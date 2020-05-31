package factorymonsters;

import monsters.*;

public class InsectoideFactory extends MonsterFactory {

	@Override
	public Monster getMonster(int id) {
		
		if(id ==9)
            return new Kikimora(9, 120f, 5f, 500, "Florestas, Pantanos e Lugares subterraneos");
		
		if(id ==10)
            return new Harrise(10, 90f, 5f, 500, "Floresta de Novigrad");
        
		if(id ==11)
            return new Aracnos(11, 80f, 540f, 500, "Floresta de Novigrad");
		
		return null;

			}
		
	
}
