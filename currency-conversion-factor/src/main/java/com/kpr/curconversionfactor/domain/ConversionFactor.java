/**
 * 
 */
package com.kpr.curconversionfactor.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author PushkarRajuKoppanath
 *
 */
@Entity
public class ConversionFactor {
	
	@Id
	private String countryCode="";
	
	private String countryName="";
	private Double convFactor=1.0d;
	private String port="";
	
	
	public ConversionFactor(){
	}


	public ConversionFactor(String countryCode, String countryName, Double convFactor, String port) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.convFactor = convFactor;
		this.port = port;
	}


	public String getCountryCode() {
		return countryCode;
	}


	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}


	public String getCountryName() {
		return countryName;
	}


	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	public Double getConvFactor() {
		return convFactor;
	}


	public void setConvFactor(Double convFactor) {
		this.convFactor = convFactor;
	}


	public String getPort() {
		return port;
	}


	public void setPort(String port) {
		this.port = port;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((convFactor == null) ? 0 : convFactor.hashCode());
		result = prime * result + ((countryCode == null) ? 0 : countryCode.hashCode());
		result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
		result = prime * result + ((port == null) ? 0 : port.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConversionFactor other = (ConversionFactor) obj;
		if (convFactor == null) {
			if (other.convFactor != null)
				return false;
		} else if (!convFactor.equals(other.convFactor))
			return false;
		if (countryCode == null) {
			if (other.countryCode != null)
				return false;
		} else if (!countryCode.equals(other.countryCode))
			return false;
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;
		if (port == null) {
			if (other.port != null)
				return false;
		} else if (!port.equals(other.port))
			return false;
		return true;
	}

}
