package com.hryj.entity.vo.promotion.activity.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author 王光银
 * @className: PromotionActivityJoinProductDataResponseVO
 * @description:
 * @create 2018/6/28 0028 14:04
 **/
@ApiModel(value = "活动商品详情数据响应VO", description = "活动商品详情数据响应VO")
@Data
public class PromotionActivityJoinProductDataResponseVO {

    @ApiModelProperty(value = "页码")
    private Integer page_num = 1;

    @ApiModelProperty(value = "每页大小")
    private Integer page_size = 10;

    @ApiModelProperty(value = "总条数")
    private Integer total_count;

    @ApiModelProperty(value = "总页数")
    private Integer total_page;

    @ApiModelProperty(value = "活动商品数据集合")
    private List<JoinProductItemResponseVO> product_list;
}
