package com.openai.api.model;

import lombok.Data;

import java.util.List;

/**
 * GPT-3 model details
 *
 * https://beta.openai.com/docs/api-reference/models
 */
@Data
public class Model {
    
    public String id;
    public String object;
    public String ownedBy;
    public List<Permission> permission;
    public String root;
    public String parent;
}
