package DZ3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
/**
 * Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта. 
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
@Data
@AllArgsConstructor
public class Items {
   
   private String name;
   private String land;
   private Integer weight;
   private Integer cost;
   private Integer qual;

}
