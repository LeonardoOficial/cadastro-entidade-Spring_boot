package sp.senac.br.edu.entidades.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sp.senac.br.edu.entidades.data.EntidadeRepository;
import sp.senac.br.edu.entidades.model.Entidade;

@Controller
public class EntidadeTarefa {
    
    @Autowired
    EntidadeRepository repository;

    @GetMapping("/entidade")
    public String entidade(){
        return "entidade";
    }

    @GetMapping("entidade/cadastrar")
    public String formulario(){
        return "formulario_entidade";
    }
    
    @GetMapping("/")
    public String Home(){
        return "redirect:/entidade";
    }


    @GetMapping("entidade/listar")
    public String listar(Model model){
        var lista = repository.findAll();
        model.addAttribute("lista", lista);
        return "listaEntidade";
    }
    
    @PostMapping("/entidade")
    public String cadastrar(Entidade entidade){
     repository.save(entidade);
     return "redirect:/entidade";
     }

     @DeleteMapping("/entidade/listar")
     public String apagar (Long id){
         repository.deleteById(id);
         return "redirect:/entidade/listar";
     }
}
