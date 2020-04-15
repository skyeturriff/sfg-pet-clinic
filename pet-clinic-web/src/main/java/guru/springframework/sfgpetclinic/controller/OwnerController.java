package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The root of all request paths handled by this Controller
 * is "/owners". So we prefix at the class-level.
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    /**
     * When combined with the request prefix declared at the
     * class level, handles requests that come into:
     *
     * root context + "/owners", or
     * root context + "/owners/index", or
     * root context + "/owners/index.html"
     *
     * If we have logging enabled, we could see the following
     * console output:
     *
     * s.w.s.m.m.a.RequestMappingHandlerMapping :
     *   g.s.s.c.OwnerController:
     *   { [/owners, /owners/index, /owners/index.html]}: listOwners()
     *
     * that describes how Spring's RequestMappingHandler has
     * mapped request paths to the {@code listOwners()}
     * endpoint on the Controller.
     */
    @RequestMapping({"", "/index", "/index.html"})
    public String listOwners() {

        return "owners/index";
    }
}
