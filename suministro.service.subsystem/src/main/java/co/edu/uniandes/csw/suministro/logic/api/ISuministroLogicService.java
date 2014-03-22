
package co.edu.uniandes.csw.suministro.logic.api;

import co.edu.uniandes.csw.suministro.logic.dto.SuministroDTO;

public interface ISuministroLogicService extends _ISuministroLogicService {
    
          /**
     * This method evaluates if the product is near of its expiration data.
     * @param suministro The product about to avaliate.
     * @return true if the product is about to expire. False if not.
     */
    public boolean isAboutToExpire(SuministroDTO suministro);

}