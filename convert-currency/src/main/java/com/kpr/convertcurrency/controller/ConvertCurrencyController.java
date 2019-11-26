/**
 * 
 */
package com.kpr.convertcurrency.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.kpr.convertcurrency.bean.CurrencyConversionBean;

/**
 * @author PushkarRajuKoppanath
 *
 */
@RestController
public class ConvertCurrencyController {
	
	@Autowired
	private CurrencyConversionFeignProxy proxy;
	
	@GetMapping("/converedcurrency/{countryCode}/{amount}")
	public CurrencyConversionBean convertCurrency(@PathVariable String countryCode, @PathVariable Double amount) {
		Map<String, String> uriVariables = new HashMap<String, String>();
	    uriVariables.put("countryCode", countryCode);
	    
		ResponseEntity<CurrencyConversionBean> responseEntity 
			= new RestTemplate().getForEntity("http://localhost:8080/conversionfactors/{countryCode}", CurrencyConversionBean.class, uriVariables);
		
		System.out.println("---------- Calling MS1 -------");
		CurrencyConversionBean response = responseEntity.getBody();
		System.out.println("Response :"+response.toString());
		
		return new CurrencyConversionBean(response.getCountryCode(), response.getConvFactor(), amount,
		       (amount*response.getConvFactor()), response.getPort());
	}
	
	@GetMapping("/converedcurrency-feign/{countryCode}/{amount}")
	public CurrencyConversionBean convertCurrencyFeign(@PathVariable String countryCode, @PathVariable Double amount) {

		System.out.println("---------- Calling MS1 through Feign client -------");
		CurrencyConversionBean response = proxy.getConvertedCurrency(countryCode);
		System.out.println("Response :"+response.toString());
		
		return new CurrencyConversionBean(response.getCountryCode(), response.getConvFactor(), amount,
		       (amount*response.getConvFactor()), response.getPort());
	}
}
