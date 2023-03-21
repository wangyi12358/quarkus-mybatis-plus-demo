package com.example.handler

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler
import org.apache.ibatis.reflection.MetaObject
import java.util.*

class MetaHandler: MetaObjectHandler {

    override fun insertFill(metaObject: MetaObject?) {
        setFieldValByName("createTime", Date().time, metaObject)
        setFieldValByName("updateTime", Date().time, metaObject)
    }

    override fun updateFill(metaObject: MetaObject?) {
        setFieldValByName("updateTime", Date().time, metaObject)
    }
}