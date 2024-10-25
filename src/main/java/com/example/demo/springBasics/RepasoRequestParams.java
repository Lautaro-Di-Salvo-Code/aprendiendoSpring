package com.example.demo.springBasics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RepasoRequestParams {

    @GetMapping("/1")
//    RequestPAram permite desde el url con notacion ?valor=..&valor2=.. definir un valor desde la url
//    esto permite hacer muchas cosas como operaciones
    public String cosas_a_Repasar(@RequestParam String algo, int data){

        String saludo = "Mi nombre es Rodrigo y estoy escribiendo un texto";

        return  "Buenos dias" + algo + data;
    }

}
