package no.syver.morfi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import no.syver.morfi.model.Form;
import no.syver.morfi.repository.FormRepository;

@RestController
@RequestMapping("/form")
public class FormResource {

	@Autowired
	private FormRepository formRepository;
	
	@GetMapping("/forms")
	public List<Form> getAllForms() {
		return formRepository.findAll();
	}
	
}