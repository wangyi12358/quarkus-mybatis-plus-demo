package com.example.model

import com.baomidou.mybatisplus.annotation.FieldFill
import com.baomidou.mybatisplus.annotation.TableField
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName

@TableName("example")
class Example {

    @TableId
    var id: Long? = null

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    var createTime: Long? = null

    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    var updateTime: Long? = null
}