package rafael.alvaro;

import io.netty.channel.MessageSizeEstimator.Handle;
import static io.netty.handler.codec.http.HttpMethod.GET;
import java.util.List;
import org.jooby.Jooby;
import org.jooby.MediaType;
import org.jooby.Mutant;
import org.jooby.Result;
import org.jooby.Results;
import static org.jooby.Route.GET;
import org.jooby.json.Jackson;
import org.jooby.mvc.Body;
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
        //preparação para json 
        use(new Jackson());
        Service serv = new Service();

        get("/TODO", () -> serv.getTodo());

        // metodo Post
        post("/todos", req -> {
            Todo t = req.body().to(Todo.class);

            String retorno = serv.updateTodo(t.getI(), t.getContent());

            return retorno;
        });

    }

    public static void main(final String[] args) throws Exception {
        run(App::new, args);
    }

}
