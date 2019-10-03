public class Eagle extends Bird implements Fly
{

    private boolean flying;
    private int altitude;

    	public Eagle(String name) 
	{
		super(name);
		this.flying = false;
		this.altitude = 0;
    	}

    	public int getAltitude() 
	{
        	return altitude;
    	}

    	public boolean isFlying() 
	{
        	return flying;
    	}

    	@Override
   	public String sing() 
	{
        	return "Screech!";
    	}

 	
   	public void takeOff() 
	{
		if (!this.flying && this.altitude == 0) {
			this.flying = true;
			System.out.printf("%s takes off in the sky.%n", this.getName());
		}
	}


 
   	@Override
    	public int ascend(int meters) 
	{
		if (this.flying) 
		{
		    this.altitude = Math.min(this.altitude + meters, 325);
		    System.out.printf("%s cherry flies upward, altitude : %d%n", this.getName(), this.altitude);
       	 	}
       		return this.altitude;
    	}

    
    	@Override
    	public int descend(int meters) 
	{
		if (this.flying) 
		{
		    this.altitude = Math.max(this.altitude - meters, 0);
		    System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
		}
        	return this.altitude;
    	}

    
    	@Override
    	public void land() 
	{
		if (this.altitude > 1) 
		{
		    System.out.println(this.getName() + " is too high, it can't land. ");
		}
		else 
		{
		    System.out.println(this.getName() + " lands on the ground. ");
		}
	}
   	@Override
	public void glide() 
	{
		Fly.super.glide();
	}
}
