package com.Trang.webyte.mapper;

import com.Trang.webyte.model.Role;
import com.Trang.webyte.model.RoleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RoleMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	long countByExample(RoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	int deleteByExample(RoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	int insert(Role record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	int insertSelective(Role record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	List<Role> selectByExample(RoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Tue Apr 12 14:42:06 ICT 2022
	 */
	int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);
}