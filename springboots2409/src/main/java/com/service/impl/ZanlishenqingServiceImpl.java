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


import com.dao.ZanlishenqingDao;
import com.entity.ZanlishenqingEntity;
import com.service.ZanlishenqingService;
import com.entity.vo.ZanlishenqingVO;
import com.entity.view.ZanlishenqingView;

@Service("zanlishenqingService")
public class ZanlishenqingServiceImpl extends ServiceImpl<ZanlishenqingDao, ZanlishenqingEntity> implements ZanlishenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZanlishenqingEntity> page = this.selectPage(
                new Query<ZanlishenqingEntity>(params).getPage(),
                new EntityWrapper<ZanlishenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZanlishenqingEntity> wrapper) {
		  Page<ZanlishenqingView> page =new Query<ZanlishenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZanlishenqingVO> selectListVO(Wrapper<ZanlishenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZanlishenqingVO selectVO(Wrapper<ZanlishenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZanlishenqingView> selectListView(Wrapper<ZanlishenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZanlishenqingView selectView(Wrapper<ZanlishenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
