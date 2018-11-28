package com.hryj.entity.vo.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 李道云
 * @className: DistributionProductVO
 * @description: 配送单商品信息VO
 * @create 2018/6/30 11:02
 **/
@Data
@ApiModel(value = "配送单商品信息VO")
public class DistributionProductVO {

    @ApiModelProperty(value = "商品id", required = true)
    private Long product_id;

    @ApiModelProperty(value = "商品名称", required = true)
    private String product_name;

    @ApiModelProperty(value = "商品图片", required = true)
    private String list_image_url;

    @ApiModelProperty(value = "实际价格", required = true)
    private String actual_price;

    @ApiModelProperty(value = "数量", required = true)
    private String quantity;
}
