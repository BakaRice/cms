package com.ricemarch.cms.dao.repository;

import com.ricemarch.cms.dao.dataobject.sys.SysReqLog;
import com.ricemarch.cms.dao.mysql.crm.write.dao.sys.SysReqLogWriteMapper;
import org.springframework.stereotype.Repository;

/**
 * @Description: 請求日志 數據交互層
 * @author: tanwentao
 * @date: 2021/3/4
 */
@Repository
public class SysReqLogWriteRepository extends BaseRepository<SysReqLogWriteMapper, SysReqLog> {
}
