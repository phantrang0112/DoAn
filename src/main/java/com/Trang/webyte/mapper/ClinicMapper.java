package com.Trang.webyte.mapper;

import com.Trang.webyte.model.Clinic;
import com.Trang.webyte.model.ClinicExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ClinicMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table clinic
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	long countByExample(ClinicExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table clinic
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	int deleteByExample(ClinicExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table clinic
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	int deleteByPrimaryKey(Integer clinicid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table clinic
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	int insert(Clinic row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table clinic
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	int insertSelective(Clinic row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table clinic
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	List<Clinic> selectByExample(ClinicExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table clinic
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	Clinic selectByPrimaryKey(Integer clinicid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table clinic
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	int updateByExampleSelective(@Param("row") Clinic row, @Param("example") ClinicExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table clinic
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	int updateByExample(@Param("row") Clinic row, @Param("example") ClinicExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table clinic
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	int updateByPrimaryKeySelective(Clinic row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table clinic
	 * @mbg.generated  Thu Jun 02 12:01:52 ICT 2022
	 */
	int updateByPrimaryKey(Clinic row);
}