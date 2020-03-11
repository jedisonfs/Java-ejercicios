package modelo.dao.util;

import java.sql.*;
import java.util.logging.Logger;

public class ResourceManager {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ProyectoMio"+"?useTimezone=true&serverTimezone=UTC";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "123456789";

    static final Logger logger = Logger.getLogger(ResourceManager.class.getName());

    public static Connection getConexion(){
        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        }catch(SQLException e){
            logger.info(e.getMessage());
        }
        return conexion;
    }

    public static void closeConexion(Connection conexion){
        try{
            conexion.close();
        }catch(SQLException e){
            logger.info(e.getMessage());
        }
    }

    public static void closeSentencia(PreparedStatement senten){
        try{
            senten.close();
        }catch(SQLException e){
            logger.info(e.getMessage());
        }
    }

    public static void closeResultado(ResultSet resul){
        try{
            resul.close();
        }catch(SQLException e){
            logger.info(e.getMessage());
        }
    }
}

