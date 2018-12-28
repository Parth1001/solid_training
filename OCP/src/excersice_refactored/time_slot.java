package excersice_refactored;

import com.meditab.training.ocp.exercise.ResourceType;

public class time_slot {
	
	private static final int INVALID_RESOURCE_ID = -1;
	
	public int allocate()
    {
        int resourceId;
            resourceId = findFreeTimeSlot();
            markTimeSlotBusy(resourceId);
        
        return resourceId;
    }
	
	 public void markTimeSlotFree(int resourceId)
	    {
	    }
	 
	 public void markTimeSlotBusy(int resourceId)
	    {
	    }
	 public int findFreeTimeSlot()
	    {
	        return 0;
	    }

}
