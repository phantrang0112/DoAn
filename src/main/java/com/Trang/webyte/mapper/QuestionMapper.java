package com.Trang.webyte.mapper;

import com.Trang.webyte.model.Question;
import com.Trang.webyte.model.QuestionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface QuestionMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table question
	 * @mbg.generated  Mon Apr 04 14:21:11 ICT 2022
	 */
	long countByExample(QuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table question
	 * @mbg.generated  Mon Apr 04 14:21:11 ICT 2022
	 */
	int deleteByExample(QuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table question
	 * @mbg.generated  Mon Apr 04 14:21:11 ICT 2022
	 */
	int deleteByPrimaryKey(Integer questionid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table question
	 * @mbg.generated  Mon Apr 04 14:21:11 ICT 2022
	 */
	int insert(Question record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table question
	 * @mbg.generated  Mon Apr 04 14:21:11 ICT 2022
	 */
	int insertSelective(Question record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table question
	 * @mbg.generated  Mon Apr 04 14:21:11 ICT 2022
	 */
	List<Question> selectByExample(QuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table question
	 * @mbg.generated  Mon Apr 04 14:21:11 ICT 2022
	 */
	Question selectByPrimaryKey(Integer questionid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table question
	 * @mbg.generated  Mon Apr 04 14:21:11 ICT 2022
	 */
	int updateByExampleSelective(@Param("record") Question record, @Param("example") QuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table question
	 * @mbg.generated  Mon Apr 04 14:21:11 ICT 2022
	 */
	int updateByExample(@Param("record") Question record, @Param("example") QuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table question
	 * @mbg.generated  Mon Apr 04 14:21:11 ICT 2022
	 */
	int updateByPrimaryKeySelective(Question record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table question
	 * @mbg.generated  Mon Apr 04 14:21:11 ICT 2022
	 */
	int updateByPrimaryKey(Question record);
}