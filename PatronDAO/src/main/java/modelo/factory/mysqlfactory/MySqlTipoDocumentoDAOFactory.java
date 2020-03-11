package modelo.factory.mysqlfactory;

import modelo.dao.TipoDocumentoDAO;
import modelo.dao.mysqldao.MySqlTipoDocumentoDAO;
import modelo.factory.TipoDocumentoDAOFactory;

public class MySqlTipoDocumentoDAOFactory implements TipoDocumentoDAOFactory {
    @Override
    public TipoDocumentoDAO create() {
        return new MySqlTipoDocumentoDAO();
    }
}
