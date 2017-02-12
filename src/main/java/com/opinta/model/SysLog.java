package com.opinta.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity(name = "sys_log")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class SysLog {
    @Id
    @GeneratedValue
    private Integer id;
    private Date date;
    private String logger;
    private String message;
}
