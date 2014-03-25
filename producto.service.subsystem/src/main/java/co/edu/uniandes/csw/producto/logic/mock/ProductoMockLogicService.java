
package co.edu.uniandes.csw.producto.logic.mock;
import javax.enterprise.inject.Alternative;
import javax.inject.Singleton;

import co.edu.uniandes.csw.producto.logic.api.IProductoLogicService;
import co.edu.uniandes.csw.producto.logic.dto.ProductoDTO;
import java.util.Calendar;

@Alternative
@Singleton
public class ProductoMockLogicService extends _ProductoMockLogicService implements IProductoLogicService {
    
         /**
     * This method evaluates if the product is near of its expiration data.
     * @param producto The product about to avaliate.
     * @return true if the product is about to expire. False if not.
     */
    public boolean isAboutToExpire(ProductoDTO producto)
    {
      ProductoDTO pr = getProducto (producto.getId()); 
      if (pr!=null)
      {
          Calendar d = Calendar.getInstance();
        
        d.add(Calendar.DAY_OF_MONTH, 7);
        
        Calendar exp = pr.getExpiration();
          return exp.equals(d)||exp.before(d); 
      }
      else
          return false;
    }
	
}