package com.example.tarea04lp.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.tarea04lp.dao.Todo;
import com.example.tarea04lp.entity.AlumnosMatriculados;
import com.example.tarea04lp.entity.EstudianteTelefono;

public class EstudianteTelefonoDaoImpl implements Todo<EstudianteTelefono>{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<EstudianteTelefono> readAll() {
		String query = "";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<EstudianteTelefono>(EstudianteTelefono.class));
	
	}
}
