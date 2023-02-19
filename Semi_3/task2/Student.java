package Semi_3.task2;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
@Data
@AllArgsConstructor

/**
 * Student
 */
public class Student {

   private String fio;
   private Integer group;
   private Integer money;
   List<Integer> count;
   
}