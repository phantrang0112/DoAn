package com.Trang.webyte.mapper;

import com.Trang.webyte.model.News;
import com.Trang.webyte.model.NewsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface NewsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	long countByExample(NewsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	int deleteByExample(NewsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	int insert(News record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	int insertSelective(News record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	List<News> selectByExample(NewsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Sat May 21 15:21:27 ICT 2022
	 */
	int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

	News selectbyid(int newsid);
}