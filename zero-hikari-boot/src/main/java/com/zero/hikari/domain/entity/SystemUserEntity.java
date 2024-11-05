package com.zero.hikari.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;


@Data
@Entity
public class SystemUserEntity {

    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    private String id;
    private String name;
    private Integer age;
    private Boolean sex;

}