/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniandes.csw.producto.master.persistence.entity;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class ProductoItemEntityId implements Serializable {
    private Long productoId;
    private Long itemId;

    @Override
    public int hashCode() {
        return (int) (productoId + itemId);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof ProductoItemEntityId) {
            ProductoItemEntityId otherId = (ProductoItemEntityId) object;
            return (otherId.productoId == this.productoId) && (otherId.itemId == this.itemId);
        }
        return false;
    }

}
