package com.java8features.scenriocode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// For the given transaction data with (payer, payee, amount), calculate the total amount received by each payee.
//Here you have to use the grouping and Summing concept of Java 8.

public class TransactionManageGroupingBy {
	private String payer;
	private String payee;
	private Double amount;
	
	public TransactionManageGroupingBy(String payer, String payee, Double amount) {
		super();
		this.payer = payer;
		this.payee = payee;
		this.amount = amount;
	}

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public String getPayee() {
		return payee;
	}

	public void setPayee(String payee) {
		this.payee = payee;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<TransactionManageGroupingBy> tranlist = Arrays.asList(
				new TransactionManageGroupingBy("Infosys","Mrunal",21250.0),
				new TransactionManageGroupingBy("Infosys","Rohan",22500.0),
				new TransactionManageGroupingBy("Infosys","Shruti",25000.0),
				new TransactionManageGroupingBy("Infosys","Rohan",22500.0),
				new TransactionManageGroupingBy("Infosys","Shruti",25000.0));
		
		// 1st way using method reference
		
		   Map<String, Double> totalAmountReceivedByPayee1 = tranlist.stream()
	                .collect(Collectors.groupingBy(TransactionManageGroupingBy::getPayee, Collectors.summingDouble(TransactionManageGroupingBy::getAmount)));
	        System.out.println(totalAmountReceivedByPayee1);
	        
	        
	    // 2nd way using method ref & passing lambda as operation
	        
	      Map<String, Double> totalAmountReceivedByPayee2 = tranlist.stream()
	    		       .collect(Collectors.groupingBy(x->x.getPayee(), Collectors.summingDouble(x->x.getAmount())));
	      
	      System.out.println(totalAmountReceivedByPayee2);

	}

}
