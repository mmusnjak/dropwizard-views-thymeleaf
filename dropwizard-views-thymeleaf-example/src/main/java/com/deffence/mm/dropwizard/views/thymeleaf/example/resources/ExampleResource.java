package com.deffence.mm.dropwizard.views.thymeleaf.example.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.google.common.collect.Lists;

@Path("/")
public class ExampleResource {

	@GET
	public PersonView getPersons(){
		
		List<Person> pList = Lists.newArrayList();
		pList.add(new Person("persons:1",11));
		pList.add(new Person("persons:2",12));
		
		
		return new PersonView("person.html" ,new Person("person",9), pList);
	}
	
}
