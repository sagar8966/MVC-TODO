package mvctypetodo.mvctodo.Service;

import org.springframework.stereotype.Component;


public class Todo {
    private String todoname;
    private Integer todoid;
    private boolean istododone;

    public boolean isIstododone() {
        return istododone;
    }

    public void setIstododone(boolean istododone) {
        this.istododone = istododone;
    }

    public Integer getTodoid() {
        return todoid;
    }

    public void setTodoid(Integer todoid) {
        this.todoid = todoid;
    }

    public String getTodoname() {
        return todoname;
    }

    public void setTodoname(String todoname) {
        this.todoname = todoname;
    }
}
