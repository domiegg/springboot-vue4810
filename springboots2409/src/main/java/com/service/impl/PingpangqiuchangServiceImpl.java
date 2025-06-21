package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.PingpangqiuchangDao;
import com.entity.PingpangqiuchangEntity;
import com.service.PingpangqiuchangService;
import com.entity.vo.PingpangqiuchangVO;
import com.entity.view.PingpangqiuchangView;

@Service("pingpangqiuchangService")
public class PingpangqiuchangServiceImpl extends ServiceImpl<PingpangqiuchangDao, PingpangqiuchangEntity> implements PingpangqiuchangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PingpangqiuchangEntity> page = this.selectPage(
                new Query<PingpangqiuchangEntity>(params).getPage(),
                new EntityWrapper<PingpangqiuchangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PingpangqiuchangEntity> wrapper) {
		  Page<PingpangqiuchangView> page =new Query<PingpangqiuchangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PingpangqiuchangVO> selectListVO(Wrapper<PingpangqiuchangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PingpangqiuchangVO selectVO(Wrapper<PingpangqiuchangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PingpangqiuchangView> selectListView(Wrapper<PingpangqiuchangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PingpangqiuchangView selectView(Wrapper<PingpangqiuchangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
