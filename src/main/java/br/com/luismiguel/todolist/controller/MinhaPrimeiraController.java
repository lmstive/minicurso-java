package br.com.luismiguel.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraController {

    /*
     * Metodos de acesso HTTP
     * GET - Buscar uma informação
     * POST - Adicionar um dado/informação
     * PUT - Altarar um dado/informação
     * DELETE - Deletar um dado
     * PATCH - Altarar somente uma parte do dado/informação
     * 
     */

    // Método (funcionalidade) de uma classe
    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem() {
        return "Funcionou";
    }

}
