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
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	long countByExample(QuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table question
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	int deleteByExample(QuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table question
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	int deleteByPrimaryKey(Integer questionid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table question
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	int insert(Question row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table question
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	int insertSelective(Question row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table question
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	List<Question> selectByExample(QuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table question
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	Question selectByPrimaryKey(Integer questionid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table question
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	int updateByExampleSelective(@Param("row") Question row, @Param("example") QuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table question
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	int updateByExample(@Param("row") Question row, @Param("example") QuestionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table question
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	int updateByPrimaryKeySelective(Question row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table question
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	int updateByPrimaryKey(Question row);
}