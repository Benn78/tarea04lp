package com.example.tarea04lp.dao;

import java.util.List;

public interface Todo<T> {
	List<T> readAll();
}
