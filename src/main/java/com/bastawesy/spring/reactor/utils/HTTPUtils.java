package com.bastawesy.spring.reactor.utils;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.Map;

/**
 * Util class to provide some rest util methods
 */
public class HTTPUtils {
    private HTTPUtils() {
        throw new IllegalStateException("Utility class");
    }


    /**
     * create empty http entity object
     *
     * @return HttpEntity instance
     */
    public static HttpEntity<Object> createHttpEntity() {
        return createHttpEntity(null);
    }


    /**
     * create http entity containing the passed headers data
     *
     * @param headers headers data
     * @return HttpEntity instance
     */
    public static HttpEntity<Object> createHttpEntity(Map<String, String> headers) {
        HttpHeaders requestHeaders = prepareRequestHeader(headers);
        return new HttpEntity<>(requestHeaders);
    }


    /**
     * create http entity containing the passed body
     *
     * @param body body data
     * @return HttpEntity instance
     */
    public static HttpEntity<Object> createHttpEntity(Object body) {
        return createHttpEntity(body, null);
    }


    /**
     * create http entity containing the passed headers data and the passed body
     *
     * @param headers headers data
     * @param body    body data
     * @return HttpEntity instance
     */
    public static HttpEntity<Object> createHttpEntity(Object body, Map<String, String> headers) {
        HttpHeaders requestHeaders = prepareRequestHeader(headers);
        return new HttpEntity<>(body, requestHeaders);
    }


    /**
     * Create HttpHeaders object from the passed headers map
     *
     * @param headers headers data
     * @return HttpHeaders instance
     */
    private static HttpHeaders prepareRequestHeader(Map<String, String> headers) {
        HttpHeaders requestHeader = new HttpHeaders();
        requestHeader.setContentType(MediaType.APPLICATION_JSON_UTF8);
        if (CommonUtils.isNotBlankOrNull(headers)) {
            for (Map.Entry<String, String> header : headers.entrySet()) {
                requestHeader.set(header.getKey(), header.getValue());
            }
        }
        return requestHeader;
    }

}
