package com.lxkj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品规格库存
 * </p>
 *
 * @author 一个烧包
 * @since 2019-07-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "CargoSku对象", description = "商品规格库存")
public class CargoSku extends Model<CargoSku> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "规格ID")
    @TableId(value = "id", type = IdType.UUID)
    private String id;


    @ApiModelProperty(value = "商品ID",hidden = true)
    @TableField("cargo_id")
    private String cargoId;


    @ApiModelProperty(value = "规格名称")
    @TableField("`name`")
    private String name;

    @ApiModelProperty(value = "规格价格")
    @TableField("`price`")
    private String price;


    @ApiModelProperty(value = "库存数量")
    @TableField("inventory")
    private Integer inventory;


    @ApiModelProperty(value = "0 下架，1 上架",hidden = true)
    @TableField("status")
    private Integer status;


    @ApiModelProperty(value = "创建时间",hidden = true)
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "左开右开存放")
    @TableField("lock_type")
    private String lockType;



    @Override
    protected Serializable pkVal() {
        return this.id;
    }


}
