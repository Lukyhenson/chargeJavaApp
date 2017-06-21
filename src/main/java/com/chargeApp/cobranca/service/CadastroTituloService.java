package com.chargeApp.cobranca.service;

import com.chargeApp.cobranca.model.StatusTitulo;
import com.chargeApp.cobranca.model.Titulo;
import com.chargeApp.cobranca.repository.Titulos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class CadastroTituloService {

    @Autowired
    private Titulos titulos;

    public void salvar(Titulo titulo){
        try{
            titulos.save(titulo);
        }catch(DataIntegrityViolationException e){
         throw new IllegalArgumentException("Formato de data invalido!");
        }
    }

    public void excluir(Long codigo) {
        titulos.delete(codigo);
    }

    public String receber(Long codigo) {
        Titulo titulo = titulos.findOne(codigo);
        titulo.setStatus(StatusTitulo.RECEBIDO);
        titulos.save(titulo);

        return StatusTitulo.RECEBIDO.getDescricao();
    }
}
