package com.Trang.webyte.mapper;

import com.Trang.webyte.model.Sick;
import com.Trang.webyte.model.SickExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SickMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sick
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	long countByExample(SickExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sick
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	int deleteByExample(SickExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sick
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	int deleteByPrimaryKey(Integer sickid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sick
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	int insert(Sick row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sick
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	int insertSelective(Sick row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sick
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	List<Sick> selectByExample(SickExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sick
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	Sick selectByPrimaryKey(Integer sickid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sick
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	int updateByExampleSelective(@Param("row") Sick row, @Param("example") SickExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sick
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	int updateByExample(@Param("row") Sick row, @Param("example") SickExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sick
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	int updateByPrimaryKeySelective(Sick row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sick
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	int updateByPrimaryKey(Sick row);
}