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
 * TConfirmLogEntity: 数据映射实体定义
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
    table = "t_confirm_log",
    schema = "gts01"
)
public class TConfirmLogEntity extends RichEntity {
  private static final long serialVersionUID = 1L;

  /**
   * 事务id
   */
  @TableId(
      value = "tx_no",
      auto = false
  )
  private String txNo;

  /**
   */
  @TableField("create_time")
  private Date createTime;

  @Override
  public final Class entityClass() {
    return TConfirmLogEntity.class;
  }
}
