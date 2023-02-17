
package com.openai.api.completion;
import com.theokanning.openai.Usage;
import lombok.Data;

import java.util.List;

@Data
public class CompletionResult {
    String id;
    String object;
    long created;
    String model;
    List<CompletionChoice> choices;
    Usage usage;
}
