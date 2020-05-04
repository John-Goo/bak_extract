package com.yx.cdss.extract.model.mapper;

import com.yx.cdss.extract.model.entity.DictGivendrugRoute;
import com.yx.cdss.extract.model.entity.DictGivendrugRouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictGivendrugRouteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    long countByExample(DictGivendrugRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    int deleteByExample(DictGivendrugRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long dgrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    int insert(DictGivendrugRoute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    int insertSelective(DictGivendrugRoute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    List<DictGivendrugRoute> selectByExample(DictGivendrugRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    DictGivendrugRoute selectByPrimaryKey(Long dgrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DictGivendrugRoute record, @Param("example") DictGivendrugRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DictGivendrugRoute record, @Param("example") DictGivendrugRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DictGivendrugRoute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_givendrug_route
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DictGivendrugRoute record);
}