package br.senac.ads.dsw.curriculum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senac.ads.dsw.curriculum.model.Dados;
import java.util.List;
import java.net.URL;


public interface DadosRepository extends JpaRepository<Dados, Long>{
    
    List<Dados> findByLinkedin(URL linkedin);
    List<Dados> findByGithub(URL github);
}
