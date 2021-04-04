package dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Diego T
 */
public class ClienteDao {
    JdbcTemplate jdbcTemplate;
    ConectarDB con = new ConectarDB();
    
    /**
     *
     * @param id
     * @return
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
     * @param nombre
     * @return
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
     * @return
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
     * @param id
     * @return
     */
    public List cargarClientesbyId(int id){
        List cli = new ArrayList();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
        String sql = "select * from cliente where id_cli = " + id;
        cli = this.jdbcTemplate.queryForList(sql);
        return cli;
    }       
}
