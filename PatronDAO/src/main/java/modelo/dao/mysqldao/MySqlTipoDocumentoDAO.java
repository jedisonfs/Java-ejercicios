package modelo.dao.mysqldao;

import modelo.dao.TipoDocumentoDAO;
import modelo.dao.util.ResourceManager;
import modelo.dto.TipoDocumentoDTO;
import modelo.factory.TipoDocumentoDAOFactory;
import modelo.factory.mysqlfactory.MySqlTipoDocumentoDAOFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

public class MySqlTipoDocumentoDAO implements TipoDocumentoDAO {

    private Connection conexion = null;
    private PreparedStatement sentencia = null;
    private ResultSet resultset = null;
    static final Logger logger = Logger.getLogger(MySqlTipoDocumentoDAO.class.getName());

    @Override
    public int insert(TipoDocumentoDTO tipoDocumentoDTO) {
        int resultado = 0;
        String sql = "INSERT INTO ProyectoMio.type_document (`initial`,`document_name`,`type_document_state`) VALUES (?,?,?)";

        try {
            conexion = ResourceManager.getConexion();
            sentencia = conexion.prepareStatement(sql);
            sentencia.setString(1, tipoDocumentoDTO.getInitial());
            sentencia.setString(2, tipoDocumentoDTO.getDocumentName());
            sentencia.setString(3, tipoDocumentoDTO.getTypeDocumentState());
            resultado = sentencia.executeUpdate();

        } catch (SQLException e) {
            logger.info(e.getMessage());
        } finally {
            ResourceManager.closeConexion(conexion);
            ResourceManager.closeSentencia(sentencia);
        }
        return resultado;
    }

    @Override
    public int update(TipoDocumentoDTO tipoDocumentoDTO, String primaryKey) {
        int resultado = 0;
        String sql = "UPDATE ProyectoMio.type_document SET initial = ? WHERE id = ?";
        try {
            conexion = ResourceManager.getConexion();
            sentencia = conexion.prepareStatement(sql);
            sentencia.setString(1, tipoDocumentoDTO.getInitial());
            sentencia.setString(2, primaryKey);
            resultado = sentencia.executeUpdate();

        } catch (SQLException e) {
            logger.info(e.getMessage());
        } finally {
            ResourceManager.closeConexion(conexion);
            ResourceManager.closeSentencia(sentencia);
        }
        return resultado;
    }

    @Override
    public int delete(String primaryKey) {
        int resultado = 0;
        String sql = "DELETE FROM  ProyectoMio.type_document WHERE id = ?";
        try {
            conexion = ResourceManager.getConexion();
            sentencia = conexion.prepareStatement(sql);
            sentencia.setString(1, primaryKey);
            resultado = sentencia.executeUpdate();

        } catch (SQLException e) {
            logger.info(e.getMessage());
        } finally {
            ResourceManager.closeConexion(conexion);
            ResourceManager.closeSentencia(sentencia);
        }
        return resultado;
    }

    @Override
    public Collection<TipoDocumentoDTO> findByAll() {

        String sql = "SELECT id,initial,document_name,type_document_state FROM ProyectoMio.type_document;";
        TipoDocumentoDTO tipoDocumentoDTO = new TipoDocumentoDTO();

        List<TipoDocumentoDTO> listaDTO = new ArrayList<TipoDocumentoDTO>();
        try {
            conexion = ResourceManager.getConexion();
            sentencia = conexion.prepareStatement(sql);
            resultset = sentencia.executeQuery();
            while (resultset.next()) {
                tipoDocumentoDTO.setInitial(resultset.getString("initial"));
                tipoDocumentoDTO.setDocumentName(resultset.getString("document_name"));
                tipoDocumentoDTO.setTypeDocumentState(resultset.getString("type_document_state"));
                listaDTO.add(tipoDocumentoDTO);
            }

        } catch (SQLException e) {
            logger.info(e.getMessage());
        } finally {
            ResourceManager.closeConexion(conexion);
            ResourceManager.closeSentencia(sentencia);
        }
        return listaDTO;
    }

    @Override
    public TipoDocumentoDTO findByPk(String primaryKey) {

        String sql = "SELECT id,initial,document_name,type_document_stateFROM ProyectoMio.type_document WHERE id = ? ;";
        TipoDocumentoDTO tipoDocumentoDTO = new TipoDocumentoDTO();

        try {
            conexion = ResourceManager.getConexion();
            sentencia = conexion.prepareStatement(sql);
            sentencia.setString(1, primaryKey);
            resultset = sentencia.executeQuery();

            while (resultset.next()) {
                tipoDocumentoDTO.setInitial(resultset.getString("initial"));
                tipoDocumentoDTO.setDocumentName(resultset.getString("document_name"));
                tipoDocumentoDTO.setTypeDocumentState(resultset.getString("type_document_state"));
            }
        } catch (SQLException e) {
            logger.info(e.getMessage());
        } finally {
            ResourceManager.closeConexion(conexion);
            ResourceManager.closeSentencia(sentencia);
        }
        return tipoDocumentoDTO;

    }
}