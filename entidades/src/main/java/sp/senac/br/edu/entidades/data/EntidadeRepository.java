package sp.senac.br.edu.entidades.data;

import org.springframework.data.jpa.repository.JpaRepository;

import sp.senac.br.edu.entidades.model.Entidade;

public interface EntidadeRepository extends JpaRepository<Entidade, Long>{
    
}
