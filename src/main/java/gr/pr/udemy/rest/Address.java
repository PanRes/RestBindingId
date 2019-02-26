package gr.pr.udemy.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Address {

	private String street;
	private String city;
	private String state;
	private int zip;
	private String country;

}
