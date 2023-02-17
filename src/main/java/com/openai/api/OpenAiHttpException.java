package com.openai.api;

public class OpenAiHttpException extends RuntimeException {

    public final int statusCode;
    public final String code;
    public final String param;

    public final String type;

    public OpenAiHttpException(OpenAiError error, Exception parent, int statusCode) {
        super(error.error.message, parent);
        // todo error.error looks dumb
        this.statusCode = statusCode;
        this.code = error.error.code;
        this.param = error.error.param;
        this.type = error.error.type;
    }
}
