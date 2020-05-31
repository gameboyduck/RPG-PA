package factorymonsters;

import monsters.*;

public abstract class MonsterFactory {
	 public static MonsterFactory getInstance(int id){
	        switch(id) {
	        case 0:
	            return new ConstrutorFactory();
	        case 1:
	            return new ConstrutorFactory();
	        case 2:
	            return new ConstrutorFactory();
	        /*------------------------------------------------------------*/
	        case 3:
	        	return new NecrofalosFactory();
	        case 4:
	        	return new NecrofalosFactory();
	        case 5:
	        	return new NecrofalosFactory();
	        /*-------------------------------------------------------------*/
	        case 6:
	        	return new RelictiosFactory();
	        case 7:
	        	return new RelictiosFactory();
	        case 8:
	        	return new RelictiosFactory();
		        
	        /*--------------------------------------------------------------*/
	        case 9:
	        	return new InsectoideFactory();
	        case 10:
	        	return new InsectoideFactory();
	        case 11:
	        	return new InsectoideFactory();
	        	default: return null;
	        }
	 }
	 public abstract Monster getMonster (int id)throws Exception;
}
