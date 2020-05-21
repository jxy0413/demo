package com.example.demo.mapper;

import com.example.demo.model.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Auther jxy
 * @Date 2020-04-14
 */
@Mapper
public interface TestMapper {


    @Insert("insert into jxy_zhihang(id,name) values (#{id},#{name})")
    public void insertzhihang(JxyZhihang jxyZhihangy);


    @Insert("insert into jxy_bank(id,name,zhihang_id) values (#{id},#{name},#{zhihangId})")
    public void insertbank(JxyBank jxyBank);

    @Insert("insert into jxy_user(id,name,card,city,street,zhanghu_id) values (#{id},#{name},#{card},#{city},#{street},#{zhanghuId})")
    void insertUser(JxyUser jxyUser);

    @Insert("insert into jxy_zhanghu(id,leixing,money) values (#{id},#{leixing},#{money})")
    void insertZhanghu(Jxyzhanghu jxyzhanghu);

    @Select("select * from jxy_zhihang")
    List<JxyZhihang> getListZhihang();

    @Insert("insert into jxy_department(id,name,zhihang,owner) values (#{id},#{name},#{zhihang},#{owner})")
    void insertDepartment(JxyDepartment jxyDepartment);

    @Select("select * from jxy_department")
    List<JxyDepartment> getListDepartment();

    @Insert("insert into jxy_employee(id,name,tel,idcard,address,department,department_owner,create_time) values (#{id},#{name},#{tel},#{idcard},#{address},#{department},#{departmentOwner},#{createTime})")
    void insertEmployee(JxyEmployee jxyEmployee);

    @Select("select * from jxy_department where name=#{name}")
    JxyDepartment getDepartmentByName(String name);

    @Select("select * from jxy_employee")
    List<JxyEmployee> getEmployeeList();

    @Select("select * from jxy_zhanghu")
    List<Jxyzhanghu> getListZhanghu();

    @Update({"<script>",
            "update jxy_zhanghu set  ",
            "<if test='leixing != null'>leixing = #{leixing}</if>",
            "<if test='money != null'>,money = #{money}</if>",
            "where id = #{id}",
            "</script>"
    })
    void updatezhanghu(Jxyzhanghu jxyzhanghu);

    @Insert("insert into jxy_liushui(id,employee_id,zhanghu_id,operate,operate_time) values (#{id},#{employeeId},#{zhanghuId},#{operate},#{operateTime})")
    void insertLiushui(JxyLiushui jxyLiushui);
}
