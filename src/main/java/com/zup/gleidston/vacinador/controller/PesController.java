package com.zup.gleidston.vacinador.controller;

import com.zup.gleidston.vacinador.model.pes;
import com.zup.gleidston.vacinador.repository.PesRepository;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.MediaSize;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PesController {
    @Autowired
    private PesRepository pesRepository;
    @GetMapping
    public List<pes> listartodos(){
        return pesRepository.findAll();
    }

    @PostMapping("id")
    public pes cadastrar (@Valid @RequestBody pes pessoa ){
      return pesRepository.save(pessoa);
    }


    @PutMapping
    public ResponseEntity editar (@PathVariable("id")Integer id, @RequestBody pes pessoa ) {
        return pesRepository.findById(id).map(gravar-> {
            gravar.setCpf(pessoa.getCpf());
            gravar.setDatnasc(pessoa.getDatnasc());
            gravar.setNome(pessoa.getNome());
            gravar.setEmail(pessoa.getEmail());


            pes pessoaAtualizada = pesRepository.save(gravar);
             return  ResponseEntity.ok().body(pessoaAtualizada);
           // return pesRepository.save(gravar);
        }).orElse(null);
   }
   @GetMapping("{id}")
    public pes buscarporid(@PathVariable Integer id ){
       return  pesRepository.findById(id).orElse(null);

   }
}
