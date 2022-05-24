package com.Trang.webyte.mapper;

import com.Trang.webyte.model.Schedule;
import com.Trang.webyte.model.ScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScheduleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated Tue May 24 09:26:52 ICT 2022
     */
    long countByExample(ScheduleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated Tue May 24 09:26:52 ICT 2022
     */
    int deleteByExample(ScheduleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated Tue May 24 09:26:52 ICT 2022
     */
    int deleteByPrimaryKey(Integer scheduleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated Tue May 24 09:26:52 ICT 2022
     */
    int insert(Schedule row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated Tue May 24 09:26:52 ICT 2022
     */
    int insertSelective(Schedule row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated Tue May 24 09:26:52 ICT 2022
     */
    List<Schedule> selectByExample(ScheduleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated Tue May 24 09:26:52 ICT 2022
     */
    Schedule selectByPrimaryKey(Integer scheduleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated Tue May 24 09:26:52 ICT 2022
     */
    int updateByExampleSelective(@Param("row") Schedule row, @Param("example") ScheduleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated Tue May 24 09:26:52 ICT 2022
     */
    int updateByExample(@Param("row") Schedule row, @Param("example") ScheduleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated Tue May 24 09:26:52 ICT 2022
     */
    int updateByPrimaryKeySelective(Schedule row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated Tue May 24 09:26:52 ICT 2022
     */
    int updateByPrimaryKey(Schedule row);
}