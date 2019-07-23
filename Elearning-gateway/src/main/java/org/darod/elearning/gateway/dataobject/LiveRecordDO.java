package org.darod.elearning.gateway.dataobject;

import java.util.Date;

public class LiveRecordDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_record.live_record_id
     *
     * @mbg.generated Mon Jul 22 21:43:10 CST 2019
     */
    private Integer liveRecordId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_record.teacher_id
     *
     * @mbg.generated Mon Jul 22 21:43:10 CST 2019
     */
    private Integer teacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_record.start_time
     *
     * @mbg.generated Mon Jul 22 21:43:10 CST 2019
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_record.finish_time
     *
     * @mbg.generated Mon Jul 22 21:43:10 CST 2019
     */
    private Date finishTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_record.channel_id
     *
     * @mbg.generated Mon Jul 22 21:43:10 CST 2019
     */
    private String channelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_record.live_secret
     *
     * @mbg.generated Mon Jul 22 21:43:10 CST 2019
     */
    private String liveSecret;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_record.watch_num
     *
     * @mbg.generated Mon Jul 22 21:43:10 CST 2019
     */
    private Integer watchNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_record.beat_time
     *
     * @mbg.generated Mon Jul 22 21:43:10 CST 2019
     */
    private Date beatTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_record.live_record_id
     *
     * @return the value of live_record.live_record_id
     *
     * @mbg.generated Mon Jul 22 21:43:10 CST 2019
     */
    public Integer getLiveRecordId() {
        return liveRecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_record.live_record_id
     *
     * @param liveRecordId the value for live_record.live_record_id
     *
     * @mbg.generated Mon Jul 22 21:43:10 CST 2019
     */
    public void setLiveRecordId(Integer liveRecordId) {
        this.liveRecordId = liveRecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_record.teacher_id
     *
     * @return the value of live_record.teacher_id
     *
     * @mbg.generated Mon Jul 22 21:43:10 CST 2019
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_record.teacher_id
     *
     * @param teacherId the value for live_record.teacher_id
     *
     * @mbg.generated Mon Jul 22 21:43:10 CST 2019
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_record.start_time
     *
     * @return the value of live_record.start_time
     *
     * @mbg.generated Mon Jul 22 21:43:10 CST 2019
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_record.start_time
     *
     * @param startTime the value for live_record.start_time
     *
     * @mbg.generated Mon Jul 22 21:43:10 CST 2019
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_record.finish_time
     *
     * @return the value of live_record.finish_time
     *
     * @mbg.generated Mon Jul 22 21:43:10 CST 2019
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_record.finish_time
     *
     * @param finishTime the value for live_record.finish_time
     *
     * @mbg.generated Mon Jul 22 21:43:10 CST 2019
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_record.channel_id
     *
     * @return the value of live_record.channel_id
     *
     * @mbg.generated Mon Jul 22 21:43:10 CST 2019
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_record.channel_id
     *
     * @param channelId the value for live_record.channel_id
     *
     * @mbg.generated Mon Jul 22 21:43:10 CST 2019
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_record.live_secret
     *
     * @return the value of live_record.live_secret
     *
     * @mbg.generated Mon Jul 22 21:43:10 CST 2019
     */
    public String getLiveSecret() {
        return liveSecret;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_record.live_secret
     *
     * @param liveSecret the value for live_record.live_secret
     *
     * @mbg.generated Mon Jul 22 21:43:10 CST 2019
     */
    public void setLiveSecret(String liveSecret) {
        this.liveSecret = liveSecret == null ? null : liveSecret.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_record.watch_num
     *
     * @return the value of live_record.watch_num
     *
     * @mbg.generated Mon Jul 22 21:43:10 CST 2019
     */
    public Integer getWatchNum() {
        return watchNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_record.watch_num
     *
     * @param watchNum the value for live_record.watch_num
     *
     * @mbg.generated Mon Jul 22 21:43:10 CST 2019
     */
    public void setWatchNum(Integer watchNum) {
        this.watchNum = watchNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_record.beat_time
     *
     * @return the value of live_record.beat_time
     *
     * @mbg.generated Mon Jul 22 21:43:10 CST 2019
     */
    public Date getBeatTime() {
        return beatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_record.beat_time
     *
     * @param beatTime the value for live_record.beat_time
     *
     * @mbg.generated Mon Jul 22 21:43:10 CST 2019
     */
    public void setBeatTime(Date beatTime) {
        this.beatTime = beatTime;
    }
}