package com.openai.api;

import lombok.Data;

/**
 * The OpenAI resources used by a request
 */
@Data
public class Usage {
    long promptTokens;
    long completionTokens;
    long totalTokens;
}
