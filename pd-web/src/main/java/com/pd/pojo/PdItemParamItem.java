package com.pd.pojo;

import java.io.Serializable;
import java.util.Date;

public class PdItemParamItem implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_item_param_item.id
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_item_param_item.item_id
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private Long itemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_item_param_item.item_param_id
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private Long itemParamId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_item_param_item.created
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private Date created;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_item_param_item.updated
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private Date updated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pd_item_param_item.param_data
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private String paramData;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pd_item_param_item
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_item_param_item.id
     *
     * @return the value of pd_item_param_item.id
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_item_param_item.id
     *
     * @param id the value for pd_item_param_item.id
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_item_param_item.item_id
     *
     * @return the value of pd_item_param_item.item_id
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_item_param_item.item_id
     *
     * @param itemId the value for pd_item_param_item.item_id
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_item_param_item.item_param_id
     *
     * @return the value of pd_item_param_item.item_param_id
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public Long getItemParamId() {
        return itemParamId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_item_param_item.item_param_id
     *
     * @param itemParamId the value for pd_item_param_item.item_param_id
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public void setItemParamId(Long itemParamId) {
        this.itemParamId = itemParamId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_item_param_item.created
     *
     * @return the value of pd_item_param_item.created
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_item_param_item.created
     *
     * @param created the value for pd_item_param_item.created
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_item_param_item.updated
     *
     * @return the value of pd_item_param_item.updated
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_item_param_item.updated
     *
     * @param updated the value for pd_item_param_item.updated
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pd_item_param_item.param_data
     *
     * @return the value of pd_item_param_item.param_data
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public String getParamData() {
        return paramData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pd_item_param_item.param_data
     *
     * @param paramData the value for pd_item_param_item.param_data
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    public void setParamData(String paramData) {
        this.paramData = paramData == null ? null : paramData.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pd_item_param_item
     *
     * @mbg.generated Thu Oct 11 11:44:42 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", itemId=").append(itemId);
        sb.append(", itemParamId=").append(itemParamId);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", paramData=").append(paramData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}