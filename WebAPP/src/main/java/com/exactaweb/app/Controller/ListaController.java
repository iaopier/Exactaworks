package com.exactaweb.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ListaController {
	@GetMapping({"/", "/landing"})
    public String landing() {
        return "landing";
    }
}
