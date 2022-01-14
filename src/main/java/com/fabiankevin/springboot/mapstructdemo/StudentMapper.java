package com.fabiankevin.springboot.mapstructdemo;

import com.fabiankevin.springboot.mapstructdemo.models.Student;
import com.fabiankevin.springboot.mapstructdemo.models.StudentResource;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = UUID.class)
public interface StudentMapper {
    @Mapping(target = "fullName", source = "name")
    @Mapping(target = "id", expression = "java( UUID.randomUUID().toString() )")
    StudentResource toResource(Student student);
}
