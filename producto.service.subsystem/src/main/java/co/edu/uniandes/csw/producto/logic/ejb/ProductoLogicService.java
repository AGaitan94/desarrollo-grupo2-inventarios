
package co.edu.uniandes.csw.producto.logic.ejb;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless; 
import javax.inject.Inject;

import javax.enterprise.inject.Default;

import co.edu.uniandes.csw.producto.logic.api.IProductoLogicService;
import co.edu.uniandes.csw.producto.logic.dto.ProductoDTO;
import java.util.Calendar;

@Default
@Stateless
@LocalBean
public class ProductoLogicService extends _ProductoLogicService implements IProductoLogicService {
    
    
      /**
     * This method evaluates if the product is near of its expiration data.
     * @param producto The product about to avaliate.
     * @return true if the product is about to expire. False if not.
     */    
    public boolean isAboutToExpire (ProductoDTO producto)
    {
        Calendar d = Calendar.getInstance();
        
        d.add(Calendar.DAY_OF_MONTH, 7);
        
        Calendar exp = producto.getExpiration();
        return exp.equals(d)||exp.before(d);
        
        
    }

}