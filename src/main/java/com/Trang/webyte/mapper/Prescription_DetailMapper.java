package com.Trang.webyte.mapper;

import com.Trang.webyte.model.Prescription_Detail;
import com.Trang.webyte.model.Prescription_DetailExample;
import com.Trang.webyte.model.Prescription_DetailKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface Prescription_DetailMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription_detail
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	long countByExample(Prescription_DetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription_detail
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	int deleteByExample(Prescription_DetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription_detail
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	int deleteByPrimaryKey(Prescription_DetailKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription_detail
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	int insert(Prescription_Detail record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription_detail
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	int insertSelective(Prescription_Detail record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription_detail
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	List<Prescription_Detail> selectByExample(Prescription_DetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription_detail
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	Prescription_Detail selectByPrimaryKey(Prescription_DetailKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription_detail
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	int updateByExampleSelective(@Param("record") Prescription_Detail record,
			@Param("example") Prescription_DetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription_detail
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	int updateByExample(@Param("record") Prescription_Detail record,
			@Param("example") Prescription_DetailExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription_detail
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	int updateByPrimaryKeySelective(Prescription_Detail record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription_detail
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	int updateByPrimaryKey(Prescription_Detail record);
}