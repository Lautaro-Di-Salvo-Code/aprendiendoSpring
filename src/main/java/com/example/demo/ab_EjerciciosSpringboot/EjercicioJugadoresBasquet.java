package com.example.demo.ab_EjerciciosSpringboot;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class EjercicioJugadoresBasquet {

    @PostMapping("/jugadores/promedio")
    public String PromedioAlturaJug(@RequestBody DataJugadores e){
//            ("PRomedio estatura: "+ i.getEstatura() / 4 ;


        return null;



//        Dar por medio de texto el promedio
    }
//        for (DataJugadores e : jugadores) {
//            double promedio_estatura =  e.getEstatura() + e.getEstatura();
//            System.out.println("El promedio de estatura de todos los jugadores es: " + promedio_estatura / 4);
//        }
//        double  suma_estatura_jugadores = e.getEstatura();
//        double dividion_de_promedio =
//        System.out.println();


    @GetMapping("/jugadores")
    public List<DataJugadores> Equipo_deJugadores(){
//        Por medio de json obtener los datos de los jugadores
        List<DataJugadores> jugadores = new ArrayList<DataJugadores>();
        jugadores.add(new DataJugadores(1, 23, 80.3, 1.94, "Esteban", "Farias"));
        jugadores.add(new DataJugadores(2, 22, 80.3, 1.92, "Carlos", "Herrera"));
        jugadores.add(new DataJugadores(3, 19, 80.3, 1.95, "Rodrigo", "Gil"));
        jugadores.add(new DataJugadores(4, 21, 80.3, 1.93, "Bruno", "Agostini"));
        jugadores.add(new DataJugadores(5, 20, 80.3, 1.96, "Lautaro", "Martinez"));

        return jugadores;
    }

}

@Getter @Setter
class DataJugadores{
    private int id ,edad;
    private  double peso, estatura ;
    private  String nombre, apellido;

    public DataJugadores(int id, int edad, double peso, double estatura, String nombre, String apellido) {
        this.id = id;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public DataJugadores() {
    }
}


//Ejercicio Nº 2 – Estaturas en Basquet
//Un director técnico de un equipo de basquet desea poder contar con una API que, al enviar los datos de 5 de
//sus jugadores en el body de una solicitud http POST, los mismos sean dados de alta en una bases de datos lógica representada
//por una lista de tipo ArrayList y que, al mismo tiempo, luego del alta correspondiente, se pueda obtener inmediatamente como
//respuesta el promedio de estatura de todos sus jugadores ingresados.
//
//Los datos que se ingresan para cada jugador son los siguientes: id, dni, nombre, apellido, edad, peso y estatura.
//
//Tener en cuenta para la realización de este ejercicio la manipulación/creación de archivos JSON,
//el uso de Postman como herramienta para generar la solicitud POST, la annotation @RequestBody y el manejo de ArrayLists.



//Ejercicio Nº 3 – Área del triángulo
//
//Realizar una API que permita obtener como response a una solicitud GET el área de un triángulo. Se recuerda que la fórmula para calcular el área de un triángulo es: (base * altura) / 2.
//
//Se debe permitir al usuario enviar como parámetro de la solicitud la base y la altura, mientras que la API debe calcular el área y responder el resultado.
//
//Para este ejercicio sentite con total libertad de utilizar la forma de pasaje de parámetros con la que más cómodo te sientas.