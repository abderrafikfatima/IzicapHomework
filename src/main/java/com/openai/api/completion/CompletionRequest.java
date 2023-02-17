
package com.openai.api.completion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * A request for OpenAi to generate a predicted completion for a prompt.
 * All fields are nullable.
 *
 * https://beta.openai.com/docs/api-reference/completions/create
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CompletionRequest {

    String model;
    String prompt;
    Integer maxTokens;
    Double temperature;
    Double topP;
    Integer n;
    Boolean stream;
    Integer logprobs;
    Boolean echo;
    List<String> stop;
    Double presencePenalty;
    Double frequencyPenalty;
    Integer bestOf;
    Map<String, Integer> logitBias;
    String user;
}
