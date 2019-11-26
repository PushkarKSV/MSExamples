/**
 * 
 */
package com.kpr.curconversionfactor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kpr.curconversionfactor.domain.ConversionFactor;
import com.kpr.curconversionfactor.service.CurConversionFactorService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author PushkarRajuKoppanath
 *
 */
@RestController
public class CurConversionFactorController {
	@Autowired
	CurConversionFactorService curConversionFactorService;
	
	@GetMapping("/conversionfactors/{countryCode}")
	@HystrixCommand(fallbackMethod = "getDefaultConvertedCurrency")
	public ConversionFactor getConvertedCurrency(@PathVariable String countryCode) {
		if(countryCode!= null && countryCode.length()==3)
			return curConversionFactorService.getConversionFactor(countryCode);
		else
			throw new RuntimeException();
	}
	
	public ConversionFactor getDefaultConvertedCurrency(@PathVariable String countryCode) {
		return new ConversionFactor("INR","India",1.0d, "9999");
	}
	
	@GetMapping("/conversionfactors")
	public List getAllConversionFactors() {
		return curConversionFactorService.getAllConversionFactors();
	}
	
	@PostMapping("/conversionfactors")
	public void addConversionFactor(@RequestBody ConversionFactor conFactor) {
		curConversionFactorService.addConversionFactor(conFactor);
	}
	
	@PutMapping("/conversionfactors/{countryCode}")
	public void updateConversionFactor(@RequestBody ConversionFactor conFactor,@RequestParam String countryCode) {
		curConversionFactorService.updateConversionFactor(conFactor,countryCode);
	}
	
	@DeleteMapping("/conversionfactors/{countryCode}")
	public void deleteConversionFactor(@PathVariable String countryCode) {
		curConversionFactorService.deleteConversionFactor(countryCode);
	}
}
