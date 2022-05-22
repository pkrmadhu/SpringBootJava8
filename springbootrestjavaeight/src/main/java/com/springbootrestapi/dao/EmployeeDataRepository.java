package com.springbootrestapi.dao;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import javax.persistence.Id;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import com.springbootrestapi.model.Employee;

@Repository
public class EmployeeDataRepository implements JpaRepository<Employee, Id>{

	@Override
	public Page<Employee> findAll(Pageable pageable) {
		
		return null;
	}

	@Override
	public <S extends Employee> S save(S entity) {
		
		return null;
	}

	@Override
	public Optional<Employee> findById(Id id) {
		
		return null;
	}

	@Override
	public boolean existsById(Id id) {
		
		return false;
	}

	@Override
	public long count() {
		
		return 0;
	}

	@Override
	public void deleteById(Id id) {
		
		
	}

	@Override
	public void delete(Employee entity) {
		
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Id> ids) {
		
		
	}

	@Override
	public void deleteAll(Iterable<? extends Employee> entities) {
		
		
	}

	@Override
	public void deleteAll() {
		
		
	}

	@Override
	public <S extends Employee> Optional<S> findOne(Example<S> example) {
		
		return null;
	}

	@Override
	public <S extends Employee> Page<S> findAll(Example<S> example, Pageable pageable) {
		
		return null;
	}

	@Override
	public <S extends Employee> long count(Example<S> example) {
		
		return 0;
	}

	@Override
	public <S extends Employee> boolean exists(Example<S> example) {
		
		return false;
	}

	@Override
	public <S extends Employee, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		
		return null;
	}

	@Override
	public List<Employee> findAll() {
		
		return null;
	}

	@Override
	public List<Employee> findAll(Sort sort) {
		
		return null;
	}

	@Override
	public List<Employee> findAllById(Iterable<Id> ids) {
		
		return null;
	}

	@Override
	public <S extends Employee> List<S> saveAll(Iterable<S> entities) {
		
		return null;
	}

	@Override
	public void flush() {
		
		
	}

	@Override
	public <S extends Employee> S saveAndFlush(S entity) {
		
		return null;
	}

	@Override
	public <S extends Employee> List<S> saveAllAndFlush(Iterable<S> entities) {
		
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Employee> entities) {
		
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Id> ids) {
		
		
	}

	@Override
	public void deleteAllInBatch() {
		
		
	}

	@Override
	public Employee getOne(Id id) {
		
		return null;
	}

	@Override
	public Employee getById(Id id) {
		
		return null;
	}

	@Override
	public Employee getReferenceById(Id id) {
		
		return null;
	}

	@Override
	public <S extends Employee> List<S> findAll(Example<S> example) {
		
		return null;
	}

	@Override
	public <S extends Employee> List<S> findAll(Example<S> example, Sort sort) {
		
		return null;
	}

}
