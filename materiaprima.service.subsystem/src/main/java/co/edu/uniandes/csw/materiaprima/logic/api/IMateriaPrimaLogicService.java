
package co.edu.uniandes.csw.materiaprima.logic.api;

import co.edu.uniandes.csw.materiaprima.logic.dto.MateriaPrimaDTO;

public interface IMateriaPrimaLogicService extends _IMateriaPrimaLogicService {
    
          /**
     * This method evaluates if the product is near of its expiration data.
     * @param producto The product about to avaliate.
     * @return true if the product is about to expire. False if not.
     */
    public boolean isAboutToExpire(MateriaPrimaDTO materiaprima);

}