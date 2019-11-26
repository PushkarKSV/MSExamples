/**
 * 
 */
package com.kpr.convertcurrency.bean;

import java.math.BigDecimal;

/**
 * @author PushkarRajuKoppanath
 *
 */
public class CurrencyConversionBean {
	private String countryCode;
	private Double convFactor;
	private Double quantity;
	private Double totalCalculatedAmount;
	private int port;
	
	public CurrencyConversionBean() {
	}

	public CurrencyConversionBean(String countryCode, Double convFactor, Double quantity, Double totalCalculatedAmount,
			int port) {
		super();
		this.countryCode = countryCode;
		this.convFactor = convFactor;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.port = port;
	}

	
	
	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Double getConvFactor() {
		return convFactor;
	}

	public void setConvFactor(Double convFactor) {
		this.convFactor = convFactor;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount(Double totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((convFactor == null) ? 0 : convFactor.hashCode());
		result = prime * result + ((countryCode == null) ? 0 : countryCode.hashCode());
		result = prime * result + port;
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((totalCalculatedAmount == null) ? 0 : totalCalculatedAmount.hashCode());
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
		CurrencyConversionBean other = (CurrencyConversionBean) obj;
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
		if (port != other.port)
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (totalCalculatedAmount == null) {
			if (other.totalCalculatedAmount != null)
				return false;
		} else if (!totalCalculatedAmount.equals(other.totalCalculatedAmount))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CurrencyConversionBean [countryCode=" + countryCode + ", convFactor=" + convFactor + ", quantity="
				+ quantity + ", totalCalculatedAmount=" + totalCalculatedAmount + ", port=" + port + "]";
	}

	
	
	
}
