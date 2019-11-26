/**
 * 
 */
package com.kpr.curconversionfactor.repository;

import org.springframework.data.repository.CrudRepository;

import com.kpr.curconversionfactor.domain.ConversionFactor;

/**
 * @author PushkarRajuKoppanath
 *
 */
public interface CurConversionFactorRepository extends CrudRepository<ConversionFactor, String> {

}
