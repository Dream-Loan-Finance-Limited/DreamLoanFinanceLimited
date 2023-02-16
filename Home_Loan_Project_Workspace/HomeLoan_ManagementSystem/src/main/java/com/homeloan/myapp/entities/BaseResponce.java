package com.homeloan.myapp.entities;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponce<T> {

	@Id
	private Integer statusCode;
	private String msg;
	private T responceData;
}