package mvctypetodo.mvctodo.Repositary;

import mvctypetodo.mvctodo.Service.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class todorepo {


   private List <Todo> todos= new ArrayList<>();

   public List<Todo> getalltodos(){
       return todos;
   }
   public void addTodo1(Todo todo) {
       todos.add(todo);
   }

}
