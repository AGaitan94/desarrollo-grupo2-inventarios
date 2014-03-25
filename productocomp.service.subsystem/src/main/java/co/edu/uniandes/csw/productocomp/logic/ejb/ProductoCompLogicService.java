
package co.edu.uniandes.csw.productocomp.logic.ejb;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless; 
import javax.inject.Inject;

import javax.enterprise.inject.Default;

import co.edu.uniandes.csw.productocomp.logic.api.IProductoCompLogicService;
import co.edu.uniandes.csw.productocomp.logic.dto.ProductoCompDTO;
import java.util.Calendar;

@Default
@Stateless
@LocalBean
public class ProductoCompLogicService extends _ProductoCompLogicService implements IProductoCompLogicService {

    public boolean isAboutToExpire(ProductoCompDTO productocomp) {
        Calendar d = Calendar.getInstance();
        
        d.add(Calendar.DAY_OF_MONTH, 7);
        
        Calendar exp = productocomp.getExpiration();
        return exp.equals(d)||exp.before(d);
    }

}