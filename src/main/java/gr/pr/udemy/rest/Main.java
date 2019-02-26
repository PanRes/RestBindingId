package gr.pr.udemy.rest;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		try {
			ObjectMapper mapper = new ObjectMapper();

			Student student = mapper.readValue(new File("C:\\Dev\\VivaCom\\vDocs 35794 + 35184\\RestBindingId\\src\\main\\resources\\jsons\\PRStudentFull.json"),Student.class);

			System.out.println(student);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}