package org.tnsif.hierarchicalinheritance;

public class Tiramisu extends AndroidVersion {
	private int version;
	
	public int getVersion()
	{
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	public Tiramisu(int type , int version)
	{
		super(type);
		this.version = version;
	}
	
	public Tiramisu()
	{
		super();
	}
	
	public String toString()
	{
		return "Tiramisu [version=" + version + ", type=" + type +", getVersion()=" + getVersion() + ", getType()=" + getType() + ", toString()="+ super.toString() + "]";
	}

}
