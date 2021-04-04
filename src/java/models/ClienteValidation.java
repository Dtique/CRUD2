package models;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author Diego Tique
 */
public class ClienteValidation implements Validator{

    /**
     *
     * @param type
     * @return
     */
    @Override
    public boolean supports(Class<?> type){
        return Cliente.class.isAssignableFrom(type);
    }

    /**
     *
     * @param o
     * @param errors
     */
    @Override
    public void validate(Object o, Errors errors) {
        Cliente cliente = (Cliente)o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, 
                "nombre", 
                "required.nombre",
                "El campo nombre es obligatorio...");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, 
                "direccion", 
                "required.direccion",
                "El campo dirección es obligatorio...");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, 
                "correo", 
                "required.correo",
                "El campo correo es obligatorio...");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, 
                "telefono", 
                "required.telefono",
                "El campo telefono es obligatorio...");
    }
}
