package com.entity.model;

import com.entity.JiaoxuejihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 教学计划
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiaoxuejihuaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 教师
     */
    private Integer jiaoshiId;


    /**
     * 课程
     */
    private Integer kechengId;


    /**
     * 教学计划编号
     */
    private String jiaoxuejihuaUuidNumber;


    /**
     * 教学计划名称
     */
    private String jiaoxuejihuaName;


    /**
     * 教学计划文件
     */
    private String jiaoxuejihuaFile;


    /**
     * 教学计划类型
     */
    private Integer jiaoxuejihuaTypes;


    /**
     * 教学计划内容
     */
    private String jiaoxuejihuaContent;


    /**
     * 记录时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 设置：教师
	 */
    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 获取：课程
	 */
    public Integer getKechengId() {
        return kechengId;
    }


    /**
	 * 设置：课程
	 */
    public void setKechengId(Integer kechengId) {
        this.kechengId = kechengId;
    }
    /**
	 * 获取：教学计划编号
	 */
    public String getJiaoxuejihuaUuidNumber() {
        return jiaoxuejihuaUuidNumber;
    }


    /**
	 * 设置：教学计划编号
	 */
    public void setJiaoxuejihuaUuidNumber(String jiaoxuejihuaUuidNumber) {
        this.jiaoxuejihuaUuidNumber = jiaoxuejihuaUuidNumber;
    }
    /**
	 * 获取：教学计划名称
	 */
    public String getJiaoxuejihuaName() {
        return jiaoxuejihuaName;
    }


    /**
	 * 设置：教学计划名称
	 */
    public void setJiaoxuejihuaName(String jiaoxuejihuaName) {
        this.jiaoxuejihuaName = jiaoxuejihuaName;
    }
    /**
	 * 获取：教学计划文件
	 */
    public String getJiaoxuejihuaFile() {
        return jiaoxuejihuaFile;
    }


    /**
	 * 设置：教学计划文件
	 */
    public void setJiaoxuejihuaFile(String jiaoxuejihuaFile) {
        this.jiaoxuejihuaFile = jiaoxuejihuaFile;
    }
    /**
	 * 获取：教学计划类型
	 */
    public Integer getJiaoxuejihuaTypes() {
        return jiaoxuejihuaTypes;
    }


    /**
	 * 设置：教学计划类型
	 */
    public void setJiaoxuejihuaTypes(Integer jiaoxuejihuaTypes) {
        this.jiaoxuejihuaTypes = jiaoxuejihuaTypes;
    }
    /**
	 * 获取：教学计划内容
	 */
    public String getJiaoxuejihuaContent() {
        return jiaoxuejihuaContent;
    }


    /**
	 * 设置：教学计划内容
	 */
    public void setJiaoxuejihuaContent(String jiaoxuejihuaContent) {
        this.jiaoxuejihuaContent = jiaoxuejihuaContent;
    }
    /**
	 * 获取：记录时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：记录时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
