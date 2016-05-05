/*
 * Copyright 2016 alvaro.
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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author alvaro
 */
public class Todo {

    public int i;
    public String content;
//instaciando a classe e definindo os json a serem recebidos
    public Todo(@JsonProperty("i") int i, @JsonProperty("content") String content) {
        super();
        this.i = i;
        this.content = content;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
