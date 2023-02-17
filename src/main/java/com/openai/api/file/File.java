package com.openai.api.file;

import lombok.Data;

/**
 * A file uploaded to OpenAi
 *
 * https://beta.openai.com/docs/api-reference/files
 */
@Data
public class File {
    String id;
    String object;
    Long bytes;
    Long createdAt;
    String filename;
    String purpose;
}
