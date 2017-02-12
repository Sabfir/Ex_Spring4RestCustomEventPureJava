package com.opinta.service;

import com.opinta.event.SysLogEvent;
import com.opinta.model.SysLog;

import java.util.List;

public interface SysLogService {
    List<SysLog> getAll();
    void save(SysLogEvent event);
}
