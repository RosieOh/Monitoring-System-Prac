package com.monitoring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogController {

    /**
     * @return Test용 GET 요청의 응답 결과입니다.
     */

    @GetMapping("/log")
    public String log() {
        log.trace("TRACE LOG");
        log.debug("DEBUG LOG");
        log.info("INFO LOG");
        log.warn("WARN LOG");
        log.error("ERROR LOG");

        return "OK";
    }

}
