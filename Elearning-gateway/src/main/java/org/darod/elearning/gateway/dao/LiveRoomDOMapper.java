package org.darod.elearning.gateway.dao;

import org.darod.elearning.gateway.dataobject.LiveRoomDO;
import org.springframework.stereotype.Repository;

@Repository
public interface LiveRoomDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_room
     *
     * @mbg.generated Tue Jul 23 21:25:10 CST 2019
     */
    int deleteByPrimaryKey(Integer roomId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_room
     *
     * @mbg.generated Tue Jul 23 21:25:10 CST 2019
     */
    int insert(LiveRoomDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_room
     *
     * @mbg.generated Tue Jul 23 21:25:10 CST 2019
     */
    int insertSelective(LiveRoomDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_room
     *
     * @mbg.generated Tue Jul 23 21:25:10 CST 2019
     */
    LiveRoomDO selectByPrimaryKey(Integer roomId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_room
     *
     * @mbg.generated Tue Jul 23 21:25:10 CST 2019
     */
    int updateByPrimaryKeySelective(LiveRoomDO record);

    int updateByTeacherIdSelective(LiveRoomDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_room
     *
     * @mbg.generated Tue Jul 23 21:25:10 CST 2019
     */
    int updateByPrimaryKey(LiveRoomDO record);

    LiveRoomDO selectByTeacherId(Integer teacherId);
}