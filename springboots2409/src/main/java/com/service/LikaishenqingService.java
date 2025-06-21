package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LikaishenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LikaishenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LikaishenqingView;


/**
 * 离开申请
 *
 * @author 
 * @email 
 * @date 2022-05-16 11:17:23
 */
public interface LikaishenqingService extends IService<LikaishenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LikaishenqingVO> selectListVO(Wrapper<LikaishenqingEntity> wrapper);
   	
   	LikaishenqingVO selectVO(@Param("ew") Wrapper<LikaishenqingEntity> wrapper);
   	
   	List<LikaishenqingView> selectListView(Wrapper<LikaishenqingEntity> wrapper);
   	
   	LikaishenqingView selectView(@Param("ew") Wrapper<LikaishenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LikaishenqingEntity> wrapper);
   	

}

