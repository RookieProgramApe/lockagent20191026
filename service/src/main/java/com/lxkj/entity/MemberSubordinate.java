package com.lxkj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * 会员团队
 * </p>
 *
 * @author 一个烧包
 * @since 2019-07-13
 */
@Data
    @EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="MemberSubordinate对象", description="会员团队")
public class MemberSubordinate extends Model<MemberSubordinate> {

private static final long serialVersionUID = 1L;

        @ApiModelProperty(value = "主键")
                    @TableId(value = "id", type = IdType.UUID)
                            private String id;


        @ApiModelProperty(value = "会员ID")
    @TableField("member_id")
                    private String memberId;


        @ApiModelProperty(value = "下级会员ID")
    @TableField("subordinate_member_id")
                    private String subordinateMemberId;


        @ApiModelProperty(value = "层级")
    @TableField("`level`")
                    private Integer level;


        @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
                    private Date createTime;



@Override
protected Serializable pkVal() {
            return this.id;
        }

        }
