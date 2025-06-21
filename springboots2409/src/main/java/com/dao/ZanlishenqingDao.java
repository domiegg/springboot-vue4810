package com.dao;

import com.entity.ZanlishenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZanlishenqingVO;
import com.entity.view.ZanlishenqingView;


/**
 * 暂离申请
 * 
 * @author 
 * @email 
 * @date 2022-05-16 11:17:23
 */
public interface ZanlishenqingDao extends BaseMapper<ZanlishenqingEntity> {
	
	List<ZanlishenqingVO> selectListVO(@Param("ew") Wrapper<ZanlishenqingEntity> wrapper);
	
	ZanlishenqingVO selectVO(@Param("ew") Wrapper<ZanlishenqingEntity> wrapper);
	
	List<ZanlishenqingView> selectListView(@Param("ew") Wrapper<ZanlishenqingEntity> wrapper);

	List<ZanlishenqingView> selectListView(Pagination page,@Param("ew") Wrapper<ZanlishenqingEntity> wrapper);
	
	ZanlishenqingView selectView(@Param("ew") Wrapper<ZanlishenqingEntity> wrapper);
	

}
