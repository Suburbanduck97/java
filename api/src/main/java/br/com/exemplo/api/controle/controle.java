package br.com.exemplo.api.controle;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import br.com.exemplo.api.modelo.Pessoa;
import br.com.exemplo.api.repositorio.Repositorio;


@RestController
public class controle {
    
    @Autowired
    private Repositorio acao;

    @PostMapping("/api")
    public Pessoa cadastrar (@RequestBody Pessoa obj) {
        return acao.save(obj);
    }
    

    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p){
        return p;
    }
    
    @GetMapping("/api")
    public list<Pessoa> Selecionar(){
        
    }
    
    @GetMapping("")
    public String mensagem(){
        return "Olá, mundo";
    }

    @GetMapping("/boasVindas/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "Seja bem vindo(a) " + nome;
    }
}
