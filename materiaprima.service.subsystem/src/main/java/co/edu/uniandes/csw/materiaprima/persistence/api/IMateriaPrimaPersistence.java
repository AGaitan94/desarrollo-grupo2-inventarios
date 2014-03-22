
package co.edu.uniandes.csw.materiaprima.persistence.api;

import co.edu.uniandes.csw.materiaprima.logic.dto.MateriaPrimaDTO;

public interface IMateriaPrimaPersistence extends _IMateriaPrimaPersistence {
    
    public boolean isAboutToExpire(MateriaPrimaDTO materiaprima);

}