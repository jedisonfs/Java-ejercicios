package modelo.dao;

import modelo.dto.TipoDocumentoDTO;

import java.util.Collection;

public interface TipoDocumentoDAO {

     public int insert(TipoDocumentoDTO tipoDocumentoDTO);
     public int update(TipoDocumentoDTO tipoDocumentoDTO,String primaryKey);
     public int delete(String primaryKey);
     public Collection<TipoDocumentoDTO> findByAll();
     public TipoDocumentoDTO findByPk(String primaryKey);
}
