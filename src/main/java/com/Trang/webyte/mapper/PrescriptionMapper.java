package com.Trang.webyte.mapper;

import com.Trang.webyte.model.Prescription;
import com.Trang.webyte.model.PrescriptionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PrescriptionMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	long countByExample(PrescriptionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	int deleteByExample(PrescriptionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	int deleteByPrimaryKey(Integer prescriptionid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	int insert(Prescription record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	int insertSelective(Prescription record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	List<Prescription> selectByExample(PrescriptionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	Prescription selectByPrimaryKey(Integer prescriptionid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	int updateByExampleSelective(@Param("record") Prescription record, @Param("example") PrescriptionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	int updateByExample(@Param("record") Prescription record, @Param("example") PrescriptionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	int updateByPrimaryKeySelective(Prescription record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table prescription
	 * @mbg.generated  Fri Jun 17 22:19:08 ICT 2022
	 */
	int updateByPrimaryKey(Prescription record);
}