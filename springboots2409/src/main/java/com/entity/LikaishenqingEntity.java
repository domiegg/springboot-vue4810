package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 离开申请
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-16 11:17:23
 */
@TableName("likaishenqing")
public class LikaishenqingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LikaishenqingEntity() {
		
	}
	
	public LikaishenqingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 场地名称
	 */
					
	private String changdimingcheng;
	
	/**
	 * 场地类型
	 */
					
	private String changdileixing;
	
	/**
	 * 场地大小
	 */
					
	private String changdidaxiao;
	
	/**
	 * 场地地址
	 */
					
	private String changdidizhi;
	
	/**
	 * 预约时间
	 */
					
	private String yuyueshijian;
	
	/**
	 * 预约备注
	 */
					
	private String yuyuebeizhu;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机号码
	 */
					
	private String shoujihaoma;
	
	/**
	 * 离开备注
	 */
					
	private String likaibeizhu;
	
	/**
	 * 离开时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date likaishijian;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：场地名称
	 */
	public void setChangdimingcheng(String changdimingcheng) {
		this.changdimingcheng = changdimingcheng;
	}
	/**
	 * 获取：场地名称
	 */
	public String getChangdimingcheng() {
		return changdimingcheng;
	}
	/**
	 * 设置：场地类型
	 */
	public void setChangdileixing(String changdileixing) {
		this.changdileixing = changdileixing;
	}
	/**
	 * 获取：场地类型
	 */
	public String getChangdileixing() {
		return changdileixing;
	}
	/**
	 * 设置：场地大小
	 */
	public void setChangdidaxiao(String changdidaxiao) {
		this.changdidaxiao = changdidaxiao;
	}
	/**
	 * 获取：场地大小
	 */
	public String getChangdidaxiao() {
		return changdidaxiao;
	}
	/**
	 * 设置：场地地址
	 */
	public void setChangdidizhi(String changdidizhi) {
		this.changdidizhi = changdidizhi;
	}
	/**
	 * 获取：场地地址
	 */
	public String getChangdidizhi() {
		return changdidizhi;
	}
	/**
	 * 设置：预约时间
	 */
	public void setYuyueshijian(String yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	/**
	 * 获取：预约时间
	 */
	public String getYuyueshijian() {
		return yuyueshijian;
	}
	/**
	 * 设置：预约备注
	 */
	public void setYuyuebeizhu(String yuyuebeizhu) {
		this.yuyuebeizhu = yuyuebeizhu;
	}
	/**
	 * 获取：预约备注
	 */
	public String getYuyuebeizhu() {
		return yuyuebeizhu;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机号码
	 */
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
	/**
	 * 设置：离开备注
	 */
	public void setLikaibeizhu(String likaibeizhu) {
		this.likaibeizhu = likaibeizhu;
	}
	/**
	 * 获取：离开备注
	 */
	public String getLikaibeizhu() {
		return likaibeizhu;
	}
	/**
	 * 设置：离开时间
	 */
	public void setLikaishijian(Date likaishijian) {
		this.likaishijian = likaishijian;
	}
	/**
	 * 获取：离开时间
	 */
	public Date getLikaishijian() {
		return likaishijian;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
