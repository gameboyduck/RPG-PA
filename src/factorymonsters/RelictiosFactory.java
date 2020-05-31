package factorymonsters;

import monsters.*;

public class RelictiosFactory extends MonsterFactory {

	@Override
	public Monster getMonster(int id) {
	
        if(id ==6)
  			return new Silvano(6, 50f, 345f, 500, "Perto de fazendas");
  		if(id ==7)
  			 return new Kernun(7, 50f, 355f, 500, "Floresta de Novigrad");
  		if(id ==8)
  			return new Dopplers(8, 50f, 455f, 500, "Floresta de Novigrad");
  			
		return null;

  		}
  			
    
	

}
