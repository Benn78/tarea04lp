package com.example.tarea04lp.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.tarea04lp.dao.Todo;
import com.example.tarea04lp.entity.AlumnosAnioInicio;


@Component
public class AlumnosAnioInicioDaoImpl implements Todo<AlumnosAnioInicio>{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<AlumnosAnioInicio> readAll() {
		String query = "";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<AlumnosAnioInicio>(AlumnosAnioInicio.class));
	}
}
