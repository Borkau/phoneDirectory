package borkaugroup.phonedirectory.controller;

import borkaugroup.phonedirectory.model.Subscriber;
import borkaugroup.phonedirectory.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SubscriberController {

    private SubscriberService subscriberService;

    @Autowired
    public void setSubscriberService(SubscriberService subscriberService) {
        this.subscriberService = subscriberService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allSubs() {
        List<Subscriber> subscribers = subscriberService.allSubs();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("subscribers");
        modelAndView.addObject("subscriberList", subscribers);
        return modelAndView;
    }
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editPage(@PathVariable("id") int id) {
        Subscriber subscriber = subscriberService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        modelAndView.addObject("subscriber", subscriber);
        return modelAndView;
    }
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView editSubscriber(@ModelAttribute("subscriber") Subscriber subscriber) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        subscriberService.edit(subscriber);
        return modelAndView;
    }
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addSubscriber(@ModelAttribute("subscriber") Subscriber subscriber) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        subscriberService.add(subscriber);
        return modelAndView;
    }
    @RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteSubscriber(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        Subscriber film = subscriberService.getById(id);
        subscriberService.delete(film);
        return modelAndView;
    }
}