/**
 * 
 */
package com.kpr.convertcurrency.controller;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.kpr.convertcurrency.bean.CurrencyConversionBean;

/**
 * @author PushkarRajuKoppanath
 *
 */
//@FeignClient(name = "CurrencyConversionFactor",url = "localhost:8080")
@FeignClient(name = "CurrencyConversionFactor")
@RibbonClient(name = "CurrencyConversionFactor")
public interface CurrencyConversionFeignProxy {
	@GetMapping("/conversionfactors/{countryCode}") 
	public CurrencyConversionBean getConvertedCurrency(@PathVariable String countryCode);
}
