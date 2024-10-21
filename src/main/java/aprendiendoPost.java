
import aprendiendoPost.Cliente.ClientTest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aprendiendoPost {
    
//    Cliente
    @PostMapping("/client")
    public void PostCliente(@RequestBody ClientTest client){
        System.out.println("Cliente creado con exito");
        System.out.println("Apellido del cliente"+ client.getApellido());
        System.out.println("Nombre del cliente"+ client.getNombre());
    }
       
    
}
