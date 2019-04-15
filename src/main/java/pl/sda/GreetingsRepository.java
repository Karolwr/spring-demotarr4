package pl.sda;

import org.springframework.data.repository.CrudRepository;
//1 paramater typ a drugi typ identyfikatora
public interface GreetingsRepository extends CrudRepository <Greeting, Long> {
}
