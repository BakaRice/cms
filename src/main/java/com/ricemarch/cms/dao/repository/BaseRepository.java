package com.ricemarch.cms.dao.repository;

import com.baomidou.mybatisplus.entity.TableInfo;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.mapper.SqlHelper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.toolkit.MapUtils;
import com.baomidou.mybatisplus.toolkit.ReflectionKit;
import com.baomidou.mybatisplus.toolkit.StringUtils;
import com.baomidou.mybatisplus.toolkit.TableInfoHelper;
import org.apache.ibatis.jdbc.RuntimeSqlException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @Description: 基礎repository
 * @author: tanwentao
 * @date: 2021/3/4
 */
public class BaseRepository<M extends BaseMapper<T>, T> {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    protected M baseMapper;

    /**
     * <p>
     * 判断数据库操作是否成功
     * </p>
     * <p>
     * 注意！！ 该方法为 Integer 判断，不可传入 int 基本类型
     * </p>
     *
     * @param result 数据库操作返回影响条数
     * @return boolean
     */
    protected static boolean retBool(Integer result) {
        return SqlHelper.retBool(result);
    }

    /**
     * 插入对象,忽略null值
     *
     * @param entity 实体对象
     * @return
     */

    public boolean saveIgnoreNull(T entity) {
        return retBool(baseMapper.insert(entity));
    }

    /**
     * 插入对象
     *
     * @param entity 实体对象
     * @return
     */

    public boolean save(T entity) {
        return retBool(baseMapper.insertAllColumn(entity));
    }

    /**
     * 插入或更新,判断主键值存在则更新,否则插入
     *
     * @param entity 实体对象
     * @return boolean
     * @throws RuntimeSqlException 未找到主键
     */


    public boolean saveOrUpdate(T entity) {
        if (null != entity) {
            Class<?> cls = entity.getClass();
            TableInfo tableInfo = TableInfoHelper.getTableInfo(cls);
            if (null != tableInfo && StringUtils.isNotEmpty(tableInfo.getKeyProperty())) {
                Object idVal = ReflectionKit.getMethodValue(cls, entity, tableInfo.getKeyProperty());
                if (idVal == null || "".equals(idVal)) {
                    return save(entity);
                } else {
                    return updateById(entity);
                }
            } else {
                throw new RuntimeSqlException("未找到主键id");
            }
        }
        return false;
    }

    /**
     * 按主键删除
     *
     * @param id 主键
     * @return
     */

    public boolean deleteById(Serializable id) {
        return retBool(baseMapper.deleteById(id));
    }

    /**
     * 按条件删除
     *
     * @param columnMap 表字段 map 对象
     * @return
     * @throws RuntimeSqlException 删除条件columnMap不能为空
     */

    public boolean deleteByMap(Map<String, Object> columnMap) {
        if (MapUtils.isEmpty(columnMap)) {
            throw new RuntimeSqlException("删除条件columnMap不能为空.");
        }
        return retBool(baseMapper.deleteByMap(columnMap));
    }

    /**
     * 按条件删除
     *
     * @param wrapper 条件对象封装
     * @return
     */

    public boolean delete(Wrapper<T> wrapper) {
        return retBool(baseMapper.delete(wrapper));
    }

    /**
     * 按主键id批量删除
     *
     * @param idList id列表
     * @return
     */

    public boolean deleteByIds(List<? extends Serializable> idList) {
        return retBool(baseMapper.deleteBatchIds(idList));
    }

    /**
     * 按主键更新
     *
     * @param entity 待更新实体对象
     * @return
     */

    public boolean updateById(T entity) {
        return retBool(baseMapper.updateAllColumnById(entity));
    }

    /**
     * 按主键更新,忽略空值
     *
     * @param entity 待更新实体对象
     * @return
     */

    public boolean updateByIdIgnoreNull(T entity) {
        return retBool(baseMapper.updateById(entity));
    }

    /**
     * 按条件更新
     *
     * @param entity  待更新实体对象
     * @param wrapper 条件对象封装
     * @return
     */

    public boolean update(T entity, Wrapper<T> wrapper) {
        return retBool(baseMapper.update(entity, wrapper));
    }

    /**
     * 按id查询
     *
     * @param id
     * @return
     */

    public T getById(Serializable id) {
        return baseMapper.selectById(id);
    }

    /**
     * 按id列表查询
     *
     * @param idList id列表
     * @return
     */

    public List<T> getByIds(List<? extends Serializable> idList) {
        return baseMapper.selectBatchIds(idList);
    }

    /**
     * 按条件查询
     *
     * @param columnMap 表字段 map 对象
     * @return
     */

    public List<T> selectByMap(Map<String, Object> columnMap) {
        return baseMapper.selectByMap(columnMap);
    }

    /**
     * 按条件查询单一对象
     *
     * @param wrapper 条件对象封装
     * @return
     */

    public T selectOne(Wrapper<T> wrapper) {
        return SqlHelper.getObject(baseMapper.selectList(wrapper));
    }


    public Map<String, Object> selectMap(Wrapper<T> wrapper) {
        return SqlHelper.getObject(baseMapper.selectMaps(wrapper));
    }


    public Object selectObj(Wrapper<T> wrapper) {
        return SqlHelper.getObject(baseMapper.selectObjs(wrapper));
    }


    public int selectCount(Wrapper<T> wrapper) {
        return SqlHelper.retCount(baseMapper.selectCount(wrapper));
    }


    public List<T> selectList(Wrapper<T> wrapper) {
        return baseMapper.selectList(wrapper);
    }


    @SuppressWarnings("unchecked")
    public Page<T> selectPage(Page<T> page) {
        return selectPage(page, Condition.EMPTY);
    }


    public List<Map<String, Object>> selectMaps(Wrapper<T> wrapper) {
        return baseMapper.selectMaps(wrapper);
    }


    public List<Object> selectObjs(Wrapper<T> wrapper) {
        return baseMapper.selectObjs(wrapper);
    }


    @SuppressWarnings({"rawtypes", "unchecked"})
    public Page<Map<String, Object>> selectMapsPage(Page page, Wrapper<T> wrapper) {
        SqlHelper.fillWrapper(page, wrapper);
        page.setTotal(selectCount(wrapper));
        page.setRecords(baseMapper.selectMapsPage(page, wrapper));
        return page;
    }


    public Page<T> selectPage(Page<T> page, Wrapper<T> wrapper) {
        SqlHelper.fillWrapper(page, wrapper);
        page.setTotal(selectCount(wrapper));
        page.setRecords(baseMapper.selectPage(page, wrapper));
        return page;
    }

}