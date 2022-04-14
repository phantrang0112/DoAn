package com.Trang.webyte.mapper;

import com.Trang.webyte.model.Healthrecords;
import com.Trang.webyte.model.HealthrecordsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface HealthrecordsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table healthrecords
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	long countByExample(HealthrecordsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table healthrecords
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	int deleteByExample(HealthrecordsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table healthrecords
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	int deleteByPrimaryKey(Integer healthrecordsid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table healthrecords
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	int insert(Healthrecords record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table healthrecords
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	int insertSelective(Healthrecords record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table healthrecords
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	List<Healthrecords> selectByExample(HealthrecordsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table healthrecords
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	Healthrecords selectByPrimaryKey(Integer healthrecordsid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table healthrecords
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	int updateByExampleSelective(@Param("record") Healthrecords record, @Param("example") HealthrecordsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table healthrecords
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	int updateByExample(@Param("record") Healthrecords record, @Param("example") HealthrecordsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table healthrecords
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	int updateByPrimaryKeySelective(Healthrecords record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table healthrecords
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	int updateByPrimaryKey(Healthrecords record);
}