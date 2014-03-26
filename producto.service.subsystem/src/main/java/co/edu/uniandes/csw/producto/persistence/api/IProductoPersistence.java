
package co.edu.uniandes.csw.producto.persistence.api;

import co.edu.uniandes.csw.producto.logic.dto.ProductoDTO;

public interface IProductoPersistence extends _IProductoPersistence {
    
    public boolean isAboutToExpire(ProductoDTO producto);
    
    public boolean reachedMinCap(ProductoDTO producto);

}