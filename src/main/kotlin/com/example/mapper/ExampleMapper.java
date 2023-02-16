package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.Example;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExampleMapper extends BaseMapper<Example> {
}
