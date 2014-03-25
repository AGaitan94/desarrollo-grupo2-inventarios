
package co.edu.uniandes.csw.materiaprima.logic.ejb;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless; 
import javax.inject.Inject;

import javax.enterprise.inject.Default;

import co.edu.uniandes.csw.materiaprima.logic.api.IMateriaPrimaLogicService;
import co.edu.uniandes.csw.materiaprima.logic.dto.MateriaPrimaDTO;
import java.util.Calendar;

@Default
@Stateless
@LocalBean
public class MateriaPrimaLogicService extends _MateriaPrimaLogicService implements IMateriaPrimaLogicService {

    public boolean isAboutToExpire(MateriaPrimaDTO materiaprima) {
        
        Calendar d = Calendar.getInstance();
        
        d.add(Calendar.DAY_OF_MONTH, 7);
        
        Calendar exp = materiaprima.getExpiration();
        return exp.equals(d)||exp.before(d);
        
    }

}