package com.source.innerclass2;

class Fan
{
	private boolean runningStatus;
	
	public Switch getSwitch()
	{
		return new Switch()
				{
					public void on()
					{
						runningStatus	=	true;
					}
					
					public void off()
					{
						runningStatus	=	false;
					}
				};
	}
	
	public boolean getRunningStatus()
	{
		return runningStatus;
	}
}
