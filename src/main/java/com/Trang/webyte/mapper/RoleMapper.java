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
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	long countByExample(RoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	int deleteByExample(RoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	int deleteByPrimaryKey(Integer idrole);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	int insert(Role row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	int insertSelective(Role row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	List<Role> selectByExample(RoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	Role selectByPrimaryKey(Integer idrole);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	int updateByExampleSelective(@Param("row") Role row, @Param("example") RoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	int updateByExample(@Param("row") Role row, @Param("example") RoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	int updateByPrimaryKeySelective(Role row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	int updateByPrimaryKey(Role row);

	Role selectByKey(int id);
}