package com.mxh.banktransfer.orm.entity;

import cn.org.atool.fluent.mybatis.annotation.FluentMybatis;
import cn.org.atool.fluent.mybatis.annotation.TableField;
import cn.org.atool.fluent.mybatis.annotation.TableId;
import cn.org.atool.fluent.mybatis.base.RichEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * TBankFreezeEntity: 数据映射实体定义
 *
 * @author Powered By Fluent Mybatis
 */
@SuppressWarnings({"rawtypes", "unchecked"})
@Data
@Accessors(
    chain = true
)
@EqualsAndHashCode(
    callSuper = false
)
@FluentMybatis(
    table = "t_bank_freeze",
    schema = "gts01"
)
public class TBankFreezeEntity extends RichEntity {
  private static final long serialVersionUID = 1L;

  /**
   * 主键 自增列
   */
  @TableId("id")
  private Integer id;

  /**
   * 账户类型：1 人民币账户，2 美元账户
   */
  @TableField("account_type")
  private Integer accountType;

  /**
   * 客户余额 单位 分
   */
  @TableField("amount")
  private Long amount;

  /**
   * 创建时间
   */
  @TableField("create_time")
  private Date createTime;

  /**
   * 用户编号
   */
  @TableField("customer_id")
  private Integer customerId;

  /**
   * 数据是否有效标识：1有效数据，2 无效数据
   */
  @TableField("is_validate")
  private Integer isValidate;

  /**
   * 最后修改时间
   */
  @TableField("update_time")
  private Date updateTime;

  @Override
  public final Class entityClass() {
    return TBankFreezeEntity.class;
  }
}
