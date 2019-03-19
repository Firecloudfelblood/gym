package com.erivalaxl.gym.controller;

import com.erivalaxl.gym.repositories.ClientRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class clientController {
    private ClientRepository repo;

    public clientController(ClientRepository repo) {
        this.repo = repo;
    }

    @RequestMapping("/clients")
    public String clients(Model model){
        model.addAttribute("clients", repo.findAll());
        return "clients";
    }

    @RequestMapping(value = "search", method = RequestMethod.GET)
    public String search(@RequestParam(value = "id", required = false) String id, Model model){
        model.addAttribute("clients",repo.findByIdentity(id));
        return "clients";
    }
}
