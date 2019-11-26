/**
 * 
 */
package com.kpr.curconversionfactor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpr.curconversionfactor.domain.ConversionFactor;
import com.kpr.curconversionfactor.repository.CurConversionFactorRepository;

/**
 * @author PushkarRajuKoppanath
 *
 */
@Service
public class CurConversionFactorService {
	@Autowired
	CurConversionFactorRepository curConversionFactorRepository;
	
	public ConversionFactor getConversionFactor(String countryCode) {
		return (ConversionFactor) curConversionFactorRepository.findById(countryCode).orElseGet(ConversionFactor::new);
	}

	public void addConversionFactor(ConversionFactor conversionFactor) {
		curConversionFactorRepository.save(conversionFactor);
	}
	
	public void deleteConversionFactor(String countryCode) {
		curConversionFactorRepository.deleteById(countryCode);
	}
	
	public List getAllConversionFactors() {
		List conversionFactories = new ArrayList();
		curConversionFactorRepository.findAll().forEach(conversionFactories::add);
		return conversionFactories;
	}

	public void updateConversionFactor(ConversionFactor conversionFactor, String countryCode) {
		curConversionFactorRepository.save(conversionFactor);
	}
	
}
