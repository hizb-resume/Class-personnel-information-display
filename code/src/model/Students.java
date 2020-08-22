package model;

/**
 * Students entity. @author MyEclipse Persistence Tools
 */

public class Students implements java.io.Serializable {

	// Fields

	private Integer id;
	private String banji;
	private String name;
	private String sex;
	private Integer age;
	private String xuehao;
	private String tel;
	private String picpath;
	private String jianjie;

	// Constructors

	/** default constructor */
	public Students() {
	}

	/** minimal constructor */
	public Students(String banji, String name, String xuehao) {
		this.banji = banji;
		this.name = name;
		this.xuehao = xuehao;
	}

	/** full constructor */
	public Students(String banji, String name, String sex, Integer age,
			String xuehao, String tel, String picpath, String jianjie) {
		this.banji = banji;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.xuehao = xuehao;
		this.tel = tel;
		this.picpath = picpath;
		this.jianjie = jianjie;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBanji() {
		return this.banji;
	}

	public void setBanji(String banji) {
		this.banji = banji;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getXuehao() {
		return this.xuehao;
	}

	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPicpath() {
		return this.picpath;
	}

	public void setPicpath(String picpath) {
		this.picpath = picpath;
	}

	public String getJianjie() {
		return this.jianjie;
	}

	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}

}