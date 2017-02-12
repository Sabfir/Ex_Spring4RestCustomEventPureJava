package com.opinta.controller;

import com.opinta.model.SysLog;
import com.opinta.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SysLogController {
	@Autowired
	private SysLogService sysLogService;

	@GetMapping("/syslogs")
	public ResponseEntity<?> getCustomers() {
        List<SysLog> sysLogs = sysLogService.getAll();
		return new ResponseEntity<>(sysLogs, HttpStatus.OK);
	}
}
