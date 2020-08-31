package com.pd.mapper;

import com.pd.pojo.PdContent;
import com.pd.pojo.PdContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdContentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_content
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    long countByExample(PdContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_content
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    int deleteByExample(PdContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_content
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_content
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    int insert(PdContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_content
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    int insertSelective(PdContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_content
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    List<PdContent> selectByExampleWithBLOBs(PdContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_content
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    List<PdContent> selectByExample(PdContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_content
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    PdContent selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_content
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    int updateByExampleSelective(@Param("record") PdContent record, @Param("example") PdContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_content
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") PdContent record, @Param("example") PdContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_content
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    int updateByExample(@Param("record") PdContent record, @Param("example") PdContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_content
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    int updateByPrimaryKeySelective(PdContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_content
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(PdContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_content
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    int updateByPrimaryKey(PdContent record);
}