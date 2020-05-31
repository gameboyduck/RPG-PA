package factorymonsters;

import monsters.*;

public class NecrofalosFactory extends MonsterFactory {

	@Override
	public Monster getMonster(int id) {
	
        if(id == 3)
      			 return new Ghouls(3, 130f, 400f, 500, "Cemitérios ");
    		
        if(id == 4)
                return new Necrosos(4, 50f, 500f, 500, "Arredores dos campos de batalha");

       if(id == 5)
                return new Nevolosos(5, 100f, 300f, 500, "Pantanos, florestas ou montanhas");
    		return null;

      		}

}
