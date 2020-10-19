package com.fabiankevin.springboot.mapstructdemo;

import com.fabiankevin.springboot.mapstructdemo.models.Student;
import com.fabiankevin.springboot.mapstructdemo.models.StudentResource;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    @Mapping(target = "fullName", source = "name")
    StudentResource toResource(Student student);
}
