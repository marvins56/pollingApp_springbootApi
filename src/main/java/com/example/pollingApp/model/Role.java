package com.example.pollingApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import org.hibernate.annotations.NaturalId;

import jakarta.persistence.*;
@Entity
@Table(name = "roles")
public class Role {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Enumerated(EnumType.STRING)
	    @NaturalId
	    @Column(length = 60)
	    private RoleName name;

		public Role(RoleName name) {
			super();
			this.name = name;
		}

		public Role() {
		
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public RoleName getName() {
			return name;
		}

		public void setName(RoleName name) {
			this.name = name;
		}

	    
	    
}
