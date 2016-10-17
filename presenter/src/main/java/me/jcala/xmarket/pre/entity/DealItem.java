package me.jcala.xmarket.pre.entity;

import java.util.List;

public class DealItem {
    private String id;//商品ID
    private String name;//商品名字
    private UserBean author;//商品所属者
    private List<UserBean> wait_trades;//商品待交易者名单
    private UserBean trade;//商品交易者
    private String create_time;//商品创建时间
    private String donate_time;//商品捐赠时间
    private int status;//商品状态。0:在售，1:售出,2:捐赠
}
