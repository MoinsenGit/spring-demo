package de.neuefische.springdemo.controller;

import de.neuefische.springdemo.model.Student;
import org.springframework.web.bind.annotation.*;

@RestController // Controller erstellt und verknüpft
@RequestMapping("/helloworld") // soll auf "helloworld" achten


// übergibt eigentlich nur Anfragen, daher ist Controller immer ziemlich kurz

public class HelloWorldController {
    // bei Änderungen muss "neu gestartet" werden - mit Web Dev Tools möglich über Hammersymbol

    private String name = "";

    @GetMapping
    public String sayHello() {
        return "Greetings Earthling " + name;
    }

    @GetMapping("/en") // weiteres Mapping muss neue Adresse bekommen - dann so viele GETs möglich,
    // wie man möchte
    public String sayHello2() {
        return "Greetings Children";
    }

    @GetMapping(path = "{name}") // PathVariable muss man im Path mitgeben - z.B. ID übergeben -
    // kann man auch "/{name}" schreiben
    public String sayHello3(@PathVariable String name, @RequestParam String greeting) { // RequestParameter müssen
        // befüllt werden
        return greeting + " " + name;
    }

    @PostMapping // Post schreibt neues hinzu
    public String postName(@RequestBody String newName) { // RequestBody kann sehr viele Daten übergeben
        name = newName;
        return "Hallo " + name;
    }

    /*
    @PostMapping // Kann ganze Objekte enthalten
    public String postName(@RequestBody Student student) {

    }

  JSON Beispiel
    Object Student
    {
        "firstname":"Doreen",
        "lastname":"Java",
        "course":"bo-java-22-1",
        "age":"27"
    }

     */
 /*
    Aufgabe
    Schreibe einen zusätzlichen GET-Endpunkt,
    - der den Vornamen als Query-Parameter entgegennimmt
    - und den Aufrufer persönlich begrüßt
    Schreibe einen zusätzlichen POST-Endpunkt,
    - der im Body einen String enthält
    - und die Länge des Texts zurückgibt

    @GetMapping("/de", path = "{name}")
    public String sayHelloName(@PathVariable String name, @RequestParam String greeting) {
        return greeting + " " + name;
    }
    @GetMapping
    public String sayHello(){
        int i = name.length();
        return "Hallo " + name + " Länge des String " + i;
    }

    @PostMapping ("/de")
    public String postName2(@RequestBody String newName) {
        name = newName;
        return "Textlänge: " + name.length;
    }


  */





}
