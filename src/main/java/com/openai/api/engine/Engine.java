
package com.openai.api.engine;
import lombok.Data;

@Deprecated
@Data
public class Engine {

    public String id;
    public String object;
    
    public String owner;
    public boolean ready;
}
