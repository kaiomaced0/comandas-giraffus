package k.repository;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import k.model.TipoProduto;

public class TipoProdutoRepository implements PanacheRepository<TipoProduto> {
    
    public List<TipoProduto> findByNome(String nome){
        if (nome == null)
            return null;
        return find("UPPER(nome) LIKE ?1 ", "%"+nome.toUpperCase()+"%").list();
    }

}
