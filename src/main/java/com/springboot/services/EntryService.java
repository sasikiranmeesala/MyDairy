package com.springboot.services;

import java.util.List;

import com.springboot.entities.Entry;


public interface EntryService {
	
	public Entry saveUser(Entry entry);
	public Entry updateUser(Entry entry);
	public void deleteUser(Entry entry);
	public Entry findbyid(long id);
	public List<Entry> finAll();
	public List<Entry> findbyuserid(long id);

}
