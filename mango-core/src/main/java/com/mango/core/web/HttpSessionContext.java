package com.mango.core.web;

import javax.servlet.http.HttpSession;


/**
 * @author : xs.Liu
 * @date: 2020-12-01
 */
public class HttpSessionContext {

    private static ThreadLocal<HttpSession> tl = new ThreadLocal<HttpSession>();

    public static void put(HttpSession s) {
        tl.set(s);
    }

    public static HttpSession get() {
        return tl.get();
    }

    public static void remove() {
        tl.remove();
    }

}
