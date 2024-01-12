package com.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entities.Entry;
import com.springboot.repositories.EntryRepository;

@Service
public class EntryServiceImpl implements EntryService {

	@Autowired
	private EntryRepository entryRepository;
	
	@Override
	public Entry saveUser(Entry entry) {
		return entryRepository.save(entry);
	}

	@Override
	public Entry updateUser(Entry entry) {
		return entryRepository.save(entry);
	}

	@Override
	public void deleteUser(Entry entry) {
		entryRepository.delete(entry);
	}

	@Override
	public Entry findbyid(long id) {
		return entryRepository.findById(id).get();
	}

	@Override
	public List<Entry> finAll() {
		return entryRepository.findAll();
	}

	@Override
	public List<Entry> findbyuserid(long id) {
		return entryRepository.findbyuserid(id);
	}

}
