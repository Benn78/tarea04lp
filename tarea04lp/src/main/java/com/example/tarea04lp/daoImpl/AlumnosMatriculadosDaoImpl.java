package com.example.tarea04lp.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.tarea04lp.dao.Todo;
import com.example.tarea04lp.entity.AlumnosMatriculados;

@Component
public class AlumnosMatriculadosDaoImpl implements Todo<AlumnosMatriculados>{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<AlumnosMatriculados> readAll() {
		String query = "";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<AlumnosMatriculados>(AlumnosMatriculados.class));
	}
}
