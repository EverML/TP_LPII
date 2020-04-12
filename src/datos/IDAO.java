
package datos;

import java.util.List;

public interface IDAO {
    
    
    public List<?> listar( String condicion );
    public void insertar ( Object obj );
    public void modificar ( Object obj );
    public void eliminar ( Object obj );
    
    
    
}
