package com.Trang.webyte.mapper;

import com.Trang.webyte.model.Answer;
import com.Trang.webyte.model.AnswerExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AnswerMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table answer
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	long countByExample(AnswerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table answer
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	int deleteByExample(AnswerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table answer
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	int deleteByPrimaryKey(Integer answerid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table answer
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	int insert(Answer row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table answer
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	int insertSelective(Answer row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table answer
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	List<Answer> selectByExample(AnswerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table answer
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	Answer selectByPrimaryKey(Integer answerid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table answer
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	int updateByExampleSelective(@Param("row") Answer row, @Param("example") AnswerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table answer
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	int updateByExample(@Param("row") Answer row, @Param("example") AnswerExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table answer
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	int updateByPrimaryKeySelective(Answer row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table answer
	 * @mbg.generated  Wed May 25 09:13:05 ICT 2022
	 */
	int updateByPrimaryKey(Answer row);
}