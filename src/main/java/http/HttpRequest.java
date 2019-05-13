package http;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;

public class HttpRequest {
    private static final Logger log = LoggerFactory.getLogger(HttpRequest.class);

    public HttpRequest(InputStream is) {

    }

    public String getMethod() {
        return null;
    }

    public String getPath() {
        return null;
    }

    public String getHeader(String name) {
        return null;
    }

    public String getParameter(String name) {
        return null;
    }
}
