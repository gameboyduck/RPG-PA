package factorycampodebatalha;

import campodebatalha.Terreno;
import factorycampodebatalha.ConstrutorTerreno;

public abstract class TerrenoFactory {
	
	
	public TerrenoFactory getCampo (int id) {
	
		switch(id) {
        case 0:
            return new ConstrutorTerreno();
        case 1:
            return new ConstrutorTerreno();
        case 2:
            return new ConstrutorTerreno();
        case 3:
        	return new ConstrutorTerreno();
		}
		return null;
	}
}
