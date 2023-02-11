package org.tnsif.hierarchicalinheritance;

public class SnowCone extends AndroidVersion {
	
	private int version;
	
	public SnowCone(String type,int version)
	{
		super();
		this.version = version;
	}
	
	public SnowCone(int type,int version)
	{
		super(type);
		this.version = version;
	}
	
	public SnowCone()
	{
		super();
	}
	
	public SnowCone(int type)
	{
		super(type);
	}
	
	public String toString()
	{
		return "SnowCone [version="+ version + ", type=" + type +",getType()=" + getType() + ", toString()=" + super.toString() +"]";
	}
	

}
