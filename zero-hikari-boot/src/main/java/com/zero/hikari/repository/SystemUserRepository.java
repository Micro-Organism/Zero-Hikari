package com.zero.hikari.repository;

import com.zero.hikari.domain.entity.SystemUserEntity;
import org.springframework.data.repository.CrudRepository;

public  interface SystemUserRepository extends CrudRepository<SystemUserEntity, String> {

}