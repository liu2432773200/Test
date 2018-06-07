package cn.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
	@Insert("INSERT INTO `bookmanage`(b_name) VALUE(#{name})")
	int add(String name);
}
