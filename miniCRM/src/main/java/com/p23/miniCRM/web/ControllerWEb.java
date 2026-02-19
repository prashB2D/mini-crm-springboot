package com.p23.miniCRM.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.p23.miniCRM.model.Customer;
import com.p23.miniCRM.serivce.RepoOpartion;

@Controller
public class ControllerWEb {
	@Autowired
	private RepoOpartion op;
     
	
	@GetMapping("/cx-info")
	public String costmerFullingo(Model modle) {
		List<Customer> a = op.getCFullinfo();
		modle.addAttribute("Cinfo",a);
		return "costmer-info";
	}
	
	@GetMapping("/show-form")
	public String showForm(Model model)
	{
		model.addAttribute("customer", new Customer());
		return "showform";
	}
	
	@PostMapping("/register-cx")
	public String registerCx(@ModelAttribute("customer")Customer customer, Model model)
	{
		op.Cadd(customer);
		return "redirect:/cx-info";
	}
	
	@GetMapping("/update-form")
	public String updateCxInfo(@RequestParam("cxid")Integer cxid, Model model)
	{
		Customer cx=op.CgetById(cxid);
		model.addAttribute("customer", cx);
		return "updateform";
	}
	
	@GetMapping("/delete-data")
	public String DeleteCxInfo(@RequestParam("cxid")Integer cxid)
	{
		System.out.println("/delete-data");
		System.out.println(cxid);
		op.Cdelte(cxid);
	
		System.out.println("Deleted");
		return "redirect:/cx-info";
	}
	
	
	
}
