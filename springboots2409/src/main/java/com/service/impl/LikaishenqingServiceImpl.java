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


import com.dao.LikaishenqingDao;
import com.entity.LikaishenqingEntity;
import com.service.LikaishenqingService;
import com.entity.vo.LikaishenqingVO;
import com.entity.view.LikaishenqingView;

@Service("likaishenqingService")
public class LikaishenqingServiceImpl extends ServiceImpl<LikaishenqingDao, LikaishenqingEntity> implements LikaishenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LikaishenqingEntity> page = this.selectPage(
                new Query<LikaishenqingEntity>(params).getPage(),
                new EntityWrapper<LikaishenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LikaishenqingEntity> wrapper) {
		  Page<LikaishenqingView> page =new Query<LikaishenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LikaishenqingVO> selectListVO(Wrapper<LikaishenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LikaishenqingVO selectVO(Wrapper<LikaishenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LikaishenqingView> selectListView(Wrapper<LikaishenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LikaishenqingView selectView(Wrapper<LikaishenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
