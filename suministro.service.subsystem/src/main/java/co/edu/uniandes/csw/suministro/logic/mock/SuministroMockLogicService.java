
package co.edu.uniandes.csw.suministro.logic.mock;
import javax.enterprise.inject.Alternative;
import javax.inject.Singleton;

import co.edu.uniandes.csw.suministro.logic.api.ISuministroLogicService;
import co.edu.uniandes.csw.suministro.logic.dto.SuministroDTO;

@Alternative
@Singleton
public class SuministroMockLogicService extends _SuministroMockLogicService implements ISuministroLogicService {

    public boolean isAboutToExpire(SuministroDTO suministro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}