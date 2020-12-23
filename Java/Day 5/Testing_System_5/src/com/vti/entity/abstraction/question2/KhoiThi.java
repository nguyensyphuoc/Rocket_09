package com.vti.entity.abstraction.question2;

public class KhoiThi {
	private String khoiName;
	private String monThi;
	
	public String getKhoiName() 
	{
		return khoiName;
	}

	public void setKhoiName(String khoiName)
	{
		this.khoiName = khoiName;
	}


	public String getMonThi() {
		if (khoiName.equals("A"))
		{
			monThi = "Toán, Lý, Hóa";
		} else if (khoiName.equals("B"))
		{
			monThi = "Toán, Hóa, Sinh";
		} else if (khoiName.equals("C"))
		{
			monThi = "Văn, Sử, Địa";
		} else 
		{
			monThi = "Không có môn thi và khối thi này";
		}

		return monThi;
	}

}
