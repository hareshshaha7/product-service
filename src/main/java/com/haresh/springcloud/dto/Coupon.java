/**
 * 
 */
package com.haresh.springcloud.dto;

import java.math.BigDecimal;

/**
 * @author hudaysha
 *
 */
public class Coupon {
	private long id;
	private String code;
	private BigDecimal discount;
	private String expDate;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the couponCode
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param couponCode the couponCode to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the discount
	 */
	public BigDecimal getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	/**
	 * @return the expDate
	 */
	public String getExpDate() {
		return expDate;
	}

	/**
	 * @param expDate the expDate to set
	 */
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
}
