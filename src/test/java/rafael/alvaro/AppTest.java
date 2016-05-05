package rafael.alvaro;

import org.junit.Test;

/**
 * @author jooby generator
 */
public class AppTest extends BaseTest {

  @Test
  public void index() throws Exception {
    server.get("/TODO")
        .expect("{\"content\":Rafael,\"i\":\"1\"}")
        .header("Content-Type", "text/html;charset=UTF-8");
  }

}
