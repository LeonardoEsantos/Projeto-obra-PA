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

//import com.projeto.obra.DTO.ObraDetalhesTecnicosDto;
import com.projeto.obra.model.ObraDetalhesTecnicos;
import com.projeto.obra.repository.ObraDetalhesTecnicosRepository;

@RestController
@RequestMapping(path = "/obra-detalhes-tecnicos")
public class ObraDetalhesTecnicosController {

    @Autowired
    ObraDetalhesTecnicosRepository obraDetalhesTecnicosRepository;

    @PostMapping
    public @ResponseBody ObraDetalhesTecnicos AddDetalhesTecnicos(
            @RequestBody ObraDetalhesTecnicos obraDetalhesTecnicos) {

                ObraDetalhesTecnicos novaObraDetalhesTecnicos = new ObraDetalhesTecnicos();

                novaObraDetalhesTecnicos.setId(obraDetalhesTecnicos.getId());
                novaObraDetalhesTecnicos.setRisco(obraDetalhesTecnicos.getRisco());
                novaObraDetalhesTecnicos.setTipo(obraDetalhesTecnicos.getTipo());

                obraDetalhesTecnicosRepository.save(novaObraDetalhesTecnicos);

        return novaObraDetalhesTecnicos;
    }

    @GetMapping
    public Iterable<ObraDetalhesTecnicos> ListarObrasDetalhesTecnicos() {

        Iterable<ObraDetalhesTecnicos> obraDetalhesTecnicos = obraDetalhesTecnicosRepository.findAll();
        return obraDetalhesTecnicos;
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Object LocalizarObraDetalhesTecnicosPorId(
            @PathVariable("id") String id) {

        return obraDetalhesTecnicosRepository
                .findById(Integer.valueOf(id))
                .get();
    }

    @PutMapping(path = "/{id}")
    public @ResponseBody String AtualizarObraDetalheTecnico(
            @PathVariable("id") String id,
            @RequestBody ObraDetalhesTecnicos obraDetalhesTecnicos) {

        ObraDetalhesTecnicos obraDetalhesTecnicosAtt = obraDetalhesTecnicosRepository
                .findById(Integer.valueOf(id))
                .get();

        obraDetalhesTecnicosAtt.setRisco(obraDetalhesTecnicos.getRisco());
        obraDetalhesTecnicosAtt.setTipo(obraDetalhesTecnicos.getTipo());

        obraDetalhesTecnicosRepository.save(obraDetalhesTecnicosAtt);

        return "Detalhes tecnicos da obra atualizados";
    }

    @DeleteMapping(path = "/{id}")
    public @ResponseBody String DeleteObraDetalheTecnico(
            @PathVariable("id") String id) {

        ObraDetalhesTecnicos obraDetalheTecnicoDel = obraDetalhesTecnicosRepository
                .findById(Integer.valueOf(id))
                .get();
        obraDetalhesTecnicosRepository.delete(obraDetalheTecnicoDel);

        return "Detalhes tecnicos da obra deletados";
    }

}
