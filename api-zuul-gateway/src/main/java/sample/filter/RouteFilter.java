package sample.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RouteFilter extends ZuulFilter {
    private static Logger log = LoggerFactory.getLogger(RouteFilter.class);
    @Override
    public String filterType() {
        return "TEST ROUTE";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        log.info("Inside Route Filter");
        return null;
    }
}