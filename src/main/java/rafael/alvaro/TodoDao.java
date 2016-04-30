/*
 * Copyright 2016 rafael.
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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafae
 */
public class TodoDao {
     public List<Todo> getAllTodos(){
      List<Todo> todoList = null;
     
//         File file = new File("Todo.txt");
//         if (!file.exists()) {
            Todo todo = new Todo(1, "Rafael" );
            todoList = new ArrayList<Todo>();
            todoList.add(todo);
     //       saveTodoList(todoList);		
       //  }
//         else{
//            FileInputStream fis = new FileInputStream(file);
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            todoList = (List<Todo>) ois.readObject();
//            ois.close();
//         }
     	
      return todoList;
   }
     public Todo getTodo(int id){
      List<Todo> todos = getAllTodos();

      for(Todo todo: todos){
         if(todo.getI() == id){
            return todo;
         }
      }
      return null;
   }
     private void saveTodoList(List<Todo> todoList){
      try {
         File file = new File("Todos.txt");
         FileOutputStream fos;

         fos = new FileOutputStream(file);

         ObjectOutputStream oos = new ObjectOutputStream(fos);		
         oos.writeObject(todoList);
         oos.close();
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
     public int updateTodo(Todo pTodo){
      List<Todo> todoList = getAllTodos();

      for(Todo todo: todoList){
         if(todo.getI() == pTodo.getI()){
            int index = todoList.indexOf(todo);			
            todoList.set(index, pTodo);
            saveTodoList(todoList);
            return 1;
         }
      }		
      return 0;
   }

     
}
