package com.Trang.webyte.mapper;

import com.Trang.webyte.model.Topic;
import com.Trang.webyte.model.TopicExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TopicMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table topic
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	long countByExample(TopicExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table topic
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	int deleteByExample(TopicExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table topic
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	int deleteByPrimaryKey(Integer topicid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table topic
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	int insert(Topic row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table topic
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	int insertSelective(Topic row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table topic
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	List<Topic> selectByExample(TopicExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table topic
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	Topic selectByPrimaryKey(Integer topicid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table topic
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	int updateByExampleSelective(@Param("row") Topic row, @Param("example") TopicExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table topic
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	int updateByExample(@Param("row") Topic row, @Param("example") TopicExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table topic
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	int updateByPrimaryKeySelective(Topic row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table topic
	 * @mbg.generated  Mon May 30 17:00:26 ICT 2022
	 */
	int updateByPrimaryKey(Topic row);
}