package com.hongzhou.models;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Bike {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty
	private Long id;
	@JsonProperty
	private String name;
	@JsonProperty
	private String email;
	@JsonProperty
	private String phone;
	@JsonProperty
	private String model;
	@JsonProperty
	private String serialNumber;
	@JsonProperty
	private BigDecimal purchasePrice;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yy")
	private Date purchaseDate;
	@JsonProperty
	private boolean contact;
}
