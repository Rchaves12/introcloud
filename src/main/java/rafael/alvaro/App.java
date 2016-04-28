package rafael.alvaro;

import static io.netty.handler.codec.http.HttpMethod.GET;
import java.util.List;
import org.jooby.Jooby;
import org.jooby.MediaType;
import static org.jooby.Route.GET;
import org.jooby.mvc.GET;
import org.jooby.mvc.POST;
import org.jooby.mvc.Path;
import org.jooby.mvc.Produces;
import org.json.simple.JSONObject;

/**
 * @author jooby generator
 */
public class App extends Jooby {
  
  {
    Service serv = new Service();
    get("/TODO", () -> serv.getTodo());
    post("/", () -> serv.updateTodo(2, "Alvaro"));
    
  }

  public static void main(final String[] args) throws Exception {
    run(App::new, args);
  }

 
  
}
