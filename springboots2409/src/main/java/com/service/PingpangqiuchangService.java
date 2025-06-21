package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PingpangqiuchangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PingpangqiuchangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PingpangqiuchangView;


/**
 * 乒乓球场
 *
 * @author 
 * @email 
 * @date 2022-05-16 11:17:23
 */
public interface PingpangqiuchangService extends IService<PingpangqiuchangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PingpangqiuchangVO> selectListVO(Wrapper<PingpangqiuchangEntity> wrapper);
   	
   	PingpangqiuchangVO selectVO(@Param("ew") Wrapper<PingpangqiuchangEntity> wrapper);
   	
   	List<PingpangqiuchangView> selectListView(Wrapper<PingpangqiuchangEntity> wrapper);
   	
   	PingpangqiuchangView selectView(@Param("ew") Wrapper<PingpangqiuchangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PingpangqiuchangEntity> wrapper);
   	

}

