package borkaugroup.phonedirectory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SubscriberController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allSubs() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("subscribers");
        return modelAndView;
    }
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView editPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }
}