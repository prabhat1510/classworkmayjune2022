package com.training.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.demo.entities.Company;
import com.training.demo.service.CompanyService;

/**
 * import org.springframework.web.bind.annotation.RestController;
 * 
 * @RestController public class CompanyController { //URL -
 *                 http://localhost:8080/greet
 * @RequestMapping(value ="/greet", method= RequestMethod.GET) public String
 *                       greetings() { return "Hello Everyone Accept greetings
 *                       from company class"; }
 * 
 *                       }
 **/

@Controller
public class CompanyController {
	@Autowired
	CompanyService companyService;

	// URL - http://localhost:8080/greet
	@RequestMapping(value = "/greet", method = RequestMethod.GET)
	public ModelAndView greetings() {
		Map<String, String> model = new HashMap<String, String>();
		model.put("greetMsg", "Hello Everyone Accept greetings from company class");

		ModelAndView modelAndView = new ModelAndView("greeting", model);
		return modelAndView;
	}

	// URL - http://localhost:8080/companies
	@RequestMapping(value = "/companies", method = RequestMethod.GET)
	public ModelAndView getCompanies() {
		List<Company> comapnies = companyService.getAllCompanies();
		Map<String, List<Company>> model = new HashMap<String, List<Company>>();

		model.put("allCompanies", comapnies);

		ModelAndView modelAndView = new ModelAndView("companyinfo", model);
		return modelAndView;
	}

	// URL- http://localhost:8080/addcompany --- Using post man send data in Request
	// Body of http request
	@RequestMapping(value = "/addcompany", method = RequestMethod.POST)
	public ModelAndView addCompany(@RequestBody Company company) {

		String message = companyService.addCompany(company);
		Map<String, String> model = new HashMap<String, String>();
		model.put("message", message);
		ModelAndView modelAndView = new ModelAndView("success", model);
		return modelAndView;
	}

	// GetCompanyForm- First empty form will be renedered
	@GetMapping("/companyform")
	public ModelAndView getCompanyForm(@ModelAttribute Company company) {
		ModelAndView modelAndView = new ModelAndView("companyform");
		return modelAndView;
	}

	// On submitting the form -- on click submit button below method is called
	@RequestMapping(value = "/savecompany", method = RequestMethod.POST)
	public ModelAndView saveCompany(@ModelAttribute Company company) {

		String message = companyService.addCompany(company);
		Map<String, String> model = new HashMap<String, String>();
		model.put("message", message);
		ModelAndView modelAndView = new ModelAndView("success", model);
		return modelAndView;
	}
}