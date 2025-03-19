package com.entity.model;

import com.entity.KechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 课程
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KechengModel implements Serializable {
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
     * 课程名称
     */
    private String kechengName;


    /**
     * 课程编号
     */
    private String kechengUuidNumber;


    /**
     * 课程照片
     */
    private String kechengPhoto;


    /**
     * 课程视频
     */
    private String kechengVideo;


    /**
     * 课件
     */
    private String kechengFile;


    /**
     * 科目
     */
    private Integer kechengTypes;


    /**
     * 课程热度
     */
    private Integer kechengClicknum;


    /**
     * 课程内容
     */
    private String kechengContent;


    /**
     * 知识要点
     */
    private String zhishiyaodianContent;


    /**
     * 考试大纲
     */
    private String kaoshidagangContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer kechengDelete;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：课程名称
	 */
    public String getKechengName() {
        return kechengName;
    }


    /**
	 * 设置：课程名称
	 */
    public void setKechengName(String kechengName) {
        this.kechengName = kechengName;
    }
    /**
	 * 获取：课程编号
	 */
    public String getKechengUuidNumber() {
        return kechengUuidNumber;
    }


    /**
	 * 设置：课程编号
	 */
    public void setKechengUuidNumber(String kechengUuidNumber) {
        this.kechengUuidNumber = kechengUuidNumber;
    }
    /**
	 * 获取：课程照片
	 */
    public String getKechengPhoto() {
        return kechengPhoto;
    }


    /**
	 * 设置：课程照片
	 */
    public void setKechengPhoto(String kechengPhoto) {
        this.kechengPhoto = kechengPhoto;
    }
    /**
	 * 获取：课程视频
	 */
    public String getKechengVideo() {
        return kechengVideo;
    }


    /**
	 * 设置：课程视频
	 */
    public void setKechengVideo(String kechengVideo) {
        this.kechengVideo = kechengVideo;
    }
    /**
	 * 获取：课件
	 */
    public String getKechengFile() {
        return kechengFile;
    }


    /**
	 * 设置：课件
	 */
    public void setKechengFile(String kechengFile) {
        this.kechengFile = kechengFile;
    }
    /**
	 * 获取：科目
	 */
    public Integer getKechengTypes() {
        return kechengTypes;
    }


    /**
	 * 设置：科目
	 */
    public void setKechengTypes(Integer kechengTypes) {
        this.kechengTypes = kechengTypes;
    }
    /**
	 * 获取：课程热度
	 */
    public Integer getKechengClicknum() {
        return kechengClicknum;
    }


    /**
	 * 设置：课程热度
	 */
    public void setKechengClicknum(Integer kechengClicknum) {
        this.kechengClicknum = kechengClicknum;
    }
    /**
	 * 获取：课程内容
	 */
    public String getKechengContent() {
        return kechengContent;
    }


    /**
	 * 设置：课程内容
	 */
    public void setKechengContent(String kechengContent) {
        this.kechengContent = kechengContent;
    }
    /**
	 * 获取：知识要点
	 */
    public String getZhishiyaodianContent() {
        return zhishiyaodianContent;
    }


    /**
	 * 设置：知识要点
	 */
    public void setZhishiyaodianContent(String zhishiyaodianContent) {
        this.zhishiyaodianContent = zhishiyaodianContent;
    }
    /**
	 * 获取：考试大纲
	 */
    public String getKaoshidagangContent() {
        return kaoshidagangContent;
    }


    /**
	 * 设置：考试大纲
	 */
    public void setKaoshidagangContent(String kaoshidagangContent) {
        this.kaoshidagangContent = kaoshidagangContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getKechengDelete() {
        return kechengDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setKechengDelete(Integer kechengDelete) {
        this.kechengDelete = kechengDelete;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
