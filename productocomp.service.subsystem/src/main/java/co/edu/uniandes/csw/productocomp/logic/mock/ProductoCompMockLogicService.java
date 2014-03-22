
package co.edu.uniandes.csw.productocomp.logic.mock;
import javax.enterprise.inject.Alternative;
import javax.inject.Singleton;

import co.edu.uniandes.csw.productocomp.logic.api.IProductoCompLogicService;
import co.edu.uniandes.csw.productocomp.logic.dto.ProductoCompDTO;

@Alternative
@Singleton
public class ProductoCompMockLogicService extends _ProductoCompMockLogicService implements IProductoCompLogicService {

    public boolean isAboutToExpire(ProductoCompDTO productocomp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}