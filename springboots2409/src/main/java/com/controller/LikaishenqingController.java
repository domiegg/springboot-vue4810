package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.LikaishenqingEntity;
import com.entity.view.LikaishenqingView;

import com.service.LikaishenqingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 离开申请
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-16 11:17:23
 */
@RestController
@RequestMapping("/likaishenqing")
public class LikaishenqingController {
    @Autowired
    private LikaishenqingService likaishenqingService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LikaishenqingEntity likaishenqing,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			likaishenqing.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<LikaishenqingEntity> ew = new EntityWrapper<LikaishenqingEntity>();
		PageUtils page = likaishenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, likaishenqing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LikaishenqingEntity likaishenqing, 
		HttpServletRequest request){
        EntityWrapper<LikaishenqingEntity> ew = new EntityWrapper<LikaishenqingEntity>();
		PageUtils page = likaishenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, likaishenqing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LikaishenqingEntity likaishenqing){
       	EntityWrapper<LikaishenqingEntity> ew = new EntityWrapper<LikaishenqingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( likaishenqing, "likaishenqing")); 
        return R.ok().put("data", likaishenqingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LikaishenqingEntity likaishenqing){
        EntityWrapper< LikaishenqingEntity> ew = new EntityWrapper< LikaishenqingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( likaishenqing, "likaishenqing")); 
		LikaishenqingView likaishenqingView =  likaishenqingService.selectView(ew);
		return R.ok("查询离开申请成功").put("data", likaishenqingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LikaishenqingEntity likaishenqing = likaishenqingService.selectById(id);
        return R.ok().put("data", likaishenqing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LikaishenqingEntity likaishenqing = likaishenqingService.selectById(id);
        return R.ok().put("data", likaishenqing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LikaishenqingEntity likaishenqing, HttpServletRequest request){
    	likaishenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(likaishenqing);
        likaishenqingService.insert(likaishenqing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LikaishenqingEntity likaishenqing, HttpServletRequest request){
    	likaishenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(likaishenqing);
        likaishenqingService.insert(likaishenqing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody LikaishenqingEntity likaishenqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(likaishenqing);
        likaishenqingService.updateById(likaishenqing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        likaishenqingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<LikaishenqingEntity> wrapper = new EntityWrapper<LikaishenqingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = likaishenqingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
