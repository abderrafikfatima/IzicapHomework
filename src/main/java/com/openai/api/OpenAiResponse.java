
package com.openai.api;
import lombok.Data;

import java.util.List;

/**
 * A wrapper class to fit the OpenAI engine and search endpoints
 */
@Data
public class OpenAiResponse<T> {
    public List<T> data;
    public String object;
}
