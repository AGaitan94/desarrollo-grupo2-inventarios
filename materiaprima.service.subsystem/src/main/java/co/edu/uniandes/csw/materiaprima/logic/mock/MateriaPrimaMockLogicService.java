
package co.edu.uniandes.csw.materiaprima.logic.mock;
import javax.enterprise.inject.Alternative;
import javax.inject.Singleton;

import co.edu.uniandes.csw.materiaprima.logic.api.IMateriaPrimaLogicService;
import co.edu.uniandes.csw.materiaprima.logic.dto.MateriaPrimaDTO;

@Alternative
@Singleton
public class MateriaPrimaMockLogicService extends _MateriaPrimaMockLogicService implements IMateriaPrimaLogicService {

    public boolean isAboutToExpire(MateriaPrimaDTO materiaprima) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}