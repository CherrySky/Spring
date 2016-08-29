package com.sdomain.springmvc.controller;

import com.sdomain.springmvc.model.Receipt;
import com.sdomain.springmvc.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping("/receipt")
public class ReceiptController {

	@Autowired
	ReceiptService service;
	
	@Autowired
	MessageSource messageSource;

	@RequestMapping(method = RequestMethod.GET)
	public String listReceipt(ModelMap model) {
		List<Receipt> receipts = service.findAllReceipts();
		model.addAttribute("receipts", receipts);
		return "receipts";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String newReceipt(ModelMap model) {
		Receipt receipt = new Receipt();
		model.addAttribute("receipt", receipt);
		model.addAttribute("edit", false);
		return "registration";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String saveReceipt(@Valid Receipt receipt, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "registration";
		}

		service.saveReceipt(receipt);

		model.addAttribute("success", "Receipt " + receipt.getProductName() + " registered successfully");
		return "success";
	}

	@RequestMapping(value = { "/edit-{id}-receipt" }, method = RequestMethod.POST)
	public String updateReceipt(@Valid Receipt receipt, BindingResult result,
							  ModelMap model) {

		if (result.hasErrors()) {
			return "registration";
		}

//		FieldError ssnError =new FieldError("employee","ssn",messageSource.getMessage("non.unique.ssn", new String[]{employee.getSsn()}, Locale.getDefault()));
//		result.addError(ssnError);
//		return "registration";

		service.updateReceipt(receipt);

		model.addAttribute("success", "Receipt " + receipt.getProductName() + " registered successfully");
		return "success";
	}

	@RequestMapping(value = { "/edit-{id}-receipt" }, method = RequestMethod.GET)
	public String editReceipt(@PathVariable String id, ModelMap model) {
		Receipt receipt = service.findById(Integer.parseInt(id));
		model.addAttribute("receipt", receipt);
		model.addAttribute("edit", true);
		return "registration";
	}
	
	@RequestMapping(value = { "/delete-{id}-receipt" }, method = RequestMethod.GET)
	public String deleteReceipt(@PathVariable String id) {
		service.deleteReceiptById(id);
		return "redirect:/receipt";
	}

}
