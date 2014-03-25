
package co.edu.uniandes.csw.productocomp.logic.api;

import co.edu.uniandes.csw.productocomp.logic.dto.ProductoCompDTO;

public interface IProductoCompLogicService extends _IProductoCompLogicService {
    
          /**
     * This method evaluates if the product is near of its expiration data.
     * @param producto The product about to avaliate.
     * @return true if the product is about to expire. False if not.
     */
    public boolean isAboutToExpire(ProductoCompDTO productocomp);

}