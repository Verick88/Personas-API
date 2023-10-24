package persona.persona;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class WebController {

    @GetMapping()
    public String index(){
        return "index-intro";
    }
}
