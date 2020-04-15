package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    /**
     * Handles requests that come into:
     * root context + "/vets", or
     * root context + "/vets/index", or
     * root context + "/vets/index.html"
     *
     * If we have logging enabled, we could see the following
     * console output:
     *
     * s.w.s.m.m.a.RequestMappingHandlerMapping :
     *   g.s.s.c.VetController:
     *   { [/vets, /vets/index, /vets/index.html]}: listVets()
     *
     * that describes how Spring's RequestMappingHandler
     * has mapped request paths to the {@code listVets()}
     * endpoint on the Controller.
     */
    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets() {

        return "vets/index";
    }
}
