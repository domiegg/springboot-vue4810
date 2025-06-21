package com.entity.view;

import com.entity.PingpangqiuchangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 乒乓球场
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-16 11:17:23
 */
@TableName("pingpangqiuchang")
public class PingpangqiuchangView  extends PingpangqiuchangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PingpangqiuchangView(){
	}
 
 	public PingpangqiuchangView(PingpangqiuchangEntity pingpangqiuchangEntity){
 	try {
			BeanUtils.copyProperties(this, pingpangqiuchangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
