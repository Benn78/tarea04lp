package com.example.tarea04lp.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlumnosMatriculados implements Serializable{

	/**
	 * 
	 */ 
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String grado;
	private String curso;
	private String sexo;
	
	
}
