package com.example.Authentication.controller;

import com.example.Authentication.services.EnderecoService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.MalformedURLException;

@NoArgsConstructor
@RestController
@RequestMapping("/api/endereco/")
@Slf4j
public class EnderecoController {


    @Autowired
    private EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @GetMapping("findByRegiao/{cep}")
    public Object findByRegiao(@PathVariable String cep) throws IOException {
        return enderecoService.findByRegiao(cep);
    }

}

