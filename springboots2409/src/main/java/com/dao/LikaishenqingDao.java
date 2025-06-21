package com.dao;

import com.entity.LikaishenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LikaishenqingVO;
import com.entity.view.LikaishenqingView;


/**
 * 离开申请
 * 
 * @author 
 * @email 
 * @date 2022-05-16 11:17:23
 */
public interface LikaishenqingDao extends BaseMapper<LikaishenqingEntity> {
	
	List<LikaishenqingVO> selectListVO(@Param("ew") Wrapper<LikaishenqingEntity> wrapper);
	
	LikaishenqingVO selectVO(@Param("ew") Wrapper<LikaishenqingEntity> wrapper);
	
	List<LikaishenqingView> selectListView(@Param("ew") Wrapper<LikaishenqingEntity> wrapper);

	List<LikaishenqingView> selectListView(Pagination page,@Param("ew") Wrapper<LikaishenqingEntity> wrapper);
	
	LikaishenqingView selectView(@Param("ew") Wrapper<LikaishenqingEntity> wrapper);
	

}
