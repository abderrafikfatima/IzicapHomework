package com.openai.api.embedding;

import lombok.Data;

import java.util.List;

/**
 * Represents an embedding returned by the embedding api
 *
 * https://beta.openai.com/docs/api-reference/classifications/create
 */
@Data
public class Embedding {
    String object;
    List<Double> embedding;
    Integer index;
}
