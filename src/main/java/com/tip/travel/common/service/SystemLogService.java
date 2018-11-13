package com.tip.travel.common.service;

import com.tip.travel.common.domain.SystemLog;

/**
 * @author brotherlu
 * @date 2018-11-13
 */
public interface SystemLogService {
    /**
     * save system log
     * @param log
     */
    void saveSystemLog(SystemLog log);
}
