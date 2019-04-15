package pl.sda;

import org.springframework.web.bind.annotation.*;

//to jest api restowe nie strona www
@RestController
@RequestMapping("/greetings")
public class HelloWorldRestController {
    //wstrzykiwanie repositor
    private GreetingsRepository repository;

    public HelloWorldRestController(GreetingsRepository repository) {
        this.repository = repository;
    }
//szukanie:)?
    @GetMapping
    public Iterable<Greeting>getAllGreeting(){
   // public Greeting getAllGreeting(){
        return repository.findAll();
       // return new Greeting("hello world");
    }
    //reguestbodyy
    //skladaa sie z metody head status np. odpowoiedzim z  ewentualnie body
    //umozliwia dodawanie
    //zapis
    @PostMapping
    public void addGreetind (@RequestBody Greeting greeting){
        repository.save(greeting);
    }
    //usuwanie
    //id zostanie zstapione liczba
    @DeleteMapping("/{id}")
    public void deleteGreeting(@PathVariable("id") long id){
        repository.deleteById(id);
    }

}

