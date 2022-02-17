package tacos.data;
//репозиторий

import org.springframework.data.repository.CrudRepository;
import tacos.Ingredient;

import java.util.Optional;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
    Iterable<Ingredient> findAll();   //если не заработает попробуем все закоментить
//
   Optional<Ingredient> findById(String id);
//
   Ingredient save(Ingredient ingredient);


}

