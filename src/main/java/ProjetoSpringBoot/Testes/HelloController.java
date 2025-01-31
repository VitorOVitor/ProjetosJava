package ProjetoSpringBoot.Testes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Olá, mundo!";
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam String nome) {
        return "Olá, " + nome + "!";
    }
     
    @PostMapping("/hello")
public String sayHello(@RequestBody Pessoa pessoa) {
    return "Olá, " + pessoa.getNome() + "! Você tem " + pessoa.getIdade() + " anos.";
}

// Classe Pessoa
public class Pessoa {
    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
    return idade;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setIdade(int idade){
        this.idade=idade;
    }
}

}