package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZanlishenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZanlishenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZanlishenqingView;


/**
 * 暂离申请
 *
 * @author 
 * @email 
 * @date 2022-05-16 11:17:23
 */
public interface ZanlishenqingService extends IService<ZanlishenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZanlishenqingVO> selectListVO(Wrapper<ZanlishenqingEntity> wrapper);
   	
   	ZanlishenqingVO selectVO(@Param("ew") Wrapper<ZanlishenqingEntity> wrapper);
   	
   	List<ZanlishenqingView> selectListView(Wrapper<ZanlishenqingEntity> wrapper);
   	
   	ZanlishenqingView selectView(@Param("ew") Wrapper<ZanlishenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZanlishenqingEntity> wrapper);
   	

}

