package com.zimo.guo.exception;

/**
 * Created by apple on 16/3/21.
 */
public class RequestIllegalException extends RuntimeException {

    public RequestIllegalException() {
        super();
    }

    public RequestIllegalException(final String message) {
        super(message);
    }

    public RequestIllegalException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public RequestIllegalException(final Throwable cause) {
        super(cause);
    }
}
