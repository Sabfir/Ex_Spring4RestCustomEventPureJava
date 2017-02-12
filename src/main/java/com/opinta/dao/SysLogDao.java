package com.opinta.dao;

import com.opinta.model.SysLog;

import java.util.List;

public interface SysLogDao {
    List<SysLog> getAll();
    void save(SysLog sysLog);
}
