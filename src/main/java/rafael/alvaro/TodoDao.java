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
 * @author rafael
 */
public class TodoDao {

    static List<Todo> todoList = new ArrayList<Todo>();

   // metodo para retornar todos os todos
    public List<Todo> getAllTodos() {
        // se a lista estiver vazia adiciona um item nela
        if (todoList == null || todoList.size() == 0) {
            Todo todo = new Todo(1, "Rafael");
            todoList.add(todo);
        }

        return todoList;
    }
    //metodo de adição de novo item a lista

    public int updateTodo(Todo pTodo) {

        todoList.add(pTodo);
        return 1;

    }

}
