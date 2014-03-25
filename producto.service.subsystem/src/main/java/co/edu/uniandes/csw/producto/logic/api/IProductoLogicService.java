
package co.edu.uniandes.csw.producto.logic.api;

import co.edu.uniandes.csw.producto.logic.dto.ProductoDTO;

public interface IProductoLogicService extends _IProductoLogicService {
    
          /**
     * This method evaluates if the product is near of its expiration data.
     * @param producto The product about to avaliate.
     * @return true if the product is about to expire. False if not.
     */
    public boolean isAboutToExpire(ProductoDTO producto);

}