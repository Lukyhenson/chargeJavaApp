package com.chargeApp.cobranca.controller;

import com.chargeApp.cobranca.model.Titulo;
import com.chargeApp.cobranca.repository.Titulos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/titulos")
public class TituloController {

    @Autowired
    private Titulos titulos;

    @RequestMapping("/novo")
    public String novo(){
        return "CadastroTitulo";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String salvar(Titulo titulo){

        titulos.save(titulo);
        return ("CadastroTitulo");
    }

}