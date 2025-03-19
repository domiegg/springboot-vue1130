package com.entity.view;

import com.entity.JiaoxuejihuaEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 教学计划
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiaoxuejihua")
public class JiaoxuejihuaView extends JiaoxuejihuaEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 教学计划类型的值
		*/
		private String jiaoxuejihuaValue;



		//级联表 kecheng
			/**
			* 课程 的 教师
			*/
			private Integer kechengJiaoshiId;
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
				* 科目的值
				*/
				private String kechengValue;
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
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer kechengDelete;

		//级联表 jiaoshi
			/**
			* 教师姓名
			*/
			private String jiaoshiName;
			/**
			* 教师手机号
			*/
			private String jiaoshiPhone;
			/**
			* 教师身份证号
			*/
			private String jiaoshiIdNumber;
			/**
			* 教师头像
			*/
			private String jiaoshiPhoto;
			/**
			* 电子邮箱
			*/
			private String jiaoshiEmail;

	public JiaoxuejihuaView() {

	}

	public JiaoxuejihuaView(JiaoxuejihuaEntity jiaoxuejihuaEntity) {
		try {
			BeanUtils.copyProperties(this, jiaoxuejihuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 教学计划类型的值
			*/
			public String getJiaoxuejihuaValue() {
				return jiaoxuejihuaValue;
			}
			/**
			* 设置： 教学计划类型的值
			*/
			public void setJiaoxuejihuaValue(String jiaoxuejihuaValue) {
				this.jiaoxuejihuaValue = jiaoxuejihuaValue;
			}











				//级联表的get和set kecheng

					/**
					* 获取：课程 的 教师
					*/
					public Integer getKechengJiaoshiId() {
						return kechengJiaoshiId;
					}
					/**
					* 设置：课程 的 教师
					*/
					public void setKechengJiaoshiId(Integer kechengJiaoshiId) {
						this.kechengJiaoshiId = kechengJiaoshiId;
					}


					/**
					* 获取： 课程名称
					*/
					public String getKechengName() {
						return kechengName;
					}
					/**
					* 设置： 课程名称
					*/
					public void setKechengName(String kechengName) {
						this.kechengName = kechengName;
					}

					/**
					* 获取： 课程编号
					*/
					public String getKechengUuidNumber() {
						return kechengUuidNumber;
					}
					/**
					* 设置： 课程编号
					*/
					public void setKechengUuidNumber(String kechengUuidNumber) {
						this.kechengUuidNumber = kechengUuidNumber;
					}

					/**
					* 获取： 课程照片
					*/
					public String getKechengPhoto() {
						return kechengPhoto;
					}
					/**
					* 设置： 课程照片
					*/
					public void setKechengPhoto(String kechengPhoto) {
						this.kechengPhoto = kechengPhoto;
					}

					/**
					* 获取： 课程视频
					*/
					public String getKechengVideo() {
						return kechengVideo;
					}
					/**
					* 设置： 课程视频
					*/
					public void setKechengVideo(String kechengVideo) {
						this.kechengVideo = kechengVideo;
					}

					/**
					* 获取： 课件
					*/
					public String getKechengFile() {
						return kechengFile;
					}
					/**
					* 设置： 课件
					*/
					public void setKechengFile(String kechengFile) {
						this.kechengFile = kechengFile;
					}

					/**
					* 获取： 科目
					*/
					public Integer getKechengTypes() {
						return kechengTypes;
					}
					/**
					* 设置： 科目
					*/
					public void setKechengTypes(Integer kechengTypes) {
						this.kechengTypes = kechengTypes;
					}


						/**
						* 获取： 科目的值
						*/
						public String getKechengValue() {
							return kechengValue;
						}
						/**
						* 设置： 科目的值
						*/
						public void setKechengValue(String kechengValue) {
							this.kechengValue = kechengValue;
						}

					/**
					* 获取： 课程热度
					*/
					public Integer getKechengClicknum() {
						return kechengClicknum;
					}
					/**
					* 设置： 课程热度
					*/
					public void setKechengClicknum(Integer kechengClicknum) {
						this.kechengClicknum = kechengClicknum;
					}

					/**
					* 获取： 课程内容
					*/
					public String getKechengContent() {
						return kechengContent;
					}
					/**
					* 设置： 课程内容
					*/
					public void setKechengContent(String kechengContent) {
						this.kechengContent = kechengContent;
					}

					/**
					* 获取： 知识要点
					*/
					public String getZhishiyaodianContent() {
						return zhishiyaodianContent;
					}
					/**
					* 设置： 知识要点
					*/
					public void setZhishiyaodianContent(String zhishiyaodianContent) {
						this.zhishiyaodianContent = zhishiyaodianContent;
					}

					/**
					* 获取： 考试大纲
					*/
					public String getKaoshidagangContent() {
						return kaoshidagangContent;
					}
					/**
					* 设置： 考试大纲
					*/
					public void setKaoshidagangContent(String kaoshidagangContent) {
						this.kaoshidagangContent = kaoshidagangContent;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getKechengDelete() {
						return kechengDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setKechengDelete(Integer kechengDelete) {
						this.kechengDelete = kechengDelete;
					}











				//级联表的get和set jiaoshi

					/**
					* 获取： 教师姓名
					*/
					public String getJiaoshiName() {
						return jiaoshiName;
					}
					/**
					* 设置： 教师姓名
					*/
					public void setJiaoshiName(String jiaoshiName) {
						this.jiaoshiName = jiaoshiName;
					}

					/**
					* 获取： 教师手机号
					*/
					public String getJiaoshiPhone() {
						return jiaoshiPhone;
					}
					/**
					* 设置： 教师手机号
					*/
					public void setJiaoshiPhone(String jiaoshiPhone) {
						this.jiaoshiPhone = jiaoshiPhone;
					}

					/**
					* 获取： 教师身份证号
					*/
					public String getJiaoshiIdNumber() {
						return jiaoshiIdNumber;
					}
					/**
					* 设置： 教师身份证号
					*/
					public void setJiaoshiIdNumber(String jiaoshiIdNumber) {
						this.jiaoshiIdNumber = jiaoshiIdNumber;
					}

					/**
					* 获取： 教师头像
					*/
					public String getJiaoshiPhoto() {
						return jiaoshiPhoto;
					}
					/**
					* 设置： 教师头像
					*/
					public void setJiaoshiPhoto(String jiaoshiPhoto) {
						this.jiaoshiPhoto = jiaoshiPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getJiaoshiEmail() {
						return jiaoshiEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setJiaoshiEmail(String jiaoshiEmail) {
						this.jiaoshiEmail = jiaoshiEmail;
					}







}
