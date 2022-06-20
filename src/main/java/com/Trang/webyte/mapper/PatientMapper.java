package com.Trang.webyte.mapper;

import com.Trang.webyte.model.Patient;
import com.Trang.webyte.model.PatientExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PatientMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table patient
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	long countByExample(PatientExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table patient
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	int deleteByExample(PatientExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table patient
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table patient
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	int insert(Patient record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table patient
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	int insertSelective(Patient record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table patient
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	List<Patient> selectByExample(PatientExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table patient
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	Patient selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table patient
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	int updateByExampleSelective(@Param("record") Patient record, @Param("example") PatientExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table patient
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	int updateByExample(@Param("record") Patient record, @Param("example") PatientExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table patient
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	int updateByPrimaryKeySelective(Patient record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table patient
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	int updateByPrimaryKey(Patient record);
}