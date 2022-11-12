package com.projeto.obra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.obra.model.Obra;
import com.projeto.obra.repository.ObraRepository;

@RestController
@RequestMapping(path = "/obras")
public class ObraController {

    @Autowired
    ObraRepository obraRepository;

    @PostMapping
    public @ResponseBody Obra AddObra(@RequestBody Obra obra){
        Obra novaObra = new Obra();
        novaObra.setNome(obra.getNome());
        novaObra.setAnoConstrucao(obra.getAnoConstrucao());
        novaObra.setCoordenacao(obra.getCoordenacao());
        novaObra.setDiretoria(obra.getDiretoria());
        novaObra.setOutorga(obra.getOutorga());
        novaObra.setTitularidade(obra.getTitularidade());
        return obraRepository.save(novaObra);
    }

    @GetMapping
    public Iterable<Obra> ListarObras(){
        Iterable<Obra> obras = obraRepository.findAll();
        return obras;
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Object LocalizarObraPorId(@PathVariable("id") String id){
        return obraRepository.findById(Integer.valueOf(id)).get();
    }

    @PutMapping(path = "/{id}")
    public @ResponseBody String AtualizarObra(@PathVariable("id") String id, @RequestBody Obra obra){
        Obra obraAtt = obraRepository.findById(Integer.valueOf(id)).get();

        obraAtt.setNome(obra.getNome());
        obraAtt.setAnoConstrucao(obra.getAnoConstrucao());
        obraAtt.setCoordenacao(obra.getCoordenacao());
        obraAtt.setDiretoria(obra.getDiretoria());
        obraAtt.setOutorga(obra.getOutorga());
        obraAtt.setTitularidade(obra.getTitularidade());

        obraRepository.save(obraAtt);
        
        return "Obra "+obraAtt.getId() +" Atualizada";
    }

    @DeleteMapping(path = "/{id}")
    public @ResponseBody String DeletarObra(@PathVariable("id") String id){
        Obra obraDel = obraRepository.findById(Integer.valueOf(id)).get();
        obraRepository.delete(obraDel);
        return "Obra "+obraDel.getId()+" deletada";
    }





    
}
