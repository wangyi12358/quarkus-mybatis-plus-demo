package com.example.handler

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler
import io.quarkus.logging.Log
import org.apache.ibatis.reflection.MetaObject
import java.util.Date

class MetaHandler: MetaObjectHandler {

    override fun insertFill(metaObject: MetaObject?) {
        Log.info("insertFill")
        this.setFieldValByName("create_time", Date().time, metaObject)
        this.setFieldValByName("update_time", Date().time, metaObject)
    }

    override fun updateFill(metaObject: MetaObject?) {
        this.setFieldValByName("update_time", Date().time, metaObject)
    }
}