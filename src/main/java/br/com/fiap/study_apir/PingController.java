package br.com.fiap.study_apir;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("raiz")
public class PingController {

    @GetMapping("ping")
    public String ping(){
        return "pong";
    }

    
    @GetMapping("/rota")
    public String rota1(){
        return "rota";
    }

}
