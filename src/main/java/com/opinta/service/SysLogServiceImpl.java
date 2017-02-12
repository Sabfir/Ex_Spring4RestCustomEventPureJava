package com.opinta.service;

import com.opinta.dao.SysLogDao;
import com.opinta.event.SysLogEvent;
import com.opinta.model.SysLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class SysLogServiceImpl implements SysLogService {
    @Autowired
    SysLogDao sysLogDao;

    @Override
    @Transactional
    public List<SysLog> getAll() {
        return sysLogDao.getAll();
    }

    @Override
    @Transactional
    public void save(SysLogEvent event) {
        sysLogDao.save(toSysLog(event));
    }

    private SysLog toSysLog(SysLogEvent event) {
        SysLog sysLog = new SysLog();
        sysLog.setDate(new Date());
        sysLog.setLogger(event.getSource().getClass().getName());
        sysLog.setMessage(event.getMessage());

        return sysLog;
    }
}
