package br.senac.ads.dsw.curriculum.controller;

import java.net.URL;
import java.time.LocalDate;
import java.net.MalformedURLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import br.senac.ads.dsw.curriculum.model.Dados;
import br.senac.ads.dsw.curriculum.repository.DadosRepository;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DadosController {

    @Autowired
    DadosRepository repository;

    @SuppressWarnings("deprecation")
    @GetMapping("/index")
    public String Dados(Model model) {
        Dados dados = new Dados();

        Dados experiencia = new Dados();

        Dados experiencia2 = new Dados();

        Dados experiencia3 = new Dados();

        Dados formacao = new Dados();

        Dados formacao2 = new Dados();

        Dados formacao3 = new Dados();

        Dados conhecimento = new Dados();

        Dados conhecimento1 = new Dados();

        Dados conhecimento2 = new Dados();

        Dados conhecimento3 = new Dados();


        dados.setNome("Cintia Lucena");
        dados.setDataNascimento(LocalDate.of(1994, 12, 14));
        dados.setTelefone("(11) 91234-6789");
        dados.setEmail("lcintia934@gmail.com");
        experiencia.setLocal("Melhor envio");
        experiencia.setPeriodo("De: 2021 à 2022");
        experiencia2.setLocal("Caixa economica federal");
        experiencia2.setPeriodo("6 meses");
        experiencia3.setLocal("Mafs");
        experiencia3.setPeriodo("6 meses");
        formacao.setCurso("Análise e Desenvolvimento de Sistemas");
        formacao.setInstituicao("SenacSP");
        formacao2.setCurso("Ruby on Rails 5");
        formacao2.setInstituicao("Udemy");
        formacao3.setCurso("Tecnico em administração");
        formacao3.setInstituicao("Etec Takashi Morita");
        conhecimento.setConhecimento("Ruby");
        conhecimento1.setConhecimento("Ruby on Rails");
        conhecimento2.setConhecimento("Java");
        conhecimento3.setConhecimento("MySql");
        try {
            dados.setLinkedin(new URL("https://www.linkedin.com/in/cintiabarbosalucenagentil/"));
            dados.setGithub(new URL("https://github.com/Cih-gentil"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        model.addAttribute("dados", dados);
        model.addAttribute("experiencia", experiencia);
        model.addAttribute("experiencia2", experiencia2);
        model.addAttribute("experiencia3", experiencia3);
        model.addAttribute("formacao", formacao);
        model.addAttribute("formacao2", formacao2);
        model.addAttribute("formacao3", formacao3);
        model.addAttribute("conhecimento", conhecimento);
        model.addAttribute("conhecimento1", conhecimento1);
        model.addAttribute("conhecimento2", conhecimento2);
        model.addAttribute("conhecimento3", conhecimento3);

        return "index";
    }

}
