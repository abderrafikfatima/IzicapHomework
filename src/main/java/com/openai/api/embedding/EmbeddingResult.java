package com.openai.api.embedding;

import com.openai.api.Usage;
import lombok.Data;

import java.util.List;

/**
 * An object containing a response from the answer api
 *
 * https://beta.openai.com/docs/api-reference/embeddings/create
 */
@Data
public class EmbeddingResult {
    String model;
    String object;
    List<Embedding> data;
    Usage usage;
}
