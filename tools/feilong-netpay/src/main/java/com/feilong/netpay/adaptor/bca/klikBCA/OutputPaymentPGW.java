/**
 * Copyright (C) 2008 feilong (venusdrogon@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.netpay.adaptor.bca.klikBCA;

import java.io.Serializable;

/**
 * Payment Confirmation(output).
 * 
 * @author <a href="mailto:venusdrogon@163.com">金鑫</a>
 * @version 1.0 Mar 30, 2014 7:05:24 PM
 */
public class OutputPaymentPGW implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= 288232184048495608L;

	/** (Mandatory)The user id. */
	private String				userID;

	/** (Mandatory) The transaction no. */
	private String				transactionNo;

	/** (Mandatory)DD/mm/YYYY HH:MM:SS. */
	private String				transactionDate;

	/**
	 * (Mandatory)Value of the status field will be 00 if the transaction is successful, <br>
	 * and 01 if the transaction is failed. <br>
	 * The reason field can be used to indicate reason of failure, and will be shown to the user
	 */
	private String				status;

	/** (Mandatory). */
	private String				reason;

	/** Optional. */
	private String				additionalData;

	/**
	 * Gets the user id.
	 * 
	 * @return the userID
	 */
	public String getUserID(){
		return userID;
	}

	/**
	 * Sets the user id.
	 * 
	 * @param userID
	 *            the userID to set
	 */
	public void setUserID(String userID){
		this.userID = userID;
	}

	/**
	 * Gets the transaction no.
	 * 
	 * @return the transactionNo
	 */
	public String getTransactionNo(){
		return transactionNo;
	}

	/**
	 * Sets the transaction no.
	 * 
	 * @param transactionNo
	 *            the transactionNo to set
	 */
	public void setTransactionNo(String transactionNo){
		this.transactionNo = transactionNo;
	}

	/**
	 * Gets the dD/mm/YYYY HH:MM:SS.
	 * 
	 * @return the transactionDate
	 */
	public String getTransactionDate(){
		return transactionDate;
	}

	/**
	 * Sets the dD/mm/YYYY HH:MM:SS.
	 * 
	 * @param transactionDate
	 *            the transactionDate to set
	 */
	public void setTransactionDate(String transactionDate){
		this.transactionDate = transactionDate;
	}

	/**
	 * Gets the value of the status field will be 00 if the transaction is successful, <br>
	 * and 01 if the transaction is failed.
	 * 
	 * @return the status
	 */
	public String getStatus(){
		return status;
	}

	/**
	 * Sets the value of the status field will be 00 if the transaction is successful, <br>
	 * and 01 if the transaction is failed.
	 * 
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status){
		this.status = status;
	}

	/**
	 * Gets the (Mandatory).
	 * 
	 * @return the reason
	 */
	public String getReason(){
		return reason;
	}

	/**
	 * Sets the (Mandatory).
	 * 
	 * @param reason
	 *            the reason to set
	 */
	public void setReason(String reason){
		this.reason = reason;
	}

	/**
	 * Gets the optional.
	 * 
	 * @return the additionalData
	 */
	public String getAdditionalData(){
		return additionalData;
	}

	/**
	 * Sets the optional.
	 * 
	 * @param additionalData
	 *            the additionalData to set
	 */
	public void setAdditionalData(String additionalData){
		this.additionalData = additionalData;
	}
}
