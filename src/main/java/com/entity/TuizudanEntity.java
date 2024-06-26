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
 * 退租单
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-24 23:32:26
 */
@TableName("tuizudan")
public class TuizudanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TuizudanEntity() {
		
	}
	
	public TuizudanEntity(T t) {
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
	 * 房源名称
	 */
					
	private String fangyuanmingcheng;
	
	/**
	 * 房源图片
	 */
					
	private String fangyuantupian;
	
	/**
	 * 房源位置
	 */
					
	private String fangyuanweizhi;
	
	/**
	 * 租金
	 */
					
	private Integer zujin;
	
	/**
	 * 租赁期限
	 */
					
	private String zulinqixian;
	
	/**
	 * 租户账号
	 */
					
	private String zuhuzhanghao;
	
	/**
	 * 租户姓名
	 */
					
	private String zuhuxingming;
	
	/**
	 * 退租日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tuizuriqi;
	
	/**
	 * 退租备注
	 */
					
	private String tuizubeizhu;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 身份证
	 */
					
	private String shenfenzheng;
	
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
	 * 设置：房源名称
	 */
	public void setFangyuanmingcheng(String fangyuanmingcheng) {
		this.fangyuanmingcheng = fangyuanmingcheng;
	}
	/**
	 * 获取：房源名称
	 */
	public String getFangyuanmingcheng() {
		return fangyuanmingcheng;
	}
	/**
	 * 设置：房源图片
	 */
	public void setFangyuantupian(String fangyuantupian) {
		this.fangyuantupian = fangyuantupian;
	}
	/**
	 * 获取：房源图片
	 */
	public String getFangyuantupian() {
		return fangyuantupian;
	}
	/**
	 * 设置：房源位置
	 */
	public void setFangyuanweizhi(String fangyuanweizhi) {
		this.fangyuanweizhi = fangyuanweizhi;
	}
	/**
	 * 获取：房源位置
	 */
	public String getFangyuanweizhi() {
		return fangyuanweizhi;
	}
	/**
	 * 设置：租金
	 */
	public void setZujin(Integer zujin) {
		this.zujin = zujin;
	}
	/**
	 * 获取：租金
	 */
	public Integer getZujin() {
		return zujin;
	}
	/**
	 * 设置：租赁期限
	 */
	public void setZulinqixian(String zulinqixian) {
		this.zulinqixian = zulinqixian;
	}
	/**
	 * 获取：租赁期限
	 */
	public String getZulinqixian() {
		return zulinqixian;
	}
	/**
	 * 设置：租户账号
	 */
	public void setZuhuzhanghao(String zuhuzhanghao) {
		this.zuhuzhanghao = zuhuzhanghao;
	}
	/**
	 * 获取：租户账号
	 */
	public String getZuhuzhanghao() {
		return zuhuzhanghao;
	}
	/**
	 * 设置：租户姓名
	 */
	public void setZuhuxingming(String zuhuxingming) {
		this.zuhuxingming = zuhuxingming;
	}
	/**
	 * 获取：租户姓名
	 */
	public String getZuhuxingming() {
		return zuhuxingming;
	}
	/**
	 * 设置：退租日期
	 */
	public void setTuizuriqi(Date tuizuriqi) {
		this.tuizuriqi = tuizuriqi;
	}
	/**
	 * 获取：退租日期
	 */
	public Date getTuizuriqi() {
		return tuizuriqi;
	}
	/**
	 * 设置：退租备注
	 */
	public void setTuizubeizhu(String tuizubeizhu) {
		this.tuizubeizhu = tuizubeizhu;
	}
	/**
	 * 获取：退租备注
	 */
	public String getTuizubeizhu() {
		return tuizubeizhu;
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
	 * 设置：身份证
	 */
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
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
