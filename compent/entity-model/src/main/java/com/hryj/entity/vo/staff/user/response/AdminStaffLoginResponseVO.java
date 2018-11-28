package com.hryj.entity.vo.staff.user.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 代廷波
 * @className: AdminStaffLoginResponseVO
 * @description: 后台员工登陆返回信息VO
 * @create 2018/06/27 21:51
 **/
@Data
@ApiModel(value = "后台员工登陆返回信息VO")
public class AdminStaffLoginResponseVO {

    @ApiModelProperty(value = "登录token", required = true)
    private String login_token;

    @ApiModelProperty(value = "员工账号", required = true)
    private String staff_account;

    @ApiModelProperty(value = "员工类别", notes = "01-普通员工,02-内置员工", required = true)
    private String staff_type;

    @ApiModelProperty(value = "员工岗位")
    private String staff_job;

    @ApiModelProperty(value = "员工岗位名称")
    private String staff_job_name;

    @ApiModelProperty(value = "手机号码", required = true)
    private String phone_num;

    @ApiModelProperty(value = "员工姓名", required = true)
    private String staff_name;

    @ApiModelProperty(value = "员工照片", required = true)
    private String staff_pic;

    @ApiModelProperty(value = "部门id", required = true)
    private Long dept_id;

    @ApiModelProperty(value = "部门类别", required = true)
    private String dept_type;

    @ApiModelProperty(value = "部门名称", required = true)
    private String dept_name;

    @ApiModelProperty(value = "权限名称集合:\",\"分隔", required = true)
    private String permNameList;

    @ApiModelProperty(value = "权限标识集合:\",\"分隔", required = true)
    private String permFlagList;

    @ApiModelProperty(value = "权限url集合:\",\"分隔", required = true)
    private String permUrlList;

}
