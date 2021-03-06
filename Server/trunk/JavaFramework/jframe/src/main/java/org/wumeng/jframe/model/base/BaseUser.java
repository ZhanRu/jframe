package org.wumeng.jframe.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseUser<M extends BaseUser<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setUserName(java.lang.String userName) {
		set("user_name", userName);
		return (M)this;
	}
	
	public java.lang.String getUserName() {
		return getStr("user_name");
	}

	public M setNickName(java.lang.String nickName) {
		set("nick_name", nickName);
		return (M)this;
	}
	
	public java.lang.String getNickName() {
		return getStr("nick_name");
	}

	public M setPassWord(java.lang.String passWord) {
		set("pass_word", passWord);
		return (M)this;
	}
	
	public java.lang.String getPassWord() {
		return getStr("pass_word");
	}

	public M setPhone(java.lang.String phone) {
		set("phone", phone);
		return (M)this;
	}
	
	public java.lang.String getPhone() {
		return getStr("phone");
	}

	public M setAvatar(java.lang.String avatar) {
		set("avatar", avatar);
		return (M)this;
	}
	
	public java.lang.String getAvatar() {
		return getStr("avatar");
	}

	public M setRegtime(java.lang.Long regtime) {
		set("regtime", regtime);
		return (M)this;
	}
	
	public java.lang.Long getRegtime() {
		return getLong("regtime");
	}

	public M setToken(java.lang.String token) {
		set("token", token);
		return (M)this;
	}
	
	public java.lang.String getToken() {
		return getStr("token");
	}

}
