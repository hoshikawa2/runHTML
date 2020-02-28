package runhtml;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
        
    public String template = ", seja bem vindo %s!";

    @RequestMapping("/showhtml")
    public String greeting(@RequestParam(value="sku", defaultValue="sku") String sku,
    		@RequestParam(value="lista", defaultValue="lista") String lista,
    		@RequestParam(value="nome", defaultValue="nome") String nome,
    		@RequestParam(value="preco", defaultValue="preco") String preco) {
    	String msgOut = "";
        return msgOut;
    }
}
