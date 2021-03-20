
package dao;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author Diego T
 */
public class ConectarDB {

    /**
     *
     * @return
     */
    public DriverManagerDataSource conectar (){
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setDriverClassName("com.mysql.jdbc.Driver");
        datasource.setUrl("jdbc:mysql://localhost:3306/db_des_mer");
        datasource.setUsername("root");
        datasource.setPassword("");
        
        return datasource;
    }
}
