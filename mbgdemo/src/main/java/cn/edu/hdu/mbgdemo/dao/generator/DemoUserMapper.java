package cn.edu.hdu.mbgdemo.dao.generator;

import cn.edu.hdu.mbgdemo.base.BaseDao;
import cn.edu.hdu.mbgdemo.model.generator.DemoUser;
import java.util.List;

public interface DemoUserMapper extends BaseDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_user
     *
     * @mbggenerated
     */
    int insert(DemoUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_user
     *
     * @mbggenerated
     */
    DemoUser selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_user
     *
     * @mbggenerated
     */
    List<DemoUser> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DemoUser record);
}