package controller;

import dao.ClienteDao;
import dao.ConectarDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import models.Cliente;
import models.ClienteValidation;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Diego Tique
 */
@Controller
public class homeController {
    private JdbcTemplate jdbcTemplate;
    ClienteValidation cliValidar;

    /**
     *
     */
    public homeController() {
        this.cliValidar = new ClienteValidation();
        ConectarDB con = new ConectarDB();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }
    
    /**
     *
     * @return un formulario de ingreso
     */
    @RequestMapping(value="formCliente.htm", method=RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView();
        Cliente cliente = new Cliente();        
        mav.addObject("cliente",cliente);
        mav.setViewName("views/formCliente");
        return mav;
    }
    
    /**
     *
     * @return Lista con los datos de la BD
     */
    @RequestMapping(value="formCliente.htm", method=RequestMethod.POST)
    public ModelAndView mostrarCliente(){
        ModelAndView mav = new ModelAndView();
        String sql = "select * from cliente";
        
        List datos = this.jdbcTemplate.queryForList(sql);

        mav.addObject("cliente",datos);
        mav.setViewName("views/mostrarCliente");
        return mav;
    }
//--------------metodo para consultar cliente por nombre------------------------

    /**
     *
     * @return una vista con formulario para consultar por nombre
     */
    @RequestMapping(value="formConsultarCliente.htm", method=RequestMethod.GET)
    public ModelAndView listarClientesxNombre(){
    ModelAndView mav = new ModelAndView();
    Cliente cliente = new Cliente();
    mav.addObject("cliente",cliente);
    mav.setViewName("views/formConsultarCliente");
    return mav;
}

    /**
     *
     * @param cli usado para enlazar 
     * @param result para validar el resultado esperado 
     * @param status si no hay errores limpiamos la session y redireccionamos
     * @return Lista con el nombre requerido
     */
    @RequestMapping(value="formConsultarCliente.htm", method=RequestMethod.POST)
    public ModelAndView listarClientesxNombre(
            @ModelAttribute ("cliente") Cliente cli,
            BindingResult result,
            SessionStatus status){
        ModelAndView mav = new ModelAndView();
        ClienteDao cliDao = new ClienteDao();
        String nom = cli.getNombre();
        System.out.println("nombre:" + nom);
        mav.addObject("cliente",cliDao.consultarClienteByNombre(nom));
        mav.setViewName("views/listarClientes");
        return mav;
    }
//------------------ metodo para agregar los datos del cliente ------------------    

    /**
     *
     * @return una vista para ingresar un nuevo registro
     */
        @RequestMapping(value="agregarCliente.htm", method=RequestMethod.GET)
    public ModelAndView cargarCliente(){
        ModelAndView mav = new ModelAndView();
//        Cliente cliente = new Cliente();   
         mav.addObject("cliente", new Cliente());
        mav.setViewName("views/agregarCliente");
        return mav;
    }
/*    @RequestMapping(value="agregarCliente.htm", method=RequestMethod.POST)
    public ModelAndView agregarCliente( Cliente cli){
        ModelAndView mav = new ModelAndView();
        String sql = "insert into cliente (nom_cli,dir_cli,corr_cli,tel_cli) values (?,?,?,?) ";
        this.jdbcTemplate.update(
                sql,cli.getNombre(), cli.getDireccion(), cli.getCorreo(), cli.getTelefono());
        mav.setViewName("redirect:/formCliente.htm");
        return mav;
  */  
 //--------------------metodo con validacion para agregar cliente---------------

    /**
     *
     * @param cli usado para enlazar 
     * @param result para validar el resultado esperado 
     * @param status si no hay errores limpiamos la session y redireccionamos
     * @return al formulario inicial
     */
        @RequestMapping(value="agregarCliente.htm", method=RequestMethod.POST)
    public ModelAndView agregarCliente(
            @ModelAttribute ("cliente") Cliente cli,
            BindingResult result,
            SessionStatus status
    )
    {
        this.cliValidar.validate(cli,result);
        if(result.hasErrors()){
            ModelAndView mov = new ModelAndView();
            mov.addObject("cliente", new Cliente());
            mov.setViewName("views/agregarCliente");
            return mov;
        }else{
            ModelAndView mav = new ModelAndView();
            String sql = "insert into cliente (nom_cli,dir_cli,corr_cli,tel_cli) values (?,?,?,?)";
            this.jdbcTemplate.update(sql,
                    cli.getNombre(),cli.getDireccion(),cli.getCorreo(),
                    cli.getTelefono());
            mav.setViewName("redirect:/formCliente.htm");
            return mav;
        }
    }
 //------------------- metodo para actualizar los datos del cliente --------------
 /*   @RequestMapping(value="actCliente.htm", method=RequestMethod.GET)
    public ModelAndView actCliente(HttpServletRequest request){
        ModelAndView mav = new ModelAndView();
        int id = Integer.parseInt(request.getParameter("id"));
        String sql = "select * from cliente where id_cli = ? ";
        List datos = this.jdbcTemplate.queryForList(sql,id);
        mav.addObject("cli", datos);
        mav.setViewName("views/actCliente");
        return mav;
    }
    @RequestMapping(value="actCliente.htm", method=RequestMethod.POST)
    public ModelAndView actCliente( Cliente cli ){
     ModelAndView mav = new ModelAndView();
        String sql = "update cliente set nom_cli = ?, dir_cli = ? , corr_cli = ? ,tel_cli = ?"
                + "where id_cli = ? ";
        this.jdbcTemplate.update(
                sql,cli.getNombre(), cli.getDireccion(), cli.getCorreo(), 
                    cli.getTelefono(),  cli.getId());
        mav.setViewName("redirect:/formCliente.htm");
        return mav;
    }
    */
 //============metodo para cargar los datos en el formulario===================

    /**
     *
     * @param request para propocionar la informacion registrada
     * @return formulario con los datos para actualizar
     */
        @RequestMapping(value="actCliente.htm", method=RequestMethod.GET)
        public ModelAndView actCliente(HttpServletRequest request){
        ModelAndView mav = new ModelAndView();
        int id = Integer.parseInt(request.getParameter("id"));
        Cliente cli = this.cargarClientesbyId(id);
        
        mav.addObject("cliente", new Cliente (id, cli.getNombre(),
        cli.getDireccion(),cli.getCorreo(),cli.getTelefono()));
        mav.setViewName("views/actCliente");
        return mav;
    }
 //============metodo para actualizar datos con validacion=====================

    /**
     *
     * @param cli usado para enlazar 
     * @param result para validar el resultado esperado 
     * @param status si no hay errores limpiamos la session y redireccionamos
     * @return al formulario inicial
     */
        @RequestMapping(value="actCliente.htm", method=RequestMethod.POST)
        public ModelAndView actCliente(
            @ModelAttribute ("cliente") Cliente cli,
            BindingResult result,
            SessionStatus status
    ){
        this.cliValidar.validate(cli,result);
        if(result.hasErrors()){
            ModelAndView mov = new ModelAndView();
            mov.addObject("cliente", new Cliente());
            mov.setViewName("views/actCliente");
            return mov;
        }else{
            ModelAndView mav = new ModelAndView();
            String sql = "update cliente set nom_cli=?, dir_cli=?, corr_cli=?,"
                    + "tel_cli=? where id_cli=?";
            this.jdbcTemplate.update(
                    sql,cli.getNombre(),cli.getDireccion(),cli.getCorreo(),
                    cli.getTelefono(),cli.getId());
            mav.setViewName("redirect:/formCliente.htm");
            return mav;
        }
    }
//=============================================================================
//============ metodo para eliminar un campo de la tabla ======================

    /**
     *
     * @param request para propocionar la informacion registrada 
     * @return formulario inicial
     */
        @RequestMapping("borrarCliente.htm")
        public ModelAndView borrarCliente(HttpServletRequest request ){
        ModelAndView mav = new ModelAndView();
        int id = Integer.parseInt(request.getParameter("id"));
        String sql = "delete from cliente where id_cli = ? ";
        this.jdbcTemplate.update(sql,id);
        mav.setViewName("redirect:/formCliente.htm");
        return mav;
    }

//=============metodo para consultar los datos y cargarlos al formulario========

    /**
     *
     * @param id por medio del cual tomamos los datos a actulizar
     * @return los datos para actulizar
     */
        public Cliente cargarClientesbyId(int id){
        final Cliente cli = new Cliente();
        String sql = "select * from cliente where id_cli = " + id;
        return (Cliente) jdbcTemplate.query(sql, new ResultSetExtractor<Cliente>()
        {
            public Cliente extractData (ResultSet rs ) throws SQLException, DataAccessException{
                if(rs.next()){
                    cli.setId(rs.getInt("id_cli"));
                    cli.setNombre(rs.getString("nom_cli"));
                    cli.setDireccion(rs.getString("dir_cli"));
                    cli.setCorreo(rs.getString("corr_cli"));
                    cli.setTelefono(rs.getString("tel_cli"));
                }
                return cli;
            }
        });
    }
//==============================================================================

    /**
     *
     * @return la lista de datos consultados
     */
    @RequestMapping(value="listar.htm", method=RequestMethod.GET)
    public ModelAndView listarClientesxId(){
    ModelAndView mav = new ModelAndView();
    Cliente cliente = new Cliente();
    mav.addObject("cliente",cliente);
    mav.setViewName("views/listarClientes");
    return mav;
    }
}