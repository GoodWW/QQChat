package com.byl.qq.bean;

import java.io.Serializable;

/**
 * 消息实体类
 */
public class ChatInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6240488099748291325L;
	/**   头像对应的资源地址  */
	public int iconFromResId;
	/**   头像下载地址  */
	public String iconFromUrl;
	/**   内容  */
	public String content;
	/**   时间  */
	public String time;
	/**0 是收到的消息，1是发送的消息*/
	public int fromOrTo;
	@Override
	public String toString() {
		return "ChatInfoEntity [iconFromResId=" + iconFromResId
				+ ", iconFromUrl=" + iconFromUrl + ", content=" + content
				+ ", time=" + time + ", fromOrTo=" + fromOrTo + "]";
	}
}
