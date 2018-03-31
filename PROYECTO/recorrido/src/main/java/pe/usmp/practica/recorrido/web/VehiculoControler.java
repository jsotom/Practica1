package pe.usmp.practica.recorrido.web;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pe.usmp.practica.recorrido.model.Vehiculo;

public class VehiculoControler {

	public String initCreationForm(Model model) {
		model.addAttribute("vehiculo", new Vehiculo());
		return "conductorForm";
	}
	
	@PostMapping("/new")
	public String submitForm(@ModelAttribute Vehiculo conductor) {
		
		Double consumo;
		
		switch(conductor.getVehiculo()) {
		case "Marca1":
			consumo = conductor.getRecorrido()/40.0;
			conductor.setConsumo(consumo);
			break;
		case "Marca2":
			consumo = conductor.getRecorrido()/35.0;
			conductor.setConsumo(consumo);
			break;
		case "Marca3":
			consumo = conductor.getRecorrido()/45.0;
			conductor.setConsumo(consumo);
			break;
		}
		return "resultform";
	
}
}