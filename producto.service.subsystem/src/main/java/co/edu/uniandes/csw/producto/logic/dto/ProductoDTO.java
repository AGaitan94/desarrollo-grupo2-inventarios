
package co.edu.uniandes.csw.producto.logic.dto;

import java.util.Calendar;

public class ProductoDTO extends _ProductoDTO {
    
    
    /**
     * Expiration data of the product.
     */
    private Calendar expiration;
    
    /**
     * Returns the expiration attribute of the product.
     * @return expiration. The attribute "expiration" of the product.
     */
    public Calendar getExpiration()
    {
        return expiration;
    }
    
    /**
     * Modifies the value of the expiration attribute of the product, for the one given by parameter.
     * @param expiration the value for change the expiration date.
     */
    public void setExpiration(Calendar expiration) {
	this.expiration = expiration;
    }

}