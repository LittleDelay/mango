package com.mango.core.web;

import javax.servlet.http.HttpSession;

/**
 *  @{# HttpSessionContext.java Create on 2019年9月23日 下午2:15:47
 * <p>
 *
 * </p>
 * @author <a href="mailto:baiyujie@gmail.com">baiyujie</a>
 * @version v 1.0.0
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
