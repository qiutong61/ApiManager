package cn.crap.dto;

import cn.crap.enumeration.MenuType;
import cn.crap.utils.MyString;

import java.io.Serializable;
import java.util.Date;

public class MenuDto{
    private String id;
    private String menuName;
    private String menuUrl;
    private String roleIds;
    private String parentId;
    private String iconRemark;
    private String type;
    private Byte status;
    private Integer sequence;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getIconRemark() {
        return iconRemark;
    }

    public void setIconRemark(String iconRemark) {
        this.iconRemark = iconRemark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getTypeName(){
        if(!MyString.isEmpty(type))
            return MenuType.valueOf(type).getName();
        return "";
    }
}