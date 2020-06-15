package factorycampodebatalha;

import campodebatalha.*;
import factorycampodebatalha.*;


public class ConstrutorTerreno extends  TerrenoFactory{
	
public Terreno getCampo(int id){
		
		if(id == 0)
            return new Campo(1, "Campo");
		if(id == 1)
            return new Floresta(2, "Floresta");
        if(id == 3)
            return new Pantano(3, "Pantano");
		if(id == 4)
            return new Subterraneo(4 ,"Subterraneo");
		 return null;
		}
	
}
