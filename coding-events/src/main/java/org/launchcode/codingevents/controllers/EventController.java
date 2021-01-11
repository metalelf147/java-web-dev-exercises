package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

@GetMapping
public String displayAllEvents(Model model){
    List<String> events = new ArrayList<>();
    events.add("Coding Queens");
    events.add("Heck yeah, JavaScript");
    events.add("Java is to JavaScript what Ham is to Hamster");
    model.addAttribute("events", events);
    return "events/index";
}

@GetMapping("create") //lives at /events/create=
public String renderCreateEventForm(){
    return "events/create";
}

}
