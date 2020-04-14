package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    /**
     * Handles requests that come into the root context,
     * (empty string or slash) or into the root context +
     * "/index" or "/index.html".
     *
     * If we have logging enabled, we could see the following
     * console output:
     *
     *  s.w.s.m.m.a.RequestMappingHandlerMapping :
     * 	g.s.s.c.IndexController:
     *        { [, /, /index, /index.html]}: index()
     *
     * that describes how Spring's RequestMappingHandler
     * has mapped paths to request endpoints on the
     * Controller.
     */
    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {
        return "index";
    }
}
