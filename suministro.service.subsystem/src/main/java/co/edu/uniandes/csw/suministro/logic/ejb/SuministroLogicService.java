
package co.edu.uniandes.csw.suministro.logic.ejb;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless; 
import javax.inject.Inject;

import javax.enterprise.inject.Default;

import co.edu.uniandes.csw.suministro.logic.api.ISuministroLogicService;
import co.edu.uniandes.csw.suministro.logic.dto.SuministroDTO;
import java.util.Calendar;

@Default
@Stateless
@LocalBean
public class SuministroLogicService extends _SuministroLogicService implements ISuministroLogicService {

    public boolean isAboutToExpire(SuministroDTO suministro) {
         Calendar d = Calendar.getInstance();
        
        d.add(Calendar.DAY_OF_MONTH, 7);
        
        Calendar exp = suministro.getExpiration();
        return exp.equals(d)||exp.before(d);
    }

}