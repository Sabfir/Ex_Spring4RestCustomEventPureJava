package com.opinta.listener;

import com.opinta.event.SysLogEvent;
import com.opinta.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class SysLogListener {
    final SysLogService sysLogService;

    @Autowired
    public SysLogListener(SysLogService sysLogService) {
        this.sysLogService = sysLogService;
    }

    @Async
    @EventListener
    private void listenForEvents(SysLogEvent event) {
        sysLogService.save(event);
    }
}
