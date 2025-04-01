package pe.edu.vallegrande.foods.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import pe.edu.vallegrande.foods.model.Food;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface FoodRepository extends ReactiveCrudRepository<Food, Long> {
    Flux<Food> findAllByStatus(String status);

    Flux<Food> findByFoodType(String foodType);
}