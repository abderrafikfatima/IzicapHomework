package com.openai.api.embedding;

import lombok.*;

import java.util.List;

/**
 * Creates an embedding vector representing the input text.
 *
 * https://beta.openai.com/docs/api-reference/embeddings/create
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmbeddingRequest {

    /**
     * The name of the model to use.
     * Required if using the new v1/embeddings endpoint.
     */
    String model;
    @NonNull
    List<String> input;


    String user;
}
