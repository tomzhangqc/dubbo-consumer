package com.backstage.dao;

import org.apache.ibatis.annotations.Mapper;

import com.backstage.model.Blea;

@Mapper
public interface BleaDao {
	public Blea findById();
}
