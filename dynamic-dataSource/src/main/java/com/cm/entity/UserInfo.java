package com.cm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author cm.g
 * @date 2020/9/24 16:04
 * @Description: 若没有开启驼峰命名，或者表中列名不符合驼峰规则，
 * 可通过该注解指定数据库表中的列名(如字段名idNum对应表中id_no)，exist标明数据表中有没有对应列:
 * @TableField(value = "id_no",exist = true)
 */
@Getter
@Setter
@TableName
public class UserInfo implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String idNo;
}
