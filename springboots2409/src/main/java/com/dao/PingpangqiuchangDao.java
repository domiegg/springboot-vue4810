package com.dao;

import com.entity.PingpangqiuchangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PingpangqiuchangVO;
import com.entity.view.PingpangqiuchangView;


/**
 * 乒乓球场
 * 
 * @author 
 * @email 
 * @date 2022-05-16 11:17:23
 */
public interface PingpangqiuchangDao extends BaseMapper<PingpangqiuchangEntity> {
	
	List<PingpangqiuchangVO> selectListVO(@Param("ew") Wrapper<PingpangqiuchangEntity> wrapper);
	
	PingpangqiuchangVO selectVO(@Param("ew") Wrapper<PingpangqiuchangEntity> wrapper);
	
	List<PingpangqiuchangView> selectListView(@Param("ew") Wrapper<PingpangqiuchangEntity> wrapper);

	List<PingpangqiuchangView> selectListView(Pagination page,@Param("ew") Wrapper<PingpangqiuchangEntity> wrapper);
	
	PingpangqiuchangView selectView(@Param("ew") Wrapper<PingpangqiuchangEntity> wrapper);
	

}
