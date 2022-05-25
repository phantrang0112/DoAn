package com.Trang.webyte.mapper;

import com.Trang.webyte.model.Type_Of_Clinic;
import com.Trang.webyte.model.Type_Of_ClinicExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface Type_Of_ClinicMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table typeofclinic
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	long countByExample(Type_Of_ClinicExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table typeofclinic
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	int deleteByExample(Type_Of_ClinicExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table typeofclinic
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	int deleteByPrimaryKey(Integer typeofclinicid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table typeofclinic
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	int insert(Type_Of_Clinic row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table typeofclinic
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	int insertSelective(Type_Of_Clinic row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table typeofclinic
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	List<Type_Of_Clinic> selectByExample(Type_Of_ClinicExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table typeofclinic
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	Type_Of_Clinic selectByPrimaryKey(Integer typeofclinicid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table typeofclinic
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	int updateByExampleSelective(@Param("row") Type_Of_Clinic row, @Param("example") Type_Of_ClinicExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table typeofclinic
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	int updateByExample(@Param("row") Type_Of_Clinic row, @Param("example") Type_Of_ClinicExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table typeofclinic
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	int updateByPrimaryKeySelective(Type_Of_Clinic row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table typeofclinic
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	int updateByPrimaryKey(Type_Of_Clinic row);
}