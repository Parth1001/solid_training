package excersice_refactored;

import com.meditab.training.ocp.exercise.ResourceType;

public class space_slot {
	
	private static final int INVALID_RESOURCE_ID = -1;
	
	public int allocate()
    {
        int resourceId;
            resourceId = findFreeSpaceSlot();
            markSpaceSlotBusy(resourceId);
        
        return resourceId;
    }
	
	 public void markSpaceSlotFree(int resourceId)
	    {
	    }
	 
	 public void markSpaceSlotBusy(int resourceId)
	    {
	    }
	 public int findFreeSpaceSlot()
	    {
	        return 0;
	    }

}
