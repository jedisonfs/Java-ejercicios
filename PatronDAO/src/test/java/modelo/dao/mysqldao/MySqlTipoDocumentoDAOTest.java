package modelo.dao.mysqldao;

import modelo.dao.TipoDocumentoDAO;
import modelo.dto.TipoDocumentoDTO;
import modelo.factory.TipoDocumentoDAOFactory;
import modelo.factory.mysqlfactory.MySqlTipoDocumentoDAOFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySqlTipoDocumentoDAOTest {

    @Test
    void insert() {
        TipoDocumentoDTO tipoDocumentoDTO = new TipoDocumentoDTO();
        tipoDocumentoDTO.setInitial("LM");
        tipoDocumentoDTO.setDocumentName("Libreta militar");
        tipoDocumentoDTO.setTypeDocumentState("1");

        TipoDocumentoDAOFactory fabrica = new MySqlTipoDocumentoDAOFactory();
        TipoDocumentoDAO daoTipoDocumento = fabrica.create();
        assertEquals(daoTipoDocumento.insert(tipoDocumentoDTO),1);
    }

    @Test
    void update() {
        TipoDocumentoDTO tipoDocumentoDTO = new TipoDocumentoDTO();
        tipoDocumentoDTO.setInitial("L.M");

        TipoDocumentoDAOFactory fabrica = new MySqlTipoDocumentoDAOFactory();
        TipoDocumentoDAO daoTipoDocumento = fabrica.create();
        assertEquals(daoTipoDocumento.update(tipoDocumentoDTO,"18"),1);
    }

    @Test
    void delete() {
        TipoDocumentoDAOFactory fabrica = new MySqlTipoDocumentoDAOFactory();
        TipoDocumentoDAO daoTipoDocumento = fabrica.create();
        assertEquals(daoTipoDocumento.delete("18"),1);
    }

    @Test
    void findByAll() {
        TipoDocumentoDAOFactory fabrica = new MySqlTipoDocumentoDAOFactory();
        TipoDocumentoDAO daoTipoDocumento = fabrica.create();
        assertFalse(daoTipoDocumento.findByAll().isEmpty());
    }

    @Test
    void findByPk() {
        TipoDocumentoDAOFactory fabrica = new MySqlTipoDocumentoDAOFactory();
        TipoDocumentoDAO daoTipoDocumento = fabrica.create();
        assertNotEquals(daoTipoDocumento.findByPk("1"),null);
    }
}