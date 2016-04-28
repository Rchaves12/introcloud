/*
 * Copyright 2016 rafae.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rafael.alvaro;
import java.io.IOException;
import java.util.List;
import javax.xml.ws.Response;
import org.jooby.mvc.GET;
import org.jooby.mvc.Path;
import org.json.simple.JSONObject;
/**
 *
 * @author rafael
 */

public class Service {
    TodoDao todoDao = new TodoDao();
      JSONObject obj = new JSONObject();
	public JSONObject getTodo() {
        List<Todo> teste = todoDao.getAllTodos();
        for(int i=0;i<teste.size();i++){
      
	obj.put("i",teste.get(i).getI());
	obj.put("conteudo", teste.get(i).getContent());

        }
return obj;
	}
         public String updateTodo(int i, String conteudo) throws IOException{
      Todo todo = new Todo(i, conteudo);
      int result = todoDao.updateTodo(todo);// colocar no dao
      if(result == 1){
         return "Sucesso"; //retorno trate o retorno
      }
      return "erro";
   }

    
}
