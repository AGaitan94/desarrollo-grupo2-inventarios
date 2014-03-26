
package co.edu.uniandes.csw.producto.persistence;

import co.edu.uniandes.csw.producto.logic.dto.ProductoDTO;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import co.edu.uniandes.csw.producto.persistence.api.IProductoPersistence;
import javax.ejb.LocalBean;

@Default
@Stateless 
@LocalBean
public class ProductoPersistence extends _ProductoPersistence  implements IProductoPersistence {
    
       public boolean isAboutToExpire(ProductoDTO producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        //yet to solve. by Jessie
    }

    public boolean reachedMinCap(ProductoDTO producto) 
    {
        return producto.getCantidadDisp() <= producto.getCantidadMin();
    }

}