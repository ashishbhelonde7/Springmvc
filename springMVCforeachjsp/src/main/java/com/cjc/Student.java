package com.cjc;

public class Student {
	private String fn;
	private String un;
	private String ps;
	public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
	@Override
	public String toString() {
		return "Student [fn=" + fn + ", un=" + un + ", ps=" + ps + "]";
	}
	
	

}
