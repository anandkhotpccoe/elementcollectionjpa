package com.example.elementcollection.model;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Car {

	
		@Id
		private Long id;
			
		private String name;
		
		
		@ElementCollection
		@Column(name = "type", nullable = false)
		@CollectionTable(name = "car_types", joinColumns = {@JoinColumn(name = "car_id")})
		private Set<Type> types;


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public Set<Type> getTypes() {
			return types;
		}


		public void setTypes(Set<Type> types) {
			this.types = types;
		}
		
		
		
}
