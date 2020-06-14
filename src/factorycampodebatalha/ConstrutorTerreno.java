package factorycampodebatalha;

import campodebatalha.*;


public class ConstrutorTerreno extends  TerrenoFactory{
	
public Terreno getTerreno(int id){
		
		if(id ==0)
            return new Campo("Campo");
		
		if(id ==1)
            return new Floresta("Floresta");
        if(id == 3)
            return new Pantano("Pantano");

		if(id ==4)
            return new Subterraneo("Subterraneo");
		 return null;
		}
	
}
