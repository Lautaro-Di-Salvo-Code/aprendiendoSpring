package com.example.demo.ejercicioPlatos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;

@RestController
public class mapPlatos {
    @GetMapping("/numplato/")
    @ResponseBody
    public LinkedList<ejercicioPlatos> mapeandoPlatos(){
        LinkedList<ejercicioPlatos> array_platos = new LinkedList<ejercicioPlatos>();
        array_platos.add(new ejercicioPlatos(1, 2.50, "Pastas", "Fideos con tuco"));
        array_platos.add(new ejercicioPlatos(4, 2.30, "Empanadas", "Empanadas de pollo"));
        array_platos.add(new ejercicioPlatos(2, 3.50, "Carne", "Estofado de pollo"));
        return array_platos;
    } @GetMapping("/numplato/1")
    @ResponseBody
    public LinkedList<ejercicioPlatos> mapeandoPlatos1(){
        LinkedList<ejercicioPlatos> array_platos1 = new LinkedList<ejercicioPlatos>();
        array_platos1.add(new ejercicioPlatos(1, 2.50, "Pastas", "Fideos con tuco"));
//        array_platos.add(new ejercicioPlatos(4, 2.30, "Empanadas", "Empanadas de pollo"));
//        array_platos.add(new ejercicioPlatos(2, 3.50, "Carne", "Estofado de pollo"));
        return array_platos1;
    }
   @GetMapping("/numplato/2")
   @ResponseBody
   public LinkedList<ejercicioPlatos> mapeandoPlatos2(){
       LinkedList<ejercicioPlatos> array_platos2 = new LinkedList<ejercicioPlatos>();
        array_platos2.add(new ejercicioPlatos(3, 4.50, "Pizza", "Pizza napoletana"));

     return array_platos2;
 }



}
