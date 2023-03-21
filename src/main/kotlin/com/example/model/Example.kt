package com.example.model

import com.baomidou.mybatisplus.annotation.*

@TableName("example")
class Example {

    @TableId(type = IdType.AUTO)
    var id: Long? = null

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    var createTime: Long? = null

    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    var updateTime: Long? = null
}