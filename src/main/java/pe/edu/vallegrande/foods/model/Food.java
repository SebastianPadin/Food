package pe.edu.vallegrande.foods.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor
@NoArgsConstructor
@Table("Foods")
public class Food {
    @Id
    private Long id_food;
    private String foodType;
    private String foodBrand;
    private Integer amount;
    private String packaging;
    private String unitMeasure;  
    private LocalDate entryDate;
    private String status;
}
