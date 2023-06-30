package mvctypetodo.mvctodo.Controller;

import mvctypetodo.mvctodo.Service.todoservice;
import mvctypetodo.mvctodo.Service.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class todocontroller {

    @Autowired
    todoservice service;

    @GetMapping("Alltodos")
    public List<Todo> alltodos(){
        return service.alltodos();
    }
    @GetMapping("donetodos")
    public List<Todo> donetodos(){
        return service.donetodos();
    }

    @GetMapping("undonetodos")
    public List<Todo> undonetodos(){
        return service.undonetodos();
    }


    @PostMapping("add-todo")
    public String addTodo(@RequestBody Todo todo){
        service.addTodos(todo);
        return "Given todo is added";
    }

    @PutMapping("marktodo/todoid/stage")
    public String marktodo(@RequestBody Integer todoid, @RequestBody boolean stage){
       return service.marktodo(todoid,stage);
    }

    @DeleteMapping("deletetodo")
    public String deletetodo(@RequestBody Integer todoid){
       return service.deletetodo(todoid);

    }


}
