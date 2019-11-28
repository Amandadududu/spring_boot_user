package com.qf.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author ：lisuqin
 * @date ：Created in 2019/11/27 19:46
 */

public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
