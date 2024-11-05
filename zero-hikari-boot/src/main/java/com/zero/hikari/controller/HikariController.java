package com.zero.hikari.controller;

import com.zero.hikari.domain.entity.SystemUserEntity;
import com.zero.hikari.repository.SystemUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HikariController {

    SystemUserRepository systemUserRepository;

    @Autowired
    public HikariController(SystemUserRepository systemUserRepository) {
        this.systemUserRepository = systemUserRepository;
    }

    @RequestMapping("/add")
    public SystemUserEntity add(String name) {
        SystemUserEntity systemUserEntity = new SystemUserEntity();
        systemUserEntity.setName(name);
        return systemUserRepository.save(systemUserEntity);
    }

    @RequestMapping("/list")
    public Iterable<SystemUserEntity> list() {
        Iterable<SystemUserEntity> all = systemUserRepository.findAll();
        return all;
    }
}