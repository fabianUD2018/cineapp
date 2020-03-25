package net.itinajero.app.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String goHome(){
		return "home";
	}
	@RequestMapping(value ="/",  method=RequestMethod.GET)
	public String listHome (Model m ) {
		List<String> lista = new LinkedList<String>();
		lista.add("El hoyo");
		lista.add("el irlandes");
		lista.add("kill bill");
		lista.add("animales fantasticos");
		
		m.addAttribute("lista", lista);
		return "home";
	}
	@RequestMapping("/detalle")
	public String mostrarDetalle(Model m) {
		String nombre="La momia";
		String precio ="50 Pesos";
		m.addAttribute("nombre", nombre);
		m.addAttribute("precio", precio);
		return "detalle";
	}
}
