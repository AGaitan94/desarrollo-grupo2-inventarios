package co.edu.uniandes.csw.producto.master.logic.dto;

import co.edu.uniandes.csw.documento.logic.dto.DocumentoDTO;
import co.edu.uniandes.csw.item.logic.dto.ItemDTO;
import co.edu.uniandes.csw.producto.logic.dto.ProductoDTO;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public abstract class _ProductoMasterDTO {

 
    protected ProductoDTO productoEntity;
    protected Long id;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public ProductoDTO getProductoEntity() {
        return productoEntity;
    }

    public void setProductoEntity(ProductoDTO productoEntity) {
        this.productoEntity = productoEntity;
    }
    
    public List<DocumentoDTO> createDocumento;
    public List<DocumentoDTO> updateDocumento;
    public List<DocumentoDTO> deleteDocumento;
    public List<DocumentoDTO> listDocumento;	
	
	
	
    public List<DocumentoDTO> getCreateDocumento(){ return createDocumento; };
    public void setCreateDocumento(List<DocumentoDTO> createDocumento){ this.createDocumento=createDocumento; };
    public List<DocumentoDTO> getUpdateDocumento(){ return updateDocumento; };
    public void setUpdateDocumento(List<DocumentoDTO> updateDocumento){ this.updateDocumento=updateDocumento; };
    public List<DocumentoDTO> getDeleteDocumento(){ return deleteDocumento; };
    public void setDeleteDocumento(List<DocumentoDTO> deleteDocumento){ this.deleteDocumento=deleteDocumento; };
    public List<DocumentoDTO> getListDocumento(){ return listDocumento; };
    public void setListDocumento(List<DocumentoDTO> listDocumento){ this.listDocumento=listDocumento; };	

    public List<ItemDTO> createItem;
    public List<ItemDTO> updateItem;
    public List<ItemDTO> deleteItem;
    public List<ItemDTO> listItem;
    public List<ItemDTO> getCreateItem() {
        return createItem;
    }

    public void setCreateItem(List<ItemDTO> createItem) {
        this.createItem = createItem;
    }

    public List<ItemDTO> getUpdateItem() {
        return updateItem;
    }

    public void setUpdateItem(List<ItemDTO> updateItem) {
        this.updateItem = updateItem;
    }

    public List<ItemDTO> getDeleteItem() {
        return deleteItem;
    }

    public void setDeleteItem(List<ItemDTO> deleteItem) {
        this.deleteItem = deleteItem;
    }

    public List<ItemDTO> getListItem() {
        return listItem;
    }

    public void setListItem(List<ItemDTO> listItem) {
        this.listItem = listItem;
    }
    
    
	
    
	
}

