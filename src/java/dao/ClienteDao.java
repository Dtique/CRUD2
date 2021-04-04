package dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/*
 * @author Diego Tique
 */
public class ClienteDao {
    JdbcTemplate jdbcTemplate;
    ConectarDB con = new ConectarDB();
    
    /**
     * @param id se utilizara en este metodo
     * @return Lista cli con la informacion de la BD
     */
    public List consultarClienteById(int id){
        List cli = new ArrayList();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
        String sql = "select * from cliente where id_cli= ?";
        cli = this.jdbcTemplate.queryForList(sql,id);
        return cli;
    }

    /**
     *
     * @param nombre es por el cual realizaremos la consulta
     * @return Lista cli con el resultado del nombre
     */
    public List consultarClienteByNombre(String nombre){
        List cli = new ArrayList();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
        String sql = "select * from cliente where nom_cli like '%" + nombre + "%'";
        cli = this.jdbcTemplate.queryForList(sql);
        return cli;
    }
    
    /**
     *
     * @return Lista cli con todos los datos de la BD
     */
    public List mostrarCliente(){
        List cli = new ArrayList();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
        String sql = "select * from cliente";
        cli = this.jdbcTemplate.queryForList(sql);
        return cli;
    }
    
    /**
     *
     * @param id se utilizara para agregar un registro con su identificacion
     * @return Lista cli de registros con una identificacion
     */
    public List cargarClientesbyId(int id){
        List cli = new ArrayList();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
        String sql = "select * from cliente where id_cli = " + id;
        cli = this.jdbcTemplate.queryForList(sql);
        return cli;
    }       
}
