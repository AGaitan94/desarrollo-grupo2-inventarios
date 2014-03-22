
package co.edu.uniandes.csw.materiaprima.persistence;

import co.edu.uniandes.csw.materiaprima.logic.dto.MateriaPrimaDTO;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import co.edu.uniandes.csw.materiaprima.persistence.api.IMateriaPrimaPersistence;
import javax.ejb.LocalBean;

@Default
@Stateless 
@LocalBean
public class MateriaPrimaPersistence extends _MateriaPrimaPersistence  implements IMateriaPrimaPersistence {

    public boolean isAboutToExpire(MateriaPrimaDTO materiaprima) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}