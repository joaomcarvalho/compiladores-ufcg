package com.ufcg.compiladores.type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionType extends LiteralType {
	
	private LiteralType returnType;
	private List<LiteralType> paramsTypes;
	
	public FunctionType(LiteralType returnType) {
		super(returnType.getName());
		this.returnType = returnType;
		this.paramsTypes = new ArrayList<>();
	}
	
	public LiteralType getReturnType() {
		return this.returnType;
	}
		
	public void setReturnType(LiteralType newReturnType) {
		this.returnType = newReturnType;
	}
	
	public List<LiteralType> getParamsTypes() {
		return this.paramsTypes;
	}
	
	public void addParam(LiteralType param) {
		this.paramsTypes.add(param);
	}
	
	public void addParams(List<LiteralType> type) {
		this.paramsTypes.addAll(type);
	}
	
	@Override
	public String toString() {
		return Arrays.toString(this.paramsTypes.toArray());
	}
}
