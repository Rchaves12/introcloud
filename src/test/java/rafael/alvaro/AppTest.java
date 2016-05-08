package rafael.alvaro;

import org.junit.Test;

/**
 * @author jooby generator
 */
public class AppTest extends BaseTest {

  @Test
  public void index() throws Exception {
    server.get("/todos")
        .expect("{\"content\":Rafael,\"i\":\"1\"}")
        .header("Content-Type", "text/html;charset=UTF-8");
  }
  
  @Test
  public void viewTodo() throws Exception {
	  Todo todo = new Todo("content");
	  todo.i = 1;
	  TodoResource.todos.add(todo);
	  
	  server.get("/todos")
	  	.expect("{\"content\":\"alvaro\",\"i\":1}");
  }

}



