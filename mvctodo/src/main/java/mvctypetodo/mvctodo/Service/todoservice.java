package mvctypetodo.mvctodo.Service;

import mvctypetodo.mvctodo.Repositary.todorepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class todoservice {

    @Autowired
    todorepo todos;
    public List<Todo> alltodos(){
      return todos.getalltodos();
    }

    public List<Todo> donetodos(){
        List<Todo> donetodos = new ArrayList<>();
        for(Todo mytodo:todos.getalltodos()){
            if(mytodo.isIstododone()){
                donetodos.add(mytodo);
            }
        }
        return donetodos;
    }
    public List<Todo> undonetodos(){
        List<Todo> undonetodo = new ArrayList<>();
        for(Todo mytodo:todos.getalltodos()){
            if(!mytodo.isIstododone()){
                undonetodo.add(mytodo);
            }
        }
        return undonetodo;
    }

    public void addTodos(Todo todo) {
         todos.addTodo1(todo);
    }

    public String deletetodo(Integer todoid) {
        for(Todo mytodo: todos.getalltodos()){
            if(mytodo.getTodoid().equals(todoid)){
                todos.getalltodos().remove(todoid);
                return "todo removed";
            }
        }
        return "todoid does not exist";
    }

    public String marktodo(Integer todoid, boolean stage) {
        for(Todo mytodo:todos.getalltodos()){
            if(mytodo.getTodoid().equals(todoid)){
                mytodo.setIstododone(stage);
                return "todo added ";
            }
        }
        return "todoid does not exist";
    }
}
