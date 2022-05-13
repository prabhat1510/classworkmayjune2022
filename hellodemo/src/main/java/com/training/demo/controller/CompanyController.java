package com.training.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
		List<Company> companies = companyService.getAllCompanies();
		Map<String, List<Company>> model = new HashMap<String, List<Company>>();

		model.put("allCompanies", companies);

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
	
	/**
	 * Pass the data in url - So http default method will be called.
	 * http://localhost:8080/company?id=15    --Using @RequestParam
	 * http://localhost:8080/company/15   --- Using @PathVariable
	 * http://localhost:8080/company?id=15&name="Walmart" -- Using @RequestParam
	 */
	//http://localhost:8080/company/15 
	//@GetMapping("/company/{id}/{name}")
	//public ModelAndView getCompanyById(@PathVariable Integer id,@PathVariable String name) {
	@GetMapping("/company/{id}")
	public ModelAndView getCompanyById(@PathVariable Integer id) {
		
		Company comp = companyService.getCompnayById(id);
		Map<String, Company> model = new HashMap<String, Company>();

		model.put("company", comp);

		ModelAndView modelAndView = new ModelAndView("companydetail", model);
		return modelAndView;
	}
	
	//http://localhost:8080/getcompany?id=15
	//http://localhost:8080/getcompany?id=15&name="Rakesh"
	@GetMapping("/getcompany")
	public ModelAndView getCompanyByIdUsingRequestParam(@RequestParam(value = "id") Integer compId ) {
		Company comp = companyService.getCompnayById(compId);
		Map<String, Company> model = new HashMap<String, Company>();

		model.put("company", comp);

		ModelAndView modelAndView = new ModelAndView("companydetail", model);
		return modelAndView;
	}
	
	//http://localhost:8080/getcompanybyname?name="Rakesh"
	@GetMapping("/getcompanybyname")
	public ModelAndView getCompanyByIdUsingRequestParam(@RequestParam(value = "name") String name ) {
		Company comp = companyService.getCompanyByName(name);
		Map<String, Company> model = new HashMap<String, Company>();

		model.put("company", comp);

		ModelAndView modelAndView = new ModelAndView("companydetail", model);
		return modelAndView;
	}
	
	//http://localhost:8080/getcompanybyidnlocid?id=15&locId=1
	@GetMapping("/getcompanybyidnlocid")
	public ModelAndView getCompanyByIdUsingRequestParam(@RequestParam(value = "id") Integer id,@RequestParam(value = "locId") Integer locId ) {
		Company comp = companyService.getCompanyByIdAndLocationId(id,locId);
		Map<String, Company> model = new HashMap<String, Company>();

		model.put("company", comp);

		ModelAndView modelAndView = new ModelAndView("companydetail", model);
		return modelAndView;
	}
	
}