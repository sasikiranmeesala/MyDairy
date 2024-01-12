package com.springboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.entities.Entry;

public interface EntryRepository extends JpaRepository<Entry, Long> {

	@Query(value="select * from entry where userid=:id",nativeQuery=true)
	public List<Entry> findbyuserid(long id);

}
