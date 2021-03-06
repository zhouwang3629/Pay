/**
 *
 */
package com.vrg.payserver.service.vo;

import com.alibaba.fastjson.JSON;

public class ClientNewRechargeRequest {
	// type 是 String 接口类型，固定为create-order
	private String type;
	/*
	 * partnerId 设备编号
	 */
	private String partnerId;
	
	// 支付渠道id
	private String channelId;
	
	/*
	 * notifyUrl 是  String 支付成功后的通知地址
	 */
	private String notifyUrl;
	
	/*
	 *  paidAmount 否 String 总支付金额(单位分)
	 */
	private String paidAmount;
	
	/*
	 *  customInfo 预留的扩展字段
	 */
	private String customInfo;
	
	/*
	 *  ts 是 String 当前时间戳，秒级，如20150723150028对应2015/7/23 15:00:28
	 */
	private String ts;

	/*
	 *  sign 是 String 签名，签名算法参见签名章节，使用游戏客户端密钥
	 */
	private String sign;
	
	/*
	 *  tradeNo 当前系统的订单号
	 */
	private String tradeNo;
	
	/*
	 *  channelTradeNo 支付渠道侧分配的订单号，预留给银联直接接入使用
	 */
	//private String channelTradeNo;

	// exception info
	private String exceptionInfo;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}

	public String getCustomInfo() {
		return customInfo;
	}

	public void setCustomInfo(String customInfo) {
		this.customInfo = customInfo;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}

	public String getExceptionInfo() {
		return exceptionInfo;
	}

	public void setExceptionInfo(String exceptionInfo) {
		this.exceptionInfo = exceptionInfo;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
}
